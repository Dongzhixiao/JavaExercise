package org.dongzhixiao.day07;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class TestString {

	public static void main(String[] args) throws UnsupportedEncodingException {
		/**
		 * 字符串对象时不可变得！
		 * 对字符串的任意操作，都会重新创建对象
		 * 
		 * String设计之初，虚拟机就对其做了特殊优化，一旦我们
		 * 要创建一个字符串，先在常量池中检查是否已经有，有的话
		 * 就直接引用！
		 * 这个优化使得其创建后不能改变，所以对字符串的任意操作，
		 * 都会重新创建对象，除非使用new String(...)方式创建	
		 */
		String s1 = "Hello";
		String s2 = "Hello";
		
		System.out.println(s1 == s2);
		
		if("Hello".equals(s1)){ //不要写s1.equals("Hello")!!
			//因为我们不能保证s1不是null
			System.out.println("这个字符串是Hello");
		}
		else{
			System.out.println("两个字符串不相等");
		}
		
		String s3 = "Hello";
		if("hello".equalsIgnoreCase(s3)){
			System.out.println("字符串内容相等");
		}
		String s4 = " 	abs 	";
		String trims4 = s4.trim();//去掉前后空白
		String s5 = "HelloWorld";
		s5.startsWith("Hel"); //是否以"Hel"开头，返回boolean
		
		if(s5.toLowerCase().startsWith("hello")){
			System.out.println(s5+"是以hello开头的！");
		}
		
		System.out.println("Hello".indexOf('l'));//第一次出现l的位置
		System.out.println("Hello".lastIndexOf('l'));//最后一次出现l的位置	
		
		/**
		 * getBytes()字符串转换为字节数组并返回
		 */
		String info = "我爱Java";
		byte[] array = info.getBytes();
		System.out.println(Arrays.toString(array));
	
		/**
		 * getBytes()重载方法，将字符以指定的编码集转换为字节数组
		 * getBytes(String charsetName)
		 * 
		 * 这个方法必须捕获异常，可能出现没有这个编码集的异常
		 * UnsupportedEncodingException
		 */
		byte[] utf = info.getBytes("UTF-8");//gbk gb2312 iso8859-1
		System.out.println(Arrays.toString(utf));
		
		String infoGBK = new String(utf,"GBK");
		String infoUTF = new String(utf,"UTF-8");
		System.out.println(infoGBK);
		System.out.println(infoUTF);
		
		/**
		 * [a-zA-Z0-9]+@[a-zA-Z0-9]+(\.com|\.cn|\.net)
		 * []:描述一个字符
		 * ():描述一个整体
		 * |:描述或关系
		 * 。：任意一个字符
		 * \d:[0-9]
		 * \D:[^0-9]
		 */
	}

}
