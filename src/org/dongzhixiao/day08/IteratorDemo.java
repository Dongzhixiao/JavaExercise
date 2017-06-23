package org.dongzhixiao.day08;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("#");
		list.add("two");
		list.add("#");
		list.add("three");
		list.add("#");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String element = it.next();
			if("#".equals(element)){
//				list.remove(element);//不可以这样删除
				it.remove();
			}
			System.out.println(element);
		}
		System.out.println(list);
		
		String tem = list.get(0);
	}

}
