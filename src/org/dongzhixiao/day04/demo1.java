package org.dongzhixiao.day04;
/**
 * 
 * @author Administrator
 * 数组的创建和声明
 */
public class demo1 {

	public static void main(String[] args) {
		int[] ary = new int[3];
		//ary是引用变量，引用了一个数组对象new int[3]
		int[] ary2 = ary; //引用的赋值
		ary[0] = 3;
		System.out.println(ary2[0]);
		//创建数组时自动初始化，其规则为
		//0(整型)  0.0(浮点型)  false(布尔)  \u0000(字符)
		char[] ary6 = new char[3];
		System.out.println((int)ary6[0]);
		
		//创建数组时直接初始化元素
		int[] ary7 = new int[]{1,2,3};
		//简化版初始化，即：数组的静态初始化
		int[] ary8 = {1,2,3};
		//ary8 = {1,2,3}; //编译错误，简化版只能初始化时用
	}

}
