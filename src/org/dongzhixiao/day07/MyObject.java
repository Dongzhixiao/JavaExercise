package org.dongzhixiao.day07;

public class MyObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyObject obj = new MyObject();
		/**
		 * Java�������඼�̳�Object,toString()��Object����ģ�
		 * ������������
		 * �䷵��һ���ַ������̶�Ϊ������@hashcode 
		 * ���hashcode��һ�����֡�java�о������е�ַ
		 * 
		 * toString�����ԭ���Ƿ����ܹ�������ǰ������ʵ����һ�����¡�
		 */
		String info = obj.toString();
//		System.out.println(info);
		/**
		 * System.out.println(obj)����ʵ�ʵ���toString()����
		 * �ķ���ֵ
		 */
		System.out.println(obj);
		
	}
	@Override
	public String toString() {
		return "��������Լ������toString()�����ķ���ֵ";
	}
}
