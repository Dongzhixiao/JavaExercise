package org.dongzhixiao.day08;

import java.math.BigDecimal;

/**
 * 
 * @author Administrator
 * 包装类将基本数据类型当做引用看待
 * 八个基本类型都有对应的引用类型
 * 
 * 装箱： 基本→引用
 * 拆箱：引用→基本
 */
public class WrapperClassTest {

	public static void main(String[] args) {
		Integer i = new Integer(1);//装箱
		say(i);
		int a = i.intValue();//拆箱
		
		//java 1.5后自动完成装拆箱！！
		/**
		 * 自动拆箱
		 */
		int num = i.intValue(); //引用类型变量怎么能赋值给基本类型,可以不加.intValue()
	
		/**
		 * 包装类可将字符串转换为该类型
		 */
		String numStr = "12";
		int result = Integer.parseInt(numStr);
		long longResult = Long.parseLong(numStr);
		
		String bstr = Integer.toBinaryString(result);
		String hstr = Integer.toHexString(result);
		int max = Integer.MAX_VALUE;//获取int最大值
		int min = Integer.MIN_VALUE;//获取int最小值
	
	
		/**
		 * BigDecimal测试
		 */
		BigDecimal num1 = new BigDecimal("2.9");
		BigDecimal num2 = new BigDecimal("2.0");
		BigDecimal cutNum = num1.subtract(num2);
		System.out.print(cutNum);
		
		float f = cutNum.floatValue();
		int intNum = cutNum.intValue();
	
		//对应除法，必须保留位数，否则一直计算到报错
		num1.divide(num2,8,BigDecimal.ROUND_HALF_UP);
	}
	
	public static void say(Object o){
		System.out.println(o);
	}
}
