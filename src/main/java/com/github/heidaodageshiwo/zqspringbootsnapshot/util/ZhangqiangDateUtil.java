package com.github.heidaodageshiwo.zqspringbootsnapshot.util;

import java.text.SimpleDateFormat;
import java.util.Date;


public class ZhangqiangDateUtil {


	public static String formatDate(Date date,String format){
		String result="";
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		if(date!=null){
			result=sdf.format(date);
		}
		return result;
	}
	

	public static Date formatString(String str,String format) throws Exception{
		if(StringUtil.isEmpty(str)){
			return null;
		}
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		return sdf.parse(str);
	}

	public static String getCurrentDateStr(){
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmssSSS");
		return sdf.format(date);
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(getCurrentDateStr());
	}
	
}
