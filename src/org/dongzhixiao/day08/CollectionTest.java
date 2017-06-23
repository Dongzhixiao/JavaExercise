package org.dongzhixiao.day08;

import java.util.ArrayList;
import java.util.List;

import org.dongzhixiao.day06.Point;

/**
 * Ctrl+Y 前进
 * @author Administrator
 * Collection集合的顶级父类是一个借口
 * 其下面两个子类：List(元素可重复、有序)  Set(元素不可重复、无序)
 */
public class CollectionTest {

	public static void main(String[] args) {
		/**
		 * List可重复集的父接口：(线性表)
		 * 两个常见子类实现：
		 * ArrayList(数组)   LinkedList(链表)
		 */
		List list = new ArrayList();
		list.add("abc");
		list.add("aab");
		//ArrayList重写了toString()方法
		System.out.println(list);
		
		list = new ArrayList<Point>();
		list.add(new Point(1,2));
		list.add(new Point(3,4));
		list.add(new Point(5,6));
		//包含使用equals的方法进行匹配
		System.out.println("两个Point是否相等"+list.contains(new Point(1,2)));
	
		List list1 = new ArrayList<String>();
		List list2 = new ArrayList<String>();
		List list3 = new ArrayList<String>();
		//第一个集合添加元素
		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		//第二个集合添加元素
		list2.add("four");
		list2.add("five");
		//第三个集合添加元素
		list3.add("One");
		list3.add("Two");
		//并集操作
		list1.addAll(list2);//[One,Two,Three,four,five]
		System.out.println(list1);
		//差集操作
		list1.removeAll(list3);//[Three,four,five]
		System.out.println(list1);
		//交集操作
		list1.retainAll(list2);//[four, five]
		System.out.println(list1);
	}

}
