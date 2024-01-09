package com.shatteredpixel.shatteredpixeldungeon.custom.utils;

import static com.shatteredpixel.shatteredpixeldungeon.levels.RegularLevel.birthday;
import static com.shatteredpixel.shatteredpixeldungeon.levels.RegularLevel.holiday;

import com.nlf.calendar.Lunar;
import com.nlf.calendar.Solar;
import com.shatteredpixel.shatteredpixeldungeon.levels.RegularLevel;

import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.TimeInfo;
import org.apache.commons.net.ntp.TimeStamp;

import java.io.IOException;
import java.net.InetAddress;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.Calendar;

public class Gregorian {

    /**
     * 这个代码是基于6Tail的农历Java库<br>
     * 皆在计算中国的传统节日，<br>
     * 使地牢自动计算农历日期成为可能<br>
     * 目前已经实现端午节 中秋节 作者自身的生日等<br>
     * <P></P>
     * 要在地牢中使用该代码，<br>
     * 你需要在core级gradle导入指定的库<br>
     * 然后，使用这个库<br>
     * 最后调用在你需要的位置即可<br>
     * <P></P>
     * 实列参见RegularLevel.java：<br>
     *  Gregorian.LunarCheckDate();<br>
     *   <br>
     *  Gradle Config:<br>
     *  build.gradle (Module:core) <br>
     *  implementation 'cn.6tail:lunar:1.3.6'<br>
     *  <P></P>
     *  <a href="https://mvnrepository.com/artifact/cn.6tail/lunar">Lunar Maven</a><br>
     *  <a href="https://github.com/6tail/lunar-java/releases">Lunar Release</a><br>
     *  <a href="https://github.com/6tail/lunar-java">Lunar Github</a>
     *  2024.1.9 加入NTP验证系统时间
     * */
    @SuppressWarnings("NewApi")
    public static void LunarCheckDate() {
        try {
            NTPUDPClient timeClient = new NTPUDPClient();
            String timeServerUrl = "ntp.aliyun.com";
            InetAddress timeServerAddress = InetAddress.getByName(timeServerUrl);
            TimeInfo timeInfo = timeClient.getTime(timeServerAddress);
            TimeStamp timeStamp = timeInfo.getMessage().getTransmitTimeStamp();

            @SuppressWarnings("NewApi")
            Instant ntpInstant = Instant.ofEpochMilli(timeStamp.getDate().getTime());
            @SuppressWarnings("NewApi")
            Clock systemClock = Clock.systemDefaultZone();
            @SuppressWarnings("NewApi")
            Instant systemInstant = Instant.now(systemClock);

            // NTP协同验证 误差最多1s
            if (ntpInstant.equals(systemInstant) || Math.abs(Duration.between(ntpInstant, systemInstant).toMillis()) < 1000) {
                Calendar calendar = Calendar.getInstance();
                Solar date = Solar.fromDate(calendar.getTime());
                Lunar lunar = date.getLunar();

                boolean isZQJ = lunar.getMonth() == 8 && (lunar.getDay() >= 15 - 10 && lunar.getDay() <= 15 + 12);

                boolean isZQJ_FK = (lunar.getMonth() == 11 && (lunar.getDay() >= 17 && lunar.getDay() <= 17 + 12) || lunar.getMonth() == 12 && (lunar.getDay() >= 1) && lunar.getDay() <= 1 + 24);

                boolean isDevBirthday = lunar.getMonth() == 8 && lunar.getDay() >= 22 && lunar.getDay() <= 25;
                boolean isDWJ = lunar.getMonth() == 5 && (lunar.getDay() >= 5 - 3 && lunar.getDay() <= 5 + 7);

                boolean isSF = lunar.getMonth() == 1 && (lunar.getDay() >= 1 && lunar.getDay() <= 1 + 16);

                // 判断是否是中秋节前10天到中秋节后12天
                if (isZQJ || isZQJ_FK) {
                    holiday = RegularLevel.Holiday.ZQJ;
                }
                // 判断是否是开发组的开发者Ling的当天生日到后续三天-8-22--8.25
                if (isDevBirthday) {
                    birthday = RegularLevel.DevBirthday.DEV_BIRTHDAY;
                }
                // 判断是否是端午节前3天到端午节后7天
                if (isDWJ) {
                    holiday = RegularLevel.Holiday.DWJ;
                }
            }
        } catch (IOException e) {
        }
    }

}
