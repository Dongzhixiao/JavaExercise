package org.dongzhixiao.day05;
/**
 * 
 * @author Administrator
 * byte����8λ����
 * ��Сֵ        1000 0000
 * -1    1111 1111  
 * ���ֵ         0111 1111
 * short����16λ����
 * ��Сֵ        1000 0000 0000 0000
 * -1    1111 1111 1111 1111 
 * ���ֵ         0111 1111 1111 1111
 * int����32λ����
 * ��Сֵ        0x8 0 0 0 0 0 0 0 
 * -1    0xf f f f f f f f
 * ���ֵ         0x7 f f f f f f f 
 */
public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = -1; //0xffffffff
		int max = 0x7fffffff;
		int min = 0x80000000;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toHexString(i));
	}

}
