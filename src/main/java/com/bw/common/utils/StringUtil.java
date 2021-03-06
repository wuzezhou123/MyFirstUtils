package com.bw.common.utils;

import java.io.UnsupportedEncodingException;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * �ַ���������
 * */
public class StringUtil {
	public static String getValue(String str,int start){
		String str1 = str.substring(start);
		String str2="";
		for(int i=0;i<str1.length();i++) {
			str2+="*";
		}
		
		return str.substring(0,2)+str2;
	}
	//����1���ж�Դ�ַ����Ƿ���ֵ��������(�հ��ַ���)Ҳ��ûֵ (5��)
	public static boolean hasLength(String src){
		if(src==null) {
			return false;
		}
	
		if(src.equals("")) {
			return false;
		}
		return true;
	}
		
	
	//����2���ж�Դ�ַ���	
	public static boolean hasText(String src){
		
		if(src==null) {
			return false;
		}
		String trim = src.trim();
		if(trim.equals("")) {
			return false;
		}
		return src.length()>0;
	}
	//����3�����ز���length�����ĺ����ַ������ַ���������GB2312(�൱�����ļ���)��Χ�ڣ����硰��ѽ����(5��)
	public static String randomChineseString(int length){
		String arr="";
		for(int i=0;i<length;i++) {
			arr+=StringUtil.getChineseChar();
		}
		return arr;
	}
	private static char getChineseChar() {
		 String str = "";
		    int hightPos; //
		    int lowPos;
		    Random random = new Random();
		    hightPos = (176 + Math.abs(random.nextInt(39)));
		    lowPos = (161 + Math.abs(random.nextInt(93)));
		    byte[] b = new byte[2];
		    b[0] = (Integer.valueOf(hightPos)).byteValue();
		    b[1] = (Integer.valueOf(lowPos)).byteValue();
		    try {
		      str = new String(b, "GBK");
		    } catch (UnsupportedEncodingException e) {
		      e.printStackTrace();
		      System.out.println("����");
		    }
		    return str.charAt(0);
	}
	//����4������������������������ʵ�տ�ͷ���ټ����ڡ��������ټ��ա����ʹ��1-2���������(8��)���ڲ�����randomChineseString()����(3��)������ʾ��������ѽ��������ŷ����Ϊ��
	public static String generateChineseName(){
		String baiJiaXing[]= {"��","Ǯ","��","��","��","��","֣","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","ʩ","��","��","��","��","��","��","κ","��","��","��","л","��","��","��","ˮ","�","��","��","��","��","��","��","��","��","��","³","Τ","��","��","��","��","��","��","��","��","Ԭ","��","ۺ","��","ʷ","��","��","��","�","Ѧ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","ʱ","��","Ƥ","��","��","��","��","��","Ԫ","��","��","��","ƽ","��","��","��","��","��","Ҧ","��","տ","��","��","ë","��","��","��","��","��","�","��","��","��","��","̸","��","é","��","��","��","��","��","��","ף","��","��","��","��","��","��","ϯ","��","��","ǿ","��","·","¦","Σ","��","ͯ","��","��","÷","ʢ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","֧","��","��","��","¬","Ī","��","��","��","��","��","��","Ӧ","��","��","��","��","��","��","��","��","��","��","��","��","ʯ","��","��","ť","��","��","��","��","��","��","½","��","��","��","��","�","��","��","�L","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","ɽ","��","��","��","�","��","ȫ","ۭ","��","��","��","��","��","��","��","��","��","��","��","б","��","��","��","��","��","��","��","ղ","��","��","Ҷ","��","˾","��","۬","��","��","��","ӡ","��","��","��","��","ۢ","��","��","��","��","��","��","׿","��","��","��","��","��","��","��","��","��","��","˫","��","ݷ","��","��","̷","��","��","��","��","��","��","��","Ƚ","��","۪","Ӻ","�S","�","ɣ","��","�","ţ","��","ͨ","��","��","��","��","ۣ","��","��","ũ","��","��","ׯ","��","��","��","��","��","Ľ","��","��","ϰ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","»","��","��","ŷ","�","��","��","ε","Խ","��","¡","ʦ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","ɳ","ؿ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","Ȩ","��","��","��","��","��","��","��","��","��","��","۳","Ϳ","��","��","˧","��","��","��","��","��","��","��","Ĳ","��","٦","��","��","ī","��","��","��","��","��","��","١","��ٹ","˾��","�Ϲ�","ŷ��","�ĺ�","���","����","����","����","�ʸ�","ξ��","����","�̨","��ұ","����","���","����","����","̫��","����","����","����","��ԯ","���","����","����","����","Ľ��","����","����","˾ͽ","˾��","آ��","˾��","��","��","�ӳ�","���","��ľ","����","����","���","����","����","����","�ذ�","�й�","�׸�","����","�θ�","����","����","����","����","��","��","����","΢��","����","����","����","����","�Ϲ�"};
		int random = RandomUtil.random(0,baiJiaXing.length-1);
		
		return baiJiaXing[random]+StringUtil.randomChineseString(2);

	}
	public static boolean isPhone(String str) {
		String reg="^1[34578]\\d{9}$";
		return str.matches(reg);
	}
	public static boolean isEmail(String str) {
		String reg="^\\w+@\\w+(\\.com|\\.cn)+$";
		return str.matches(reg);
	}
	public static boolean isNumber(String str) {
		String reg="^(-|\\+)?\\d+(\\.\\d+)?$";
		str = str.trim();
		return str.matches(reg);
	}
	
	
	/*
	* �������ܣ������������ַ�����ȡһ��ֵ�����ں�����url��ַ����ȡIDֵ��
	* �����ڡ�http://news.cnstock.com/news,yw-201908-4413224.htm���ѡ�4413224����ȡ������
	*/
	public static String getPlaceholderValue(String src, String regex){
		
		src=src.substring(0,src.indexOf(".htm")+4);
		String[] sp2 = src.split("-");
		String str="";
		for(String i:sp2) {
			boolean b = i.matches(regex);
			if(b==true) {
				str=i.substring(0,i.indexOf(".htm"));
			}
		}
		
		return str;
	}

}
