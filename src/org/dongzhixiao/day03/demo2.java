package org.dongzhixiao.day03;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foo f = new Koo();
	}
}
class Foo{
	int a = 1;
	public Foo(){this.test();}
	private void test(){
		System.out.println("Foo test()"+a);
	}
}
class Koo extends Foo{
	int b = 2;
	public void test(){
		System.out.println("Koo test()"+a+","+b);
	}
}