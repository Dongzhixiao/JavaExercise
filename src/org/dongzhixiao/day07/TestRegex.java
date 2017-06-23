package org.dongzhixiao.day07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Administrator
 * 测试正则表达式
 */
public class TestRegex {

	public static void main(String[] args) {
		//定义正则表达式
		//java 不能使用 \.  因为.不需要转意，因此需要两个\，即\\.
		String regStr = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.com|\\.cn|\\.net)+$";
		//注册正则表达式
		Pattern pattern = Pattern.compile(regStr);
		
		String mailStr = "xiaodong@gmail.com.cn";
		Matcher matcher = pattern.matcher(mailStr);
		if(matcher.find()){
			System.out.println("邮箱格式正确");
		}else{
			System.out.println("邮箱格式错误");
		}
		
		String regPhoneNumber = "(\\+86)?\\d{11}$";
	}

}
