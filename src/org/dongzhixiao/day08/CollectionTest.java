package org.dongzhixiao.day08;

import java.util.ArrayList;
import java.util.List;

import org.dongzhixiao.day06.Point;

/**
 * Ctrl+Y ǰ��
 * @author Administrator
 * Collection���ϵĶ���������һ�����
 * �������������ࣺList(Ԫ�ؿ��ظ�������)  Set(Ԫ�ز����ظ�������)
 */
public class CollectionTest {

	public static void main(String[] args) {
		/**
		 * List���ظ����ĸ��ӿڣ�(���Ա�)
		 * ������������ʵ�֣�
		 * ArrayList(����)   LinkedList(����)
		 */
		List list = new ArrayList();
		list.add("abc");
		list.add("aab");
		//ArrayList��д��toString()����
		System.out.println(list);
		
		list = new ArrayList<Point>();
		list.add(new Point(1,2));
		list.add(new Point(3,4));
		list.add(new Point(5,6));
		//����ʹ��equals�ķ�������ƥ��
		System.out.println("����Point�Ƿ����"+list.contains(new Point(1,2)));
	
		List list1 = new ArrayList<String>();
		List list2 = new ArrayList<String>();
		List list3 = new ArrayList<String>();
		//��һ���������Ԫ��
		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		//�ڶ����������Ԫ��
		list2.add("four");
		list2.add("five");
		//�������������Ԫ��
		list3.add("One");
		list3.add("Two");
		//��������
		list1.addAll(list2);//[One,Two,Three,four,five]
		System.out.println(list1);
		//�����
		list1.removeAll(list3);//[Three,four,five]
		System.out.println(list1);
		//��������
		list1.retainAll(list2);//[four, five]
		System.out.println(list1);
	}

}
