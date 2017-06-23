package org.dongzhixiao.day07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @author Administrator
 * Dateά��һ��longֵ����1970��1��1����ʱ�����ڵĺ�����
 */
public class DateTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
		
		long time =  date.getTime();
		System.out.println(time);
		/**
		 * ǧ������⣺
		 */
		int year = date.getYear(); //����������ʹ�ã����к��ߣ�
		
		//���ڼ�������Ҫʹ��Calendar�࣡
		//�����о���ʱ��������һ��ʵ�����䱾���ǳ����࣬��ȡ����һ������
		Calendar calendar = Calendar.getInstance();
		//ʹ��getTime���Է���Dateʵ��
		Date now = calendar.getTime();
		System.out.println(now);
		
		//ͨ��Calendar����ʱ��Ƚϼ�
		calendar.set(Calendar.YEAR, 2019);
		calendar.set(Calendar.MONTH, 11);//�����·ݴ�0��ʼ�������12��
		System.out.println(calendar.getTime());
		
		calendar.add(calendar.DAY_OF_YEAR, -22);
		
		int Year = calendar.get(Calendar.YEAR);
		int Month = calendar.get(calendar.MONTH);
		int Day = calendar.get(calendar.DAY_OF_MONTH);
		//monthҪ����
		System.out.println(Year+"��"+(Month+1)+"��"+Day+"��");
	
		/**
		 * SimpleDateFormat��   (��DateFormat������)
		 * ���Է�������ַ������������ת��
		 * yyyy-MM-dd 2012-11-23
		 * yy-MM-dd   12-12-30
		 * yy-MM-dd hh:mm:ss  12-12-30 03:20:23
		 */
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy-MM-dd");
		String dateFormat = "2013-05-14";
		Date D = sdf.parse(dateFormat); //��Ҫ�׳��쳣
		System.out.println(D);
		//������
		SimpleDateFormat sdf1 = 
				new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String nowStr = sdf1.format(date);
		System.out.println(nowStr);
	}

}
