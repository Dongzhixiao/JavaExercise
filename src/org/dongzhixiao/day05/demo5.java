package org.dongzhixiao.day05;
/**
 * 
 * @author Administrator
 * 1)构造器不能继承
 * 2)子类构造器默认调用父类型无参构造器
 * 3)如果父类型没有无参数构造器，必须使用super()调用父类构造器
 * 
 * 关于super(): 一定在子类构造器第一行使用！
 */
public class demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Yoo yoo = new Yoo();
	}

}
class Xoo{
	public Xoo(int s){
		System.out.println("Call Xoo(int)");
	}
}
//class Yoo extends Xoo{}  //编译错误，父类型没有无参数构造器
class Yoo extends Xoo{
	public Yoo(){
		super(100);
	}
}