package org.dongzhixiao.day06;
/**
 * 
 * @author Administrator
 * interface ��� abstract class
 * �ӿ���ֻ���������󷽷��ͳ���
 * �ӿڿ��Զ���������ӿڲ���ʵ�������ӿ�ֻ�ܱ�ʵ��
 * ������ʵ��һ�����������ʵ��ȫ�����󷽷�
 * ���������ͬʱʵ�ֶ���ӿڣ�����̳�
 */

public class demo4{
	public static void main(String[] args){
		Cat tom = new Cat();
		Hunter hunter = tom;
		Runner runner = tom;
		hunter.hunt();
		runner.run();
//		runner.hunt(); //�������Runner��û�ж���hunt����
	}
}
class Cat implements Hunter,Runner{//Runner���Բ��ӣ�һ��
	@Override
	public void hunt() {
		// TODO Auto-generated method stub
		System.out.println("ץ����ȥ��");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�ٶ���"+SPEED);
	}
}
interface Hunter extends Runner{//��������
	void hunt();//����
}
interface Runner {
	/* public static final */ int SPEED = 100;
	/* public abstract */ void run();
}
