package org.dongzhixiao.day06;
/**
 * 
 * @author Administrator
 * �����ڲ��� == ������
 * new Uoo(){} �ͽ������ڲ��࣡�Ǽ̳���Uoo������࣬����ͬʱ����������ʵ��
 * ����{}����������壬����д�κ����еĳ�Ա
 */
public class demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Uoo u = new Uoo();
		Uoo u1 = new Uoo(){}; //���������ڲ���ʵ��
		Uoo u2 = new Uoo(){
			public void test(){
				System.out.println("u2.test()");
			}
		};
		u2.test();
		
		Doo doo = new Doo(){
			public void test(){
				System.out.println("ʵ��test()");
			}
		};
		doo.test();
	}

}
interface Doo{
	void test();
}
class Uoo{
	public void test(){}
}