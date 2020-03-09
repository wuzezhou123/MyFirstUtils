package com.bw.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testGetPlaceholderValue() {
		String str = StringUtil.getPlaceholderValue("http://news.cnstock.com/news,yw-201908-4413224.htm","\\d+\\.htm");
	System.out.println(str);
	}

}
