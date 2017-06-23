package org.dongzhixiao.day07;
/**
 * 
 * @author Administrator
 * StringBuilder用于对于某个字符串频繁操作
 * 当有大量字符串操作时要使用这个类，而不是String
 */
public class TestStringBuilder {

	public static void main(String[] args) {
//		String info = "java";
//		for(int i = 0 ; i<100000 ; i++){
//			info += "java";  //普通String，很慢
//		}
//		System.out.println(info);
	
		StringBuilder builder = new StringBuilder("java");
		for(int i = 0 ; i<100000; i++){
			builder.append("java").append("script");
		}
		System.out.println(builder.toString());
	}
	
	/**
	 * StringBuilder和StringBuffer
	 * 效果一样
	 * 区别：
	 *  StringBuilder线程安全
	 *  多线程必须用StringBuilder
	 *  效率比StringBuffer低
	 */
	
}
