package org.dongzhixiao.day01;
/**
 * 
 * @author Administrator
 * 基本数据类型转换
 */
public class demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long l = 1; //1是int(32) 自动转换成long(64)
		l = 1024*1024*1024*4;
		int i = (int)l; //强制类型转换，溢出了
		System.out.println(i);
		l = 1000L;
		i = (int)l;  //没超过范围，没事
		System.out.println(i);
	}

}
