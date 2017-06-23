package org.dongzhixiao.day05;
/**
 * 
 * @author Administrator
 * 二进制运算
 */
public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0xfffffffe;
		//x = 11111111 11111111 11111111 11111110
		int b = x<<1;
		//b = 11111111 11111111 11111111 11111100
		int c = x>>1;  //高位时1就补1，高位时0就补0
		//c = 11111111 11111111 11111111 11111111
		int d = x>>>1; //高位补0
		//d = 01111111 11111111 11111111 11111111
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(c));
		System.out.println(Integer.toBinaryString(d));
	
		int y = 100;
		int z = y>>2;  //相当于/2再/2
		System.out.println(z);
	}

}
