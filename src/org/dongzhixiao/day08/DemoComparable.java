package org.dongzhixiao.day08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author Administrator
 * 对集合进行自然排序
 * 确保集合中的元素是Comparable的子类！
 */
public class DemoComparable {
	
	public static void main(String[] args) {
		List<ComparablePoint> list = 
				new ArrayList<ComparablePoint>();
		list.add(new ComparablePoint(1, 5));
		list.add(new ComparablePoint(3, 4));
		list.add(new ComparablePoint(2, 2));
		
		System.out.println(list);
		//按照类本身提供的排序方式排序，即距离原点大小
		Collections.sort(list);
		System.out.println(list);
		
		/**
		 * 比较器方法，实现Comparator比较器的
		 * 抽象方法int compareTo(E o1,E o2)
		 * 返回大于零说明o1比o2大！
		 * 
		 * Collections.sort提供了一个重载方法，
		 * 传入一个compareTo，即使用外部的排序规则！
		 */
		//自定义排序规则，按照x大小排序
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
