package org.dongzhixiao.day08;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author Administrator
 * ����Queue�ӿڣ�
 * offer:��Ԫ�ط������
 * poll:��Ԫ��ȡ��
 * peek:��ȡԪ�أ����ǲ�ɾ��
 * LinkedList�Ƕ��е����࣡
 * 
 * Deque:ջ�ӿ�
 * push
 * pop
 */
public class DemoQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> qp = new LinkedList<String>();
		qp.offer("A");qp.offer("B");qp.offer("C");
		System.out.println(qp);
		
		System.out.println("����"+qp.peek());
		
		//����ȡ��Ԫ��Ϊnull˵���Ѿ�û��
		String element = null;
		while((element = qp.poll())!=null){
			System.out.println(element);
		}
		
		Deque<Character> deque = new LinkedList<Character>();
		for(int i = 0;i<5;++i){
			deque.push((char)('A'+i));
		}
		System.out.println(deque);
		/**
		 * ʹ��popǰ��Ҫ����peek������ȡ��Ԫ��
		 * ȷ������null����²�Ӧ�ý�Ԫ�ش�ջ�С�������
		 * ����û��Ԫ�غ󣬵���pop����֡�NuSuchElementException"
		 * �쳣
		 */
		while((deque.peek())!=null){
			//System.out.println(deque.peek());
			System.out.println(deque.pop());
		}
	}

}
