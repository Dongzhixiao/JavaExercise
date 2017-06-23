package org.dongzhixiao.day05;
/**
 * 
 * @author Administrator
 * 重载和重写的区别
 */
public class demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Woo w = new Woo();
		Super s = new Sub();
		w.t(s);  //重载方法调用由参数类型决定，与实际引用对象无关
		
	}

}
class Woo{
	public void t(Super obj){
		System.out.println("Goo t(Super)"); obj.s();//方法调用的是引用的方法
	}
	public void t(Sub obj){
		System.out.println("Goo t(Sub)"); obj.s();
	}
}
class Super{
	public void s(){
		System.out.println("Super s()");
	}
}
class Sub extends Super{
	public void s(){
		System.out.println("Sub s()");
	}
}