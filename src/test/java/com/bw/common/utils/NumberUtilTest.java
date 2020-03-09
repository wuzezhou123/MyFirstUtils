package com.bw.common.utils;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class NumberUtilTest {
	BigDecimal a;
	@Test
	public void test() {
		int r = NumberUtil.ratio(33,77);
		a=new BigDecimal(r);
		System.out.println(a);
	}

}
