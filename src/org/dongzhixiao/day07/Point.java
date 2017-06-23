package org.dongzhixiao.day07;

public class Point {
	private int x;
	private int y;
	
	public Point(int x , int y){
		this.x = x;
		this.y = y;
	}
	
	
	
	@Override
	public String toString() {
		return "x=" + x + ",y=" + y;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj){//逻辑太多可以加上这句话，节省可能的开销
			return true;
		}
		/**
		 * 直接转换有风险，可能不是同一个类型，引发ClassCastException!
		 * 即 【类造型异常】
		 */
		//重写equals第一件事情就是判断是否一个类型！！！！还有判断是否为空！！
		if(!(obj instanceof Point)){
			return false;
		}
		Point p = (Point)obj; 
		return this.x == p.x && this.y == p.y;
	}
	public static void main(String[] args) {
		System.out.println();
		
		Point p1 = new Point(1, 2);
		Point p2 = new Point(1, 2);
		/**
		 * == 比较双方值是否相等
		 * p1 p2 是引用类型，保存的是对象的句柄(对象地址那个hashcode值)
		 * ==在对象比较时比较是否是同一个对象
		 * 
		 * equals方法力图描述对象的内容是否相等。
		 */
		if(p1.equals(p1)){
			System.out.println("两个点相等");
		}else{
			System.out.println("两个点不相等");
		}
		System.out.println("null是否是obj"+(null instanceof Object));
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
