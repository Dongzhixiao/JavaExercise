package org.dongzhixiao.day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.dongzhixiao.day07.Point;

/**
 * 
 * @author Administrator
 * ListԪ�������޸ĺͲ�ѯ
 */
public class DemoList {

	public static void main(String[] args) {
		//get(int index)�����õ�����Ԫ��,  ���򼯺�û�и÷�����
		List list1 = new ArrayList();
		list1.add("One");list1.add("Two");
		System.out.println(list1.get(0));
		//set(int index,Object newElement)�����޸ļ���Ԫ��
		List list2 = new ArrayList();
		list2.add("One");list2.add("Two");
		list2.set(0, "Zero");
		System.out.println(list2.get(0));
		list2.add(0,"Three");//�м����
		System.out.println(list2);
		
		//ɾ��Ԫ��
		Object obj = list2.remove(1);
		System.out.println("list2�Ƴ���Ԫ���ǣ�"+obj+"\nʣ�µ�Ԫ���ǣ�"+list2);
		
		Object[] array = list1.toArray();
		System.out.println(Arrays.toString(array));
		
		List list = new ArrayList();
		list.add(new Point(1, 2));
		list.add(new Point(2, 3));
		list.add(new Point(4, 5));
		//���ݴ������ͷ����������ͣ�����Ĳ����ò������������0�ĳ��ȼ���
		Point[] array1 = (Point[])list.toArray(new Point[0]);
		for(int i = 0; i<array1.length; ++i){
			Point p = array1[i];
			System.out.println(p.getX());
		}
		
	}

}
