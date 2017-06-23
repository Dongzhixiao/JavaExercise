package org.dongzhixiao.day08;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Administrator
 * Map���ݽṹ
 * ��������� key-value����ʽ�ɶԱ���
 * Map��������ݿ����ظ�������key�����ԣ�
 * ���������ͬ��key���滻��
 * 
 */
public class DemoMap {

	public static void main(String[] args) {
		/**
		 * Mapʹ������Լ�����ͣ�һ��key��һ��value
		 */
		Map<String,Point> map = new HashMap<String, Point>();
		map.put("1,2", new Point(1,2));
		map.put("3,4", new Point(3,4));
		
		System.out.println(map);
		
		map.put("1,2", new Point(5,6));
		
		System.out.println(map);
		//ȡ��Ԫ��,ԭ����ʹ��ǰ�ȼ���Ƿ������Ԫ�أ����򷵻�null
		Point p = map.get("1,2");
		System.out.println("x="+p.getX()+",y="+p.getY());
		
		/**
		 * boolean containsKey(K key)
		 * boolean containsValus(V value);
		 */
		//ͳ�����ֳ��ּ���
		String str = "123,456,789,456,789,225,698,759,456";
		String[] array = str.split(",");//�����������кöය�ţ��򶼲�Ҫ�ˣ�����ߺ��м䶼��Ч��
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
