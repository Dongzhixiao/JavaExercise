package org.dongzhixiao.day08;

import java.math.BigDecimal;

/**
 * 
 * @author Administrator
 * ��װ�ཫ�����������͵������ÿ���
 * �˸��������Ͷ��ж�Ӧ����������
 * 
 * װ�䣺 ����������
 * ���䣺���á�����
 */
public class WrapperClassTest {

	public static void main(String[] args) {
		Integer i = new Integer(1);//װ��
		say(i);
		int a = i.intValue();//����
		
		//java 1.5���Զ����װ���䣡��
		/**
		 * �Զ�����
		 */
		int num = i.intValue(); //�������ͱ�����ô�ܸ�ֵ����������,���Բ���.intValue()
	
		/**
		 * ��װ��ɽ��ַ���ת��Ϊ������
		 */
		String numStr = "12";
		int result = Integer.parseInt(numStr);
		long longResult = Long.parseLong(numStr);
		
		String bstr = Integer.toBinaryString(result);
		String hstr = Integer.toHexString(result);
		int max = Integer.MAX_VALUE;//��ȡint���ֵ
		int min = Integer.MIN_VALUE;//��ȡint��Сֵ
	
	
		/**
		 * BigDecimal����
		 */
		BigDecimal num1 = new BigDecimal("2.9");
		BigDecimal num2 = new BigDecimal("2.0");
		BigDecimal cutNum = num1.subtract(num2);
		System.out.print(cutNum);
		
		float f = cutNum.floatValue();
		int intNum = cutNum.intValue();
	
		//��Ӧ���������뱣��λ��������һֱ���㵽����
		num1.divide(num2,8,BigDecimal.ROUND_HALF_UP);
	}
	
	public static void say(Object o){
		System.out.println(o);
	}
}
