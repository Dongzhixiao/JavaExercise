package org.dongzhixiao.day05;
/**
 * 
 * @author Administrator
 * instanceof()
 * �̳�ʱ����Ĵ�������
 * 1 Java���ȵݹ������������䷽����
 * 2 ���丸�����͵��ڴ�(ʵ������)
 * 3 �ݹ���ù�����
 */
public class demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goo g = new Goo();
		System.out.println(g.a+","+g.b+","+g.c);
	}

}
class Foo{
	int a = 1;
	public Foo(){
		a = 5;
	}
}
class Koo extends Foo{
	int b = 2;
	public Koo(){
		super();
		b = 6;
		a = 7;
	}
}
class Goo extends Koo{
	int c = 3;
	public Goo(){
		super();
		a = 8;
		b = 9;
		c = 10;
	}
}