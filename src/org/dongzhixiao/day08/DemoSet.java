package org.dongzhixiao.day08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * @author Administrator
 * Set����   �����Ҳ��ظ�
 * ����ʵ���ࣺ
 * 	HashSet:ʹ��ɢ�к����㷨ʵ��Set����
 */
public class DemoSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		/**
		 * Setû��get(int index)����
		 * ��Ҫʹ��Iteratro��ȡԪ��
		 */
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		//java1.5֮��
		for(String element:set){
			System.out.println(element);
		}
	}

}
