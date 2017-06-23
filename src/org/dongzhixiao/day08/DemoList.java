package org.dongzhixiao.day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.dongzhixiao.day07.Point;

/**
 * 
 * @author Administrator
 * List元素用于修改和查询
 */
public class DemoList {

	public static void main(String[] args) {
		//get(int index)方法得到集合元素,  无序集合没有该方法！
		List list1 = new ArrayList();
		list1.add("One");list1.add("Two");
		System.out.println(list1.get(0));
		//set(int index,Object newElement)方法修改集合元素
		List list2 = new ArrayList();
		list2.add("One");list2.add("Two");
		list2.set(0, "Zero");
		System.out.println(list2.get(0));
		list2.add(0,"Three");//中间插入
		System.out.println(list2);
		
		//删除元素
		Object obj = list2.remove(1);
		System.out.println("list2移除的元素是："+obj+"\n剩下的元素是："+list2);
		
		Object[] array = list1.toArray();
		System.out.println(Arrays.toString(array));
		
		List list = new ArrayList();
		list.add(new Point(1, 2));
		list.add(new Point(2, 3));
		list.add(new Point(4, 5));
		//根据传入类型返回数组类型，传入的参数用不到，因此设置0的长度即可
		Point[] array1 = (Point[])list.toArray(new Point[0]);
		for(int i = 0; i<array1.length; ++i){
			Point p = array1[i];
			System.out.println(p.getX());
		}
		
	}

}
