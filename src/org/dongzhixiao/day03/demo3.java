package org.dongzhixiao.day03;

public class demo3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Goo();
		new Goo();
	}
}

class Goo{
	{//代码块，在创建对象时执行！类似于构造器的作用
		System.out.println("HI");
	}
	static{//静态代码块，在类的加载期间执行，只执行一次
		System.out.println("loading Goo.class");
	}
}