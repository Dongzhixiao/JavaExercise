package org.dongzhixiao.day06;
/**
 * 
 * @author Administrator
 * �����࣬������ʾ�����������ʾ�����ͼ�����
 * �������󷽷�����һ���ǳ�����
 */
public abstract class Shape {
	protected int x;
	protected int y;
	/** ���巽�����з����� */
	public void up(){
		y--;
	}
	/** ���󷽷�û�з����� */
	public abstract boolean contains(int x, int y);
}
