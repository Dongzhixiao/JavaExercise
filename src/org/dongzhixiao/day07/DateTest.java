package org.dongzhixiao.day07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @author Administrator
 * Date维护一个long值，从1970年1月1日零时到现在的毫秒数
 */
public class DateTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
		
		long time =  date.getTime();
		System.out.println(time);
		/**
		 * 千年虫问题：
		 */
		int year = date.getYear(); //方法不建议使用，会有横线！
		
		//现在计算日期要使用Calendar类！
		//会自行决定时区，创建一个实例，其本身是抽象类，获取的是一个子类
		Calendar calendar = Calendar.getInstance();
		//使用getTime可以返回Date实例
		Date now = calendar.getTime();
		System.out.println(now);
		
		//通过Calendar计算时间比较简单
		calendar.set(Calendar.YEAR, 2019);
		calendar.set(Calendar.MONTH, 11);//设置月份从0开始，因此是12月
		System.out.println(calendar.getTime());
		
		calendar.add(calendar.DAY_OF_YEAR, -22);
		
		int Year = calendar.get(Calendar.YEAR);
		int Month = calendar.get(calendar.MONTH);
		int Day = calendar.get(calendar.DAY_OF_MONTH);
		//month要处理
		System.out.println(Year+"年"+(Month+1)+"月"+Day+"日");
	
		/**
		 * SimpleDateFormat类   (是DateFormat的子类)
		 * 可以方便进行字符串和日期类的转换
		 * yyyy-MM-dd 2012-11-23
		 * yy-MM-dd   12-12-30
		 * yy-MM-dd hh:mm:ss  12-12-30 03:20:23
		 */
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy-MM-dd");
		String dateFormat = "2013-05-14";
		Date D = sdf.parse(dateFormat); //需要抛出异常
		System.out.println(D);
		//反着来
		SimpleDateFormat sdf1 = 
				new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String nowStr = sdf1.format(date);
		System.out.println(nowStr);
	}

}
