package org.dongzhixiao.day09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author Administrator
 * throw�ؼ��֣������׳�һ���쳣
 * ���쳣���ǲ�Ӧ�Լ�������׸������߽����ʱ�򣬾���throw�׳��쳣
 * 
 * throws��������ʱ��������ܳ��ֵ��쳣��֪ͨ������ǿ�Ʋ���
 */

public class DemoThrow {

	public static void main(String[] args) {
		try{
			/**
			 * ͨ�����ǵ��÷�����Ҫ�������ʱ����Щ����������
			 * �Լ������쳣�����ǽ������׳������Լ����
			 */
			String result = getGirlFriend("Ů��");
			System.out.println("��׷������"+result);			
		}catch(Exception e){
			
			System.out.println("û׷��...");
		}
		
		try {
			Date today = stringToDate("2016-11-6");
			System.out.println(today);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
	}
	/**
	 * ����Ů����
	 * @param name Ů��������
	 * @return     �Ƿ�ͬ��
	 */
	public static String getGirlFriend(String name){
		try{
			if("����".equals(name)){
				return "��";
			}else if("����".equals(name)){
				return "��";
			}else if("��Ů����".equals(name)){
				return "����";
			}else{
				/**
				 * ���ִ����׳��쳣(������ҵ���߼��ϵ��쳣
				 * ��һ������ʵ�쳣����)
				 */
				throw new RuntimeException("�˼Ҳ���");
			}
		}catch(Exception e){
			//ԭ���ϣ����������˵Ĳ��׳���
			//ͨ����������������쳣��Ӧ���׳�����������
			//��ԭ��������쳣����Ҫ�Լ�����
			throw e;//����������׳�ȥ
		}
	}
	//�����ַ�����Ϊ����  yyyy-MM-dd    java.text.ParseException
	public static Date stringToDate(String str) throws ParseException{
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");;
		Date date = format.parse(str);
		return date;
	}
}
