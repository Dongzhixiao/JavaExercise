package org.dongzhixiao.day07;

import java.util.Arrays;

/**
 * 
 * @author Administrator
 * �����ַ������
 */
public class TestStringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String info = "Hello!World!Java";
		String[] array = info.split("!");//ʵ�ʽ��յ���������ʽƥ��
		System.out.println(Arrays.toString(array));
		
		String name = "xiaodong.org";
		System.out.println(Arrays.toString(name.split("\\.")));
	}

}
