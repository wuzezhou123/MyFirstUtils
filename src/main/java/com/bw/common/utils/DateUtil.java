package com.bw.common.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	public static Date RandomDate(Date min,Date max) {
		long t1 = min.getTime();
		long t2 = max.getTime();
		long random=(long)(Math.random()*(t2-t1+1)+t1);
		
		return new Date(random);
	}
	public static Date firstMath(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.DAY_OF_MONTH,1);
		/*
		 * c.set(Calendar.HOUR_OF_DAY,0); c.set(Calendar.MINUTE,0);
		 */
		Date d = c.getTime();
		return d;
	}
	public static Date endMath(Date date) {
		Calendar ins = Calendar.getInstance();
		date=DateUtil.firstMath(date);
		ins.setTime(date);
		ins.add(Calendar.MONTH,1);
		ins.add(Calendar.DAY_OF_MONTH,-1);
		return ins.getTime();
	}
}
