package org.dongzhixiao.day01;

import java.util.Random;
/**
 * 
 * @author Administrator
 * ��������ַ�
 * 'A'~'Z'��Χĳ���ַ�
 * 
 * ��ʾ��Java����API�ķ�Χ���ǰ�����ʼ������������������
 */
public class demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int n = random.nextInt(26); //����0��26��Χ�ڵ����������������26
		char ch = (char)('A'+n);
		System.out.println(ch);
	}
}
