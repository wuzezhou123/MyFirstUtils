package com.bw.common.utils;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/**
 * �����������
 * */
public class RandomUtil {
	public static int random(int min, int max){
		Random random = new Random();
		int r = random.nextInt(max-min+1)+min;
		return r;
		}
		//����2������Сֵmin�����ֵmax֮���ȡsubs�����ظ����������������1-10֮��ȡ3�����ظ������������ô[2,6,9]�ǶԵģ�[3,5,5]�򲻶ԣ���Ϊ5�ظ��ˡ�Ӧ�ó�������100ƪ���������ȡ10ƪ���£��¿����ܻ�ʹ�õ��� (8��)
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
		//����3������1��1-9,a-Z֮�������ַ��� (8��)
		public static char randomCharacter (){
			String arr="123456789zxcvbnmasdfghjklqwertyuiopZXCVBNMASDFGHJKLQWERTYUIOP";
			char random = arr.charAt(RandomUtil.random(0,arr.length()-1));
		return (char) random;
		}
		//����4�����ز���length���ַ���(5��)�������ڲ�Ҫ����randomCharacter()���� (4��)
		public static String randomString(int length){
			String arr="";
			for(int i=0;i<length;i++) {
				char rc = RandomUtil.randomCharacter();
				arr+=rc;
			}
			
			
		return arr;
		}


}
