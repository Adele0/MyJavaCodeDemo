package cn.itsource.math;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		System.out.println(new Date());
		
		System.out.println(new Date(System.currentTimeMillis()));
		
//		求明天现在这个时间 1天=24*60*60*1000毫秒
		System.out.println(new Date(System.currentTimeMillis() + 86400000));
		
		System.out.println("-------——————");
		System.out.println(new SimpleDateFormat().format(new Date()));
//		换掉默认格式
		
		String pattern = "yyyy-MM-dd HH:mm:ss E";
		SimpleDateFormat sdFormat = new SimpleDateFormat(pattern);
		String string = sdFormat.format(new Date());
		System.out.println(string);
		
//		将某一特定格式换变成模板--解析文本
		String string2 = "2017年11月11日 11:11:11 Mon";//字符串不能比模式的内容少，对应不上
		String pattern2 = "yyyy年MM月dd日 HH:mm:ss E";//可以只要年月日，剩下的已默认打印
		SimpleDateFormat sDateFormat = new SimpleDateFormat(pattern2);
		Date date = sDateFormat.parse(string2);
		System.out.println(date);
	}

}
