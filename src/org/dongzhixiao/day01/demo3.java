package org.dongzhixiao.day01;

public class demo3 {
	public static void main(String[] args)
	{
		double d = 0.123456789123456789;
		float f = 0.123456789123456789f;  //小数字面量默认是double，因此float需要加上f
		System.out.println(d);
		System.out.println(f);
		System.out.println(2.6-2);  //浮点数有深入误差，不能精确计算结果
	}
	
}
