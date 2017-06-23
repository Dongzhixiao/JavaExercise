package org.dongzhixiao.day03;

import java.util.Arrays;

/**
 * 
 * @author Administrator
 *	final类：不能再继承
 *  final方法，不能再重写
 *  fianl变量，只能初始化一次，不能再修改
 *  final的方法和类，阻止了动态代理模式！
 *	动态代理模式广泛应用在:Spring Hibernate Struts2
 *	企业编程规范：不允许使用final的方法和类！
 *
 *	常量：public static final double PI = 3.14;
 */
public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String s= "ABC";
		//s = "A";
		final String[] ary = {"A","B"};
		//ary:数组变量，ary[0]数组元素
		ary[0] = "Tom";
		System.out.println(Arrays.toString(ary));
		final Hoo h = new Hoo();
		h.a = 8;
		//h = null;
	}
}
class Hoo{
	int a = 4;
}