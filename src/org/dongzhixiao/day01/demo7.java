package org.dongzhixiao.day01;

import java.util.Random;
/**
 * 
 * @author Administrator
 * 随机生成字符
 * 'A'~'Z'范围某个字符
 * 
 * 提示：Java所有API的范围都是包含开始，不包含结束！！！
 */
public class demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int n = random.nextInt(26); //生成0到26范围内的随机数。但不包括26
		char ch = (char)('A'+n);
		System.out.println(ch);
	}
}
