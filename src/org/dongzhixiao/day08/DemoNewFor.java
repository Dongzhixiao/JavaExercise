package org.dongzhixiao.day08;

import java.util.ArrayList;
import java.util.List;

public class DemoNewFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		for (int e : array) {
			System.out.println(e);
		}

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; ++i) {
			list.add(i);
		}
		List<Integer> subList = list.subList(3, 8);
		for(int i=0;i<subList.size();++i){
			subList.set(i, subList.get(i)*10);
		}
		System.out.println(subList);
		System.out.println(list);//修改子集，原来集合的内容也变了！
	}

}
