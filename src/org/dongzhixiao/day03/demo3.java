package org.dongzhixiao.day03;

public class demo3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Goo();
		new Goo();
	}
}

class Goo{
	{//����飬�ڴ�������ʱִ�У������ڹ�����������
		System.out.println("HI");
	}
	static{//��̬����飬����ļ����ڼ�ִ�У�ִֻ��һ��
		System.out.println("loading Goo.class");
	}
}