package org.dongzhixiao.day05;
/**
 * 
 * @author Administrator
 * ����������
 */
public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0xfffffffe;
		//x = 11111111 11111111 11111111 11111110
		int b = x<<1;
		//b = 11111111 11111111 11111111 11111100
		int c = x>>1;  //��λʱ1�Ͳ�1����λʱ0�Ͳ�0
		//c = 11111111 11111111 11111111 11111111
		int d = x>>>1; //��λ��0
		//d = 01111111 11111111 11111111 11111111
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(c));
		System.out.println(Integer.toBinaryString(d));
	
		int y = 100;
		int z = y>>2;  //�൱��/2��/2
		System.out.println(z);
	}

}
