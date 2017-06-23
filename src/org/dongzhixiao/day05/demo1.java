package org.dongzhixiao.day05;
/**
 * 
 * @author Administrator
 * byte类型8位补码
 * 最小值        1000 0000
 * -1    1111 1111  
 * 最大值         0111 1111
 * short类型16位补码
 * 最小值        1000 0000 0000 0000
 * -1    1111 1111 1111 1111 
 * 最大值         0111 1111 1111 1111
 * int类型32位补码
 * 最小值        0x8 0 0 0 0 0 0 0 
 * -1    0xf f f f f f f f
 * 最大值         0x7 f f f f f f f 
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
