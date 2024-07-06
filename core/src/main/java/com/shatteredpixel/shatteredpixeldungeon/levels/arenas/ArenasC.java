/*
 * Pixel Dungeon
 * Copyright (C) 2012-2015 Oleg Dolya
 *
 * Shattered Pixel Dungeon
 * Copyright (C) 2014-2019 Evan Debenham
 *
 * Rivals Pixel Dungeon
 * Copyright (C) 2019-2020 Marshall M.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.shatteredpixel.shatteredpixeldungeon.levels.arenas;

public class ArenasC extends LastLevelArenas {
	
	//phase 3
	protected static final int[] MAP_3_1 = {
		c,c,c,c,c,c,c,  c,c,c,c,c,c,W,W,W,W,W,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,G,G,e,e,e,G,G,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,B,G,G,G,e,e,e,G,G,G,B,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,B,G,G,G,G,e,e,e,G,G,G,G,B,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,G,G,B,W,W,e,m,e,W,W,B,G,G,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,w,G,G,W,t,m,m,t,m,m,t,W,G,G,w,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,w,w,G,W,m,t,m,m,m,t,m,W,G,w,w,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,w,w,w,e,m,m,m,t,m,m,m,e,w,w,w,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,w,w,w,m,t,m,t,B,t,m,t,m,w,w,w,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,w,w,w,e,m,m,m,t,m,m,m,e,w,w,w,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,w,w,G,W,m,t,m,m,m,t,m,W,G,w,w,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,w,G,G,W,t,m,m,t,m,m,t,W,G,G,w,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,G,G,B,W,W,e,m,e,W,W,B,G,G,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,B,G,G,G,G,e,e,e,G,G,G,G,B,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,B,G,G,G,e,e,e,G,G,G,B,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,G,G,e,e,e,G,G,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,W,W,W,W,W,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c
	};
	
	protected static final int[] MAP_3_2 = {
		c,c,c,c,c,c,c,  c,c,c,c,c,W,W,W,W,W,W,W,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,w,w,w,c,c,e,e,e,e,e,c,c,w,w,w,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,w,w,w,w,w,e,e,e,e,e,w,w,w,w,w,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,w,w,w,B,w,e,e,e,e,e,w,B,w,w,w,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,w,B,B,w,w,s,s,s,w,w,B,B,w,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,t,m,t,B,B,G,s,s,s,G,B,B,t,m,t,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,m,m,m,B,G,G,s,s,s,G,G,B,m,m,m,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,m,t,m,g,G,G,s,s,s,G,G,g,m,t,m,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,t,m,t,g,G,G,s,s,s,G,G,g,t,m,t,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,m,t,m,g,G,G,s,s,s,G,G,g,m,t,m,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,m,m,m,B,G,G,s,s,s,G,G,B,m,m,m,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,t,m,t,B,B,G,s,s,s,G,B,B,t,m,t,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,w,B,B,w,w,s,s,s,w,w,B,B,w,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,w,w,w,B,w,e,e,e,e,e,w,B,w,w,w,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,w,w,w,w,w,e,e,e,e,e,w,w,w,w,w,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,w,w,w,c,c,e,e,e,e,e,c,c,w,w,w,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,W,W,W,W,W,W,W,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c
	};
	
	protected static final int[] MAP_3_3 = {
		c,c,c,c,c,c,c,  c,c,c,W,W,W,W,W,W,W,W,W,W,W,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,w,w,e,e,e,e,e,e,e,e,e,G,G,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,w,w,w,e,e,e,e,e,e,e,e,e,G,G,G,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,w,w,w,e,e,e,e,e,e,e,e,e,G,G,G,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,w,w,W,W,s,W,W,s,W,W,s,W,W,G,G,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,w,w,W,c,s,c,c,s,c,c,s,c,W,G,G,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,w,w,s,s,m,m,t,m,t,m,m,s,s,G,G,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,w,w,W,c,t,m,m,m,m,m,t,c,W,G,G,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,e,e,W,c,m,t,m,t,m,t,m,c,W,e,e,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,G,G,W,c,t,m,m,m,m,m,t,c,W,w,w,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,G,G,s,s,m,m,t,m,t,m,m,s,s,w,w,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,G,G,W,c,s,c,c,s,c,c,s,c,W,w,w,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,G,G,W,W,s,W,W,s,W,W,s,W,W,w,w,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,G,G,G,e,e,e,e,e,e,e,e,e,w,w,w,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,G,G,G,e,e,e,e,e,e,e,e,e,w,w,w,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,G,G,e,e,e,e,e,e,e,e,e,w,w,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,W,W,W,W,W,W,W,W,W,W,W,c,c,c,  c,c,c,c,c,c,c,c,
		
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c
	};
	
	protected static final int[] MAP_3_4 = {
		c,c,c,c,c,c,c,  W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  W,E,t,G,m,w,B,e,e,e,B,w,m,G,t,E,W,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  W,t,w,m,w,G,m,e,e,e,m,G,w,m,w,t,W,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  W,G,m,t,G,m,w,e,e,e,w,m,G,t,m,G,W,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  W,m,w,G,m,t,G,s,s,s,G,t,m,G,w,m,W,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  W,w,G,m,t,w,B,s,s,s,B,w,t,m,G,w,W,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  W,B,m,w,G,B,W,s,s,s,W,B,G,w,m,B,W,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  W,e,e,e,B,B,S,s,s,s,S,B,B,e,e,e,W,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  W,e,E,e,B,B,s,s,p,s,s,B,B,e,E,e,W,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  W,e,e,e,B,B,S,s,s,s,S,B,B,e,e,e,W,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  W,B,m,w,G,B,W,s,s,s,W,B,G,w,m,B,W,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  W,w,G,m,t,w,B,s,s,s,B,w,t,m,G,w,W,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  W,m,w,G,m,t,G,s,s,s,G,t,m,G,w,m,W,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  W,G,m,t,G,m,w,e,e,e,w,m,G,t,m,G,W,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  W,t,w,m,w,G,m,e,e,e,m,G,w,m,w,t,W,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  W,E,t,G,m,w,B,e,e,e,B,w,m,G,t,E,W,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,  c,c,c,c,c,c,c,c,
		
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,  c,c,c,c,c,c,c,c,
		
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,
		c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c
	};
}
