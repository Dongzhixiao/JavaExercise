package org.dongzhixiao.day07;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class TestString {

	public static void main(String[] args) throws UnsupportedEncodingException {
		/**
		 * �ַ�������ʱ���ɱ�ã�
		 * ���ַ���������������������´�������
		 * 
		 * String���֮����������Ͷ������������Ż���һ������
		 * Ҫ����һ���ַ��������ڳ������м���Ƿ��Ѿ��У��еĻ�
		 * ��ֱ�����ã�
		 * ����Ż�ʹ���䴴�����ܸı䣬���Զ��ַ��������������
		 * �������´������󣬳���ʹ��new String(...)��ʽ����	
		 */
		String s1 = "Hello";
		String s2 = "Hello";
		
		System.out.println(s1 == s2);
		
		if("Hello".equals(s1)){ //��Ҫдs1.equals("Hello")!!
			//��Ϊ���ǲ��ܱ�֤s1����null
			System.out.println("����ַ�����Hello");
		}
		else{
			System.out.println("�����ַ��������");
		}
		
		String s3 = "Hello";
		if("hello".equalsIgnoreCase(s3)){
			System.out.println("�ַ����������");
		}
		String s4 = " 	abs 	";
		String trims4 = s4.trim();//ȥ��ǰ��հ�
		String s5 = "HelloWorld";
		s5.startsWith("Hel"); //�Ƿ���"Hel"��ͷ������boolean
		
		if(s5.toLowerCase().startsWith("hello")){
			System.out.println(s5+"����hello��ͷ�ģ�");
		}
		
		System.out.println("Hello".indexOf('l'));//��һ�γ���l��λ��
		System.out.println("Hello".lastIndexOf('l'));//���һ�γ���l��λ��	
		
		/**
		 * getBytes()�ַ���ת��Ϊ�ֽ����鲢����
		 */
		String info = "�Ұ�Java";
		byte[] array = info.getBytes();
		System.out.println(Arrays.toString(array));
	
		/**
		 * getBytes()���ط��������ַ���ָ���ı��뼯ת��Ϊ�ֽ�����
		 * getBytes(String charsetName)
		 * 
		 * ����������벶���쳣�����ܳ���û��������뼯���쳣
		 * UnsupportedEncodingException
		 */
		byte[] utf = info.getBytes("UTF-8");//gbk gb2312 iso8859-1
		System.out.println(Arrays.toString(utf));
		
		String infoGBK = new String(utf,"GBK");
		String infoUTF = new String(utf,"UTF-8");
		System.out.println(infoGBK);
		System.out.println(infoUTF);
		
		/**
		 * [a-zA-Z0-9]+@[a-zA-Z0-9]+(\.com|\.cn|\.net)
		 * []:����һ���ַ�
		 * ():����һ������
		 * |:�������ϵ
		 * ��������һ���ַ�
		 * \d:[0-9]
		 * \D:[^0-9]
		 */
	}

}
