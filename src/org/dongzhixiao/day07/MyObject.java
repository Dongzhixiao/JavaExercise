package org.dongzhixiao.day07;

public class MyObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyObject obj = new MyObject();
		/**
		 * Java中所有类都继承Object,toString()是Object定义的，
		 * 因此有这个方法
		 * 其返还一个字符串，固定为：类名@hashcode 
		 * 这个hashcode是一串数字。java叫句柄，或叫地址
		 * 
		 * toString定义的原意是返回能够描述当前这个类的实例的一串文章。
		 */
		String info = obj.toString();
//		System.out.println(info);
		/**
		 * System.out.println(obj)方法实际调用toString()方法
		 * 的返回值
		 */
		System.out.println(obj);
		
	}
	@Override
	public String toString() {
		return "这个是我自己定义的toString()方法的返回值";
	}
}
