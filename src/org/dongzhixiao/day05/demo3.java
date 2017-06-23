package org.dongzhixiao.day05;

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b1 = 192; int b2 = 168; int b3 = 1; int b4 = 10;
		int ip = (b1<<24)|(b2<<16)|(b3<<8)|(b4);
		
		int color = 0xD87455;
		int b = color & 0xff;
		System.out.println(b);  //85
		int g = (color>>>8) & 0xff;
		System.out.println(g);  //116
		int r = (color>>>16) & 0xff;
		System.out.println(r);  //216

	}

}
