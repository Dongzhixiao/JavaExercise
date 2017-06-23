package org.dongzhixiao.day08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 * @author Administrator
 * 遍历HashMap
 * 获得所有的Key并根据key获取value从而达到遍历的效果
 * 
 * keySet方法得到所有key的集合
 */
public class DemoHashMap {

	public static void main(String[] args) {
		Map<String,Point> map = new HashMap<String,Point>();
		
		map.put("1,2", new Point(1,2));
		map.put("2,3", new Point(2,3));		
		map.put("4,5", new Point(4,5));
		map.put("3,4", new Point(3,4));
		
		Set<String> keyset = map.keySet();
		//一种方法遍历
		for(String key:keyset){
			Point p = map.get(key);
			System.out.println(p);
		}
		//另一种方法遍历
		for(Iterator<String> it = keyset.iterator();it.hasNext();){
			String key = it.next();
			Point p = map.get(key);
			System.out.println(p);
		}
		/**
		 * LinkedHashMap与HashMap用法一样
		 * 但是内部维护一个链表，使得其存放顺序与迭代
		 * 时一致！！！
		 */
		Map<String,Point> LMap = new LinkedHashMap<String,Point>();
		
		LMap.put("1,2", new Point(1,2));
		LMap.put("2,3", new Point(2,3));
		LMap.put("4,5", new Point(4,5));
		LMap.put("3,4", new Point(3,4));
		
		Set<Entry<String,Point>> entrySet = LMap.entrySet();
		for(Entry<String,Point> entry: entrySet){
			String key = entry.getKey();
			Point p = entry.getValue();
			System.out.print("key:"+key+" value:"+p);
		}
	}

}
