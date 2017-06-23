package org.dongzhixiao.day05;
/**
 * true false null 不是关键字，是字面量
 * 
 * @author Administrator
 * final 修饰的变量只能初始化，不能再修改！
 * 
 * 常量： 直接数的代名词
 * 字面量： 直接写出数
 * 宏观说，字面量就是常量
 */
public class demo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int a;
		a = 1; //初始化一次
//		a = 2; //编译错误，不能再次赋值
		
		test(1,2);
	}
	public static void test(final int a, int b){
		//a++; //编译错误，不能修改
		b++;
	}
}
