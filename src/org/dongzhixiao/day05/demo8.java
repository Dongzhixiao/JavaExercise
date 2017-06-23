package org.dongzhixiao.day05;
/**
 * 
 * @author Administrator
 * 属性绑定到变量类型，由变量类型决定访问哪个属性
 * 方法动态绑定到对象，由对象的类型决定访问哪个方法
 */
public class demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cheater c = new Cheater();
		Person p = c;
		System.out.println(p.name+","+c.name);  //根据变量类型查找属性
		p.whoau(); c.whoau();  //根据实际对象查找方法
	}

}
class Person{
	String name = "灰太狼";
	public void whoau(){
		System.out.println(this.name);
	}
}
class Cheater extends Person{
	String name = "喜洋洋";
	public void whoau(){
		System.out.println(this.name);
	}
}