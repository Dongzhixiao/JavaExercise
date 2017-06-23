package org.dongzhixiao.day06;

public class Circle extends Shape{
	private int r;
	public Circle(){
	}
	public Circle(int x, int y, int r){
		this.r = r;
		this.x = x;
		this.y = y;
	}
	/** ���󷽷���ʵ�� */
	@Override
	public boolean contains(int x, int y) {
		int a = this.x - x;
		int b = this.y - y;
		double c = Math.sqrt(a*a + b*b);
		return c <= r; 
	}
	
}
