package org.dongzhixiao.day05;
/**
 * 
 * @author Administrator
 * 1)���������ܼ̳�
 * 2)���๹����Ĭ�ϵ��ø������޲ι�����
 * 3)���������û���޲���������������ʹ��super()���ø��๹����
 * 
 * ����super(): һ�������๹������һ��ʹ�ã�
 */
public class demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Yoo yoo = new Yoo();
	}

}
class Xoo{
	public Xoo(int s){
		System.out.println("Call Xoo(int)");
	}
}
//class Yoo extends Xoo{}  //������󣬸�����û���޲���������
class Yoo extends Xoo{
	public Yoo(){
		super(100);
	}
}