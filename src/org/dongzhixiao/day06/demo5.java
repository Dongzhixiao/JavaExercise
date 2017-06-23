package org.dongzhixiao.day06;

import java.util.Timer;
import java.util.TimerTask;

public class demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xoo x = new Xoo();
		x.start();
	}

}
class Xoo{
	Timer timer = new Timer();
	public void start(){
		timer.schedule(new MyTask(),0,1000);
		timer.schedule(new StopTask(), 1000*10);
	}
	private class MyTask extends TimerTask{
		private int i = 10;
		public void run(){
			System.out.println(i--);
		}
	}
	private class StopTask extends TimerTask{
		public void run(){
			timer.cancel();//取消timer上的任务
		}
	}
}