package org.dongzhixiao.day08;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author Administrator
 * 队列Queue接口：
 * offer:将元素放入队列
 * poll:将元素取出
 * peek:获取元素，但是不删除
 * LinkedList是队列的子类！
 * 
 * Deque:栈接口
 * push
 * pop
 */
public class DemoQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> qp = new LinkedList<String>();
		qp.offer("A");qp.offer("B");qp.offer("C");
		System.out.println(qp);
		
		System.out.println("队首"+qp.peek());
		
		//队列取出元素为null说明已经没了
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
		 * 使用pop前需要先用peek方法获取该元素
		 * 确定不是null情况下才应该将元素从栈中“弹出”
		 * 否则没有元素后，调用pop会出现“NuSuchElementException"
		 * 异常
		 */
		while((deque.peek())!=null){
			//System.out.println(deque.peek());
			System.out.println(deque.pop());
		}
	}

}
