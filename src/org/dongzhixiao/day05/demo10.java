package org.dongzhixiao.day05;

import org.dongzhixiao.day05.sub.Xoo; //��ͬ�������import

public class demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Yoo1 y = new Yoo1();
		System.out.println(y.a);
		System.out.println(y.b);
		System.out.println(y.c);
//		System.out.println(y.d); //�������
		System.out.println(y.getD());
		
		Xoo z = new Xoo();
		System.out.println(z.a);
//		System.out.println(z.b); //�������
//		System.out.println(z.c); //�������
//		System.out.println(z.d); //�������
		System.out.println(z.getD());
	}
}
class Too extends Xoo{
	public void test(){
		System.out.println(super.a);
		System.out.println(super.b); //�����ģ�����ɼ�
//		System.out.println(super.c); //���ɼ���Ĭ�ϣ����ɼ�
//		System.out.println(super.d);
	}
}
class Yoo1{
	public int a = 5;
	protected int b = 6;
	int c = 7;
	private int d = 8;
	public int getD(){return this.d;}
}