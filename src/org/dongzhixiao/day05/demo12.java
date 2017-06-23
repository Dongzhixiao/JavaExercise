package org.dongzhixiao.day05;

public class demo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point1 p1 = new Point1(3,4);
		Point1 p2 = new Point1(6,8);
		System.out.print(p1.distance(p2));
	}

}
class Point1{
	int x; int y;
	public Point1(int x, int y){
		this.x = x; this.y = y;
	}
	public static double distance(Point1 p1,Point1 p2){
		int a = p1.x - p2.x;
		int b = p1.y - p2.y;
		return Math.sqrt(a*a + b*b);
	}
	public double distance(Point1 other){
		int a = this.x - other.x;
		int b = this.y - other.y;
		return Math.sqrt(a*a + b*b);
	}
}