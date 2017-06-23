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
		if(this == obj){//�߼�̫����Լ�����仰����ʡ���ܵĿ���
			return true;
		}
		/**
		 * ֱ��ת���з��գ����ܲ���ͬһ�����ͣ�����ClassCastException!
		 * �� ���������쳣��
		 */
		//��дequals��һ����������ж��Ƿ�һ�����ͣ������������ж��Ƿ�Ϊ�գ���
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
		 * == �Ƚ�˫��ֵ�Ƿ����
		 * p1 p2 ���������ͣ�������Ƕ���ľ��(�����ַ�Ǹ�hashcodeֵ)
		 * ==�ڶ���Ƚ�ʱ�Ƚ��Ƿ���ͬһ������
		 * 
		 * equals������ͼ��������������Ƿ���ȡ�
		 */
		if(p1.equals(p1)){
			System.out.println("���������");
		}else{
			System.out.println("�����㲻���");
		}
		System.out.println("null�Ƿ���obj"+(null instanceof Object));
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
