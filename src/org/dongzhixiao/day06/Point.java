package org.dongzhixiao.day06;

public class Point<E> /* extends Object */{
	private E x;
	private E y;
	public Point(){
	}
	public Point(E x, E y){
		this.x = x;
		this.y = y;
	}
	public E getX(){
		return x;
	}
	public E getY(){
		return y;
	}
	//Point.java
	//toString是Object类定义，子类默认继承的方法
	//在输出打印对象的时候默认调用
	public String toString(){
		return "("+x+","+y+")";
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Point)){
			return false;
		}
		Point objP = (Point)obj; 
		return this.x == objP.x && this.y == objP.y;
	}
}
