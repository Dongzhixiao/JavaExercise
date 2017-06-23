package org.dongzhixiao.day08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * @author Administrator
 * Set集合   无序且不重复
 * 常用实现类：
 * 	HashSet:使用散列函数算法实现Set集合
 */
public class DemoSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		/**
		 * Set没有get(int index)方法
		 * 需要使用Iteratro获取元素
		 */
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		//java1.5之后！
		for(String element:set){
			System.out.println(element);
		}
	}

}
