package org.dongzhixiao.day07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Administrator
 * ����������ʽ
 */
public class TestRegex {

	public static void main(String[] args) {
		//����������ʽ
		//java ����ʹ�� \.  ��Ϊ.����Ҫת�⣬�����Ҫ����\����\\.
		String regStr = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.com|\\.cn|\\.net)+$";
		//ע��������ʽ
		Pattern pattern = Pattern.compile(regStr);
		
		String mailStr = "xiaodong@gmail.com.cn";
		Matcher matcher = pattern.matcher(mailStr);
		if(matcher.find()){
			System.out.println("�����ʽ��ȷ");
		}else{
			System.out.println("�����ʽ����");
		}
		
		String regPhoneNumber = "(\\+86)?\\d{11}$";
	}

}
