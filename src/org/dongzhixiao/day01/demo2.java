package org.dongzhixiao.day01;
/**
 * 
 * @author Administrator
 * byte ��Χ: -128 ~ 127
 * short��Χ: -32768 ~ 32767
 * int��Χ:   -21�� ~ 21��   -2^31 ~ 2^31-1
 * long��Χ:  -2^63 ~ 2^63-1
 */
public class demo2 {
	public static void main(String[] args)
	{
		byte b;
		b = -128;
		System.out.println(b);
		int i = 0x10;
		System.out.println(i);
		
		long l1 = 100000000000L;  //java������Ĭ��Ϊint�������ҪL��׺��long
		long now = System.currentTimeMillis();
		//��1970��Ԫ�������ڵĺ�����
		System.out.println(now);
		long year = now/1000/60/60/24/365+1970;
		System.out.println("��Ԫ"+year);
		long max = 0x7fffffffffffffffL; //1��7��15��f 
		long maxYear = max/1000/60/60/24/365+1970;
		System.out.println("��Ԫ"+maxYear);
	}
}
