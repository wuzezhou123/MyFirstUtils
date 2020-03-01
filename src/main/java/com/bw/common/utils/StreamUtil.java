package com.bw.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.List;

public class StreamUtil {
	public static List<String> read(File file,String charsetName) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),charsetName));
		List<String> list=new ArrayList<>();
		String str="";
		while((str=br.readLine())!=null) {
			list.add(str);
		}
		br.close();
		return list;
	}
	 public static List<String> read(InputStream InputStream,String charsetName) throws IOException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(InputStream,charsetName));
			List<String> list=new ArrayList<>();
			String str="";
			while((str=br.readLine())!=null) {
				list.add(str);
			}
			br.close();
			return list;
			
		}
		
		public static List<String> read(String filePath,String charsetName) throws IOException{
			 BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath),charsetName));
				List<String> list=new ArrayList<>();
				String str="";
				while((str=br.readLine())!=null) {
					list.add(str);
				}
				br.close();
				return list;
			
		}
}
