package org.dongzhixiao.day05;
/**
 * 
 * @author Administrator
 * ��ϸ˼����
 * ������Ĭ�ϵ��ø����޲�����������������
 */
public class demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aoo b = new Boo();
	}

}
class Aoo{
	int a = 1;
	public Aoo(){this.test();}
	public void test(){
		System.out.println("Aoo "+a);
	}
}
class Boo extends Aoo{
	int b = 2;
	public Boo(){super();}
	public void test(){
		System.out.println("Boo "+a+","+b);
	}
}