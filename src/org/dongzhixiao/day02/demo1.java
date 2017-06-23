package org.dongzhixiao.day02;
/**
 * 
 * @author Administrator
 * float long
 * 
 * float 的精度没有long高
 * 但是float的范围大于long 指数可以很大！
 */
public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long l = 1234567890123456789L;
		float num = (float)l;
		System.out.println(l);
		System.out.println(num);
	}

}
