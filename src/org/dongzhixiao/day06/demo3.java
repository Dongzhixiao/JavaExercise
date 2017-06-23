package org.dongzhixiao.day06;

import java.util.Timer;
import java.util.TimerTask;

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Circle(3,4,5);
		System.out.println(s1.contains(1, 2));
		
		Timer timer = new Timer();
		timer.schedule(new MyTast(), 0, 1000/5);
	}

}
class MyTast extends TimerTask{
//	private char[] chs = {'-','\\','|','/'};
	private String[] chs = {"...+...","....+..",".....+.","......+"};
	
	private int i = 0;
	public void run(){
		System.out.println(chs[i++%chs.length]);
	}
}