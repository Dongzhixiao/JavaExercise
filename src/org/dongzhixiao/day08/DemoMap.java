package org.dongzhixiao.day08;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Administrator
 * Map数据结构
 * 存放数据以 key-value的形式成对保存
 * Map保存的数据可以重复，但是key不可以！
 * 如果保存相同的key会替换！
 * 
 */
public class DemoMap {

	public static void main(String[] args) {
		/**
		 * Map使用两个约束泛型，一个key，一个value
		 */
		Map<String,Point> map = new HashMap<String, Point>();
		map.put("1,2", new Point(1,2));
		map.put("3,4", new Point(3,4));
		
		System.out.println(map);
		
		map.put("1,2", new Point(5,6));
		
		System.out.println(map);
		//取出元素,原则上使用前先检测是否有这个元素，否则返回null
		Point p = map.get("1,2");
		System.out.println("x="+p.getX()+",y="+p.getY());
		
		/**
		 * boolean containsKey(K key)
		 * boolean containsValus(V value);
		 */
		//统计数字出现几次
		String str = "123,456,789,456,789,225,698,759,456";
		String[] array = str.split(",");//拆分如果后面有好多逗号，则都不要了，而左边和中间都有效果
		Map<String,Integer> numMap = new HashMap<String, Integer>();
		for(String temStr : array){
			if(numMap.containsKey(temStr)){ 
				numMap.put(temStr,numMap.get(temStr)+1);
			}else{
				numMap.put(temStr, 1);
			}
		}
		System.out.println(numMap);
	}

}
