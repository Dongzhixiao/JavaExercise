package org.dongzhixiao.day04;
/**
 * 
 * @author Administrator
 * 访问数组元素
 */
public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ary1 = new int[]{3,4,5};
		//System.out.println(ary1[ary1.length]);//运行异常，下标越界
		ary1[0] = 8;
		ary1[1]++;
	}

}
