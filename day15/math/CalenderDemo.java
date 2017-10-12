package cn.itsource.math;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalenderDemo {

	public static void main(String[] args) throws ParseException {
//		Calendar是抽象类，先获取calendar对象
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int moth = c.get(Calendar.MONTH)+1;//系统月从0开始计算，应该在外面加1
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "年" + moth+ "月 " +day + "日");
		
//		强行设施日历时间
		String string = "2017-11-11";
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date date = simpleDateFormat.parse(string);//解析时间
		c.setTime(date);
		int year2 = c.get(Calendar.YEAR);
		int moth2 = c.get(Calendar.MONTH)+1;//系统月从0开始计算，应该在外面加1
		int day2 = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year2 + "年" + moth2+ "月 " +day2 + "日");
	}
}
