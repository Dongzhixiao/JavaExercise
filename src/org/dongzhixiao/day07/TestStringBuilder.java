package org.dongzhixiao.day07;
/**
 * 
 * @author Administrator
 * StringBuilder���ڶ���ĳ���ַ���Ƶ������
 * ���д����ַ�������ʱҪʹ������࣬������String
 */
public class TestStringBuilder {

	public static void main(String[] args) {
//		String info = "java";
//		for(int i = 0 ; i<100000 ; i++){
//			info += "java";  //��ͨString������
//		}
//		System.out.println(info);
	
		StringBuilder builder = new StringBuilder("java");
		for(int i = 0 ; i<100000; i++){
			builder.append("java").append("script");
		}
		System.out.println(builder.toString());
	}
	
	/**
	 * StringBuilder��StringBuffer
	 * Ч��һ��
	 * ����
	 *  StringBuilder�̰߳�ȫ
	 *  ���̱߳�����StringBuilder
	 *  Ч�ʱ�StringBuffer��
	 */
	
}
