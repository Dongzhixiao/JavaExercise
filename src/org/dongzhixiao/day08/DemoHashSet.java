package org.dongzhixiao.day08;

import java.util.HashSet;
import java.util.Set;

public class DemoHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Point> set = new HashSet<Point>();
		
		set.add(new Point(1,2));
		set.add(new Point(3,4));
		
		/**
		 * ͨ��hashcodeֵ�ҵ�Ԫ�ص�λ�ã�
		 * Ȼ��ʹ��equals�����Ƚ�
		 */
		System.out.println(set.contains(new Point(1,2)));
		
	}

}
