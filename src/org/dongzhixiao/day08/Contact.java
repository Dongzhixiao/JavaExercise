package org.dongzhixiao.day08;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Administrator
 * ��ϵ����Ϣ
 */
public class Contact {
	//������Ҫ���Ե�map
	Map<String,String> fields = new HashMap<String,String>();
	
	public void set(String propertyName,String propertyValue){
		fields.put(propertyName, propertyValue);
	}
	
	public String get(String propertyName){
		return fields.get(propertyName);
	}
	
	@Override
	public String toString() {
		return fields.toString();
	}
}
