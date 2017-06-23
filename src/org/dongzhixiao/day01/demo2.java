package org.dongzhixiao.day01;
/**
 * 
 * @author Administrator
 * byte 范围: -128 ~ 127
 * short范围: -32768 ~ 32767
 * int范围:   -21亿 ~ 21亿   -2^31 ~ 2^31-1
 * long范围:  -2^63 ~ 2^63-1
 */
public class demo2 {
	public static void main(String[] args)
	{
		byte b;
		b = -128;
		System.out.println(b);
		int i = 0x10;
		System.out.println(i);
		
		long l1 = 100000000000L;  //java字面量默认为int，因此需要L后缀是long
		long now = System.currentTimeMillis();
		//从1970年元旦到现在的毫秒数
		System.out.println(now);
		long year = now/1000/60/60/24/365+1970;
		System.out.println("公元"+year);
		long max = 0x7fffffffffffffffL; //1个7，15个f 
		long maxYear = max/1000/60/60/24/365+1970;
		System.out.println("公元"+maxYear);
	}
}
