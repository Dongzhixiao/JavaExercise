package org.dongzhixiao.day08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author Administrator
 * �Լ��Ͻ�����Ȼ����
 * ȷ�������е�Ԫ����Comparable�����࣡
 */
public class DemoComparable {
	
	public static void main(String[] args) {
		List<ComparablePoint> list = 
				new ArrayList<ComparablePoint>();
		list.add(new ComparablePoint(1, 5));
		list.add(new ComparablePoint(3, 4));
		list.add(new ComparablePoint(2, 2));
		
		System.out.println(list);
		//�����౾���ṩ������ʽ���򣬼�����ԭ���С
		Collections.sort(list);
		System.out.println(list);
		
		/**
		 * �Ƚ���������ʵ��Comparator�Ƚ�����
		 * ���󷽷�int compareTo(E o1,E o2)
		 * ���ش�����˵��o1��o2��
		 * 
		 * Collections.sort�ṩ��һ�����ط�����
		 * ����һ��compareTo����ʹ���ⲿ���������
		 */
		//�Զ���������򣬰���x��С����
		Comparator<ComparablePoint> c = new Comparator<ComparablePoint>() {
			@Override
			public int compare(ComparablePoint o1, ComparablePoint o2) {
				return o1.getX()-o2.getX();
			}
		};
		Collections.sort(list,c);
		System.out.println(list);
	}
}
