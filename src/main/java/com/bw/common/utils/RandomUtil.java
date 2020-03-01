package com.bw.common.utils;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/**
 * 随机数工具类
 * */
public class RandomUtil {
	public static int random(int min, int max){
		Random random = new Random();
		int r = random.nextInt(max-min+1)+min;
		return r;
		}
		//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
		public static int[] subRandom (int min, int max, int subs){
			int [] x=new int[subs];
		
			Set<Integer> set=new LinkedHashSet<>();
			while(set.size()!=subs) {
				set.add(RandomUtil.random(min,max));	
			}
			Object[] array = set.toArray();
			for(int j=0;j<set.size();j++) {
				x[j]=(int)array[j];
			}
			return x;
		}
		//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
		public static char randomCharacter (){
			String arr="123456789zxcvbnmasdfghjklqwertyuiopZXCVBNMASDFGHJKLQWERTYUIOP";
			char random = arr.charAt(RandomUtil.random(0,arr.length()-1));
		return (char) random;
		}
		//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
		public static String randomString(int length){
			String arr="";
			for(int i=0;i<length;i++) {
				char rc = RandomUtil.randomCharacter();
				arr+=rc;
			}
			
			
		return arr;
		}


}
