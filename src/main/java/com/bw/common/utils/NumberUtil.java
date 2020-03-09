package com.bw.common.utils;

public class NumberUtil {
		public static int ratio(int current,int sum) {
			int round = Math.round(current*1.0f/sum*100);
			return round;
		}
}
