package org.dongzhixiao.day01;
/**
 * 
 * @author Administrator
 * ������������ת��
 */
public class demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long l = 1; //1��int(32) �Զ�ת����long(64)
		l = 1024*1024*1024*4;
		int i = (int)l; //ǿ������ת���������
		System.out.println(i);
		l = 1000L;
		i = (int)l;  //û������Χ��û��
		System.out.println(i);
	}

}
