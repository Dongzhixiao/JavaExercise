package org.dongzhixiao.day06;

import java.util.Timer;
import java.util.TimerTask;

public class demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Timer timer = new Timer();  //ʹ�������ڲ�����ʣ������final�ؼ��֣�
		//ʹ�������ڲ���ʵ��TimerTask
		timer.schedule(new TimerTask(){
			private int i = 10;
			public void run(){
				System.out.println(i--);
			}
		},0,1000);
		timer.schedule(new TimerTask(){
			public void run(){
				timer.cancel(); //�������ڲ�����ֻ�ܷ���final�ֲ�����
			}
		}, 1000*10);
	}
	
}
