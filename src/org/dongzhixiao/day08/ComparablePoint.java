package org.dongzhixiao.day08;
/**
 * 
 * @author Administrator
 * 可比较的点
 */
public class ComparablePoint
implements Comparable<ComparablePoint> {
	private int x;
	private int y;
	
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

	public ComparablePoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override //比较到原点的距离，谁的长谁大
	public int compareTo(ComparablePoint o) {
		int r = x*x+y*y;
		int other = o.x*o.x+o.y*o.y;
		return r-other;//大于0表明自身比参数大
	}
	
	@Override
	public String toString() {
		return "[x:"+x+" y:"+y+"]";
	}
	
}
