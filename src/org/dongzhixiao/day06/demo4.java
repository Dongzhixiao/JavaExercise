package org.dongzhixiao.day06;
/**
 * 
 * @author Administrator
 * interface 差不多 abstract class
 * 接口中只能声明抽象方法和常量
 * 接口可以定义变量，接口不能实例化，接口只能被实现
 * 具体类实现一个结果，必须实现全部抽象方法
 * 具体类可以同时实现多个接口，表达多继承
 */

public class demo4{
	public static void main(String[] args){
		Cat tom = new Cat();
		Hunter hunter = tom;
		Runner runner = tom;
		hunter.hunt();
		runner.run();
//		runner.hunt(); //编译错误，Runner上没有定义hunt方法
	}
}
class Cat implements Hunter,Runner{//Runner可以不加，一样
	@Override
	public void hunt() {
		// TODO Auto-generated method stub
		System.out.println("抓老鼠去！");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("速度是"+SPEED);
	}
}
interface Hunter extends Runner{//猎人能跑
	void hunt();//打猎
}
interface Runner {
	/* public static final */ int SPEED = 100;
	/* public abstract */ void run();
}
