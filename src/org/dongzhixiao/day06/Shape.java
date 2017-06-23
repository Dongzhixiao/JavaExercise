package org.dongzhixiao.day06;
/**
 * 
 * @author Administrator
 * 抽象类，用来表示抽象概念，这里表示抽象的图像概念
 * 包含抽象方法的类一定是抽象类
 */
public abstract class Shape {
	protected int x;
	protected int y;
	/** 具体方法，有方法体 */
	public void up(){
		y--;
	}
	/** 抽象方法没有方法体 */
	public abstract boolean contains(int x, int y);
}
