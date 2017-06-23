package org.dongzhixiao.day06;
/**
 * 
 * @author Administrator
 * 匿名内部类 == 匿名类
 * new Uoo(){} 就叫匿名内部类！是继承于Uoo类的子类，并且同时创建子类型实例
 * 其中{}是子类的类体，可以写任何类中的成员
 */
public class demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Uoo u = new Uoo();
		Uoo u1 = new Uoo(){}; //创建匿名内部类实例
		Uoo u2 = new Uoo(){
			public void test(){
				System.out.println("u2.test()");
			}
		};
		u2.test();
		
		Doo doo = new Doo(){
			public void test(){
				System.out.println("实现test()");
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