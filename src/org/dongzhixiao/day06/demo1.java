package org.dongzhixiao.day06;

import java.util.Arrays;

/**
 * 
 * @author Administrator
 * 对象数组： 元素是对象(元素是对象的引用)的数组
 */
public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point[] ary; //声明了数组变量
		ary = new Point[3]; //创建了数组对象
		System.out.println(ary[1]);
		ary[0] = new Point(3,4);
		ary[1] = new Point(5,6);
		ary[2] = new Point(1,2);
		System.out.println(ary[1]);
		System.out.println(ary[1].toString());
		System.out.println(Arrays.toString(ary));
		
		ary = new Point[]{new Point(1,2),new Point(6,7)};
		System.out.println(Arrays.toString(ary));
		
		Point[] ary2 = {new Point(2,3),new Point(4,5)};
		System.out.println(Arrays.toString(ary2));
	}

}