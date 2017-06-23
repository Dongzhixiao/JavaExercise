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
 * ����HashMap
 * ������е�Key������key��ȡvalue�Ӷ��ﵽ������Ч��
 * 
 * keySet�����õ�����key�ļ���
 */
public class DemoHashMap {

	public static void main(String[] args) {
		Map<String,Point> map = new HashMap<String,Point>();
		
		map.put("1,2", new Point(1,2));
		map.put("2,3", new Point(2,3));		
		map.put("4,5", new Point(4,5));
		map.put("3,4", new Point(3,4));
		
		Set<String> keyset = map.keySet();
		//һ�ַ�������
		for(String key:keyset){
			Point p = map.get(key);
			System.out.println(p);
		}
		//��һ�ַ�������
		for(Iterator<String> it = keyset.iterator();it.hasNext();){
			String key = it.next();
			Point p = map.get(key);
			System.out.println(p);
		}
		/**
		 * LinkedHashMap��HashMap�÷�һ��
		 * �����ڲ�ά��һ������ʹ������˳�������
		 * ʱһ�£�����
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
