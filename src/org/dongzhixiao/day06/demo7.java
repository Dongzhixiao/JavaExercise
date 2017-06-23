package org.dongzhixiao.day06;

import java.util.Timer;
import java.util.TimerTask;

public class demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Timer timer = new Timer();  //使用匿名内部类访问，必须加final关键字！
		//使用匿名内部类实现TimerTask
		timer.schedule(new TimerTask(){
			private int i = 10;
			public void run(){
				System.out.println(i--);
			}
		},0,1000);
		timer.schedule(new TimerTask(){
			public void run(){
				timer.cancel(); //在匿名内部类中只能访问final局部变量
			}
		}, 1000*10);
	}
	
}
