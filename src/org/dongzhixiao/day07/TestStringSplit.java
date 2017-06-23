package org.dongzhixiao.day07;

import java.util.Arrays;

/**
 * 
 * @author Administrator
 * 测试字符串拆分
 */
public class TestStringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String info = "Hello!World!Java";
		String[] array = info.split("!");//实际接收的是正则表达式匹配
		System.out.println(Arrays.toString(array));
		
		String name = "xiaodong.org";
		System.out.println(Arrays.toString(name.split("\\.")));
	}

}
