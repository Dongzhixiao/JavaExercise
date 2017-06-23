package org.dongzhixiao.day05;
/**
 * 
 * @author Administrator
 * instanceof()
 * 继承时对象的创建过程
 * 1 Java首先递归加载所有类搭配方法区
 * 2 分配父子类型的内存(实例变量)
 * 3 递归调用构造器
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