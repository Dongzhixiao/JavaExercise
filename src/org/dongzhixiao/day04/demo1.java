package org.dongzhixiao.day04;
/**
 * 
 * @author Administrator
 * ����Ĵ���������
 */
public class demo1 {

	public static void main(String[] args) {
		int[] ary = new int[3];
		//ary�����ñ�����������һ���������new int[3]
		int[] ary2 = ary; //���õĸ�ֵ
		ary[0] = 3;
		System.out.println(ary2[0]);
		//��������ʱ�Զ���ʼ���������Ϊ
		//0(����)  0.0(������)  false(����)  \u0000(�ַ�)
		char[] ary6 = new char[3];
		System.out.println((int)ary6[0]);
		
		//��������ʱֱ�ӳ�ʼ��Ԫ��
		int[] ary7 = new int[]{1,2,3};
		//�򻯰��ʼ������������ľ�̬��ʼ��
		int[] ary8 = {1,2,3};
		//ary8 = {1,2,3}; //������󣬼򻯰�ֻ�ܳ�ʼ��ʱ��
	}

}
