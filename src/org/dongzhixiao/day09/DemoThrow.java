package org.dongzhixiao.day09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author Administrator
 * throw关键字，主动抛出一个异常
 * 当异常我们不应自己解决，抛给调用者解决的时候，就用throw抛出异常
 * 
 * throws方法声明时，定义可能出现的异常，通知调用者强制捕获！
 */

public class DemoThrow {

	public static void main(String[] args) {
		try{
			/**
			 * 通常我们调用方法需要传入参数时，这些方法都不会
			 * 自己处理异常，而是将错误抛出我们自己解决
			 */
			String result = getGirlFriend("女生");
			System.out.println("我追到了吗"+result);			
		}catch(Exception e){
			
			System.out.println("没追到...");
		}
		
		try {
			Date today = stringToDate("2016-11-6");
			System.out.println(today);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
	}
	/**
	 * 介绍女朋友
	 * @param name 女朋友名字
	 * @return     是否同意
	 */
	public static String getGirlFriend(String name){
		try{
			if("春哥".equals(name)){
				return "行";
			}else if("曾哥".equals(name)){
				return "行";
			}else if("我女朋友".equals(name)){
				return "不行";
			}else{
				/**
				 * 出现错误，抛出异常(可能是业务逻辑上的异常
				 * 不一定是真实异常！！)
				 */
				throw new RuntimeException("人家不干");
			}
		}catch(Exception e){
			//原则上，自身解决不了的才抛出！
			//通常方法传入参数的异常，应该抛出，我们自身
			//的原因产生的异常则需要自己处理
			throw e;//出错不解决，抛出去
		}
	}
	//传入字符串变为日期  yyyy-MM-dd    java.text.ParseException
	public static Date stringToDate(String str) throws ParseException{
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");;
		Date date = format.parse(str);
		return date;
	}
}
