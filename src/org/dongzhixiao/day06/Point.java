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
	//toString��Object�ඨ�壬����Ĭ�ϼ̳еķ���
	//�������ӡ�����ʱ��Ĭ�ϵ���
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
