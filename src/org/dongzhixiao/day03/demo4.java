package org.dongzhixiao.day03;

import java.util.Arrays;

/**
 * 
 * @author Administrator
 *	final�ࣺ�����ټ̳�
 *  final��������������д
 *  fianl������ֻ�ܳ�ʼ��һ�Σ��������޸�
 *  final�ķ������࣬��ֹ�˶�̬����ģʽ��
 *	��̬����ģʽ�㷺Ӧ����:Spring Hibernate Struts2
 *	��ҵ��̹淶��������ʹ��final�ķ������࣡
 *
 *	������public static final double PI = 3.14;
 */
public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String s= "ABC";
		//s = "A";
		final String[] ary = {"A","B"};
		//ary:���������ary[0]����Ԫ��
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