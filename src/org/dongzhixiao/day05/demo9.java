package org.dongzhixiao.day05;
/**
 * 
 * @author Administrator
 * ���غ���д������
 */
public class demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Woo w = new Woo();
		Super s = new Sub();
		w.t(s);  //���ط��������ɲ������;�������ʵ�����ö����޹�
		
	}

}
class Woo{
	public void t(Super obj){
		System.out.println("Goo t(Super)"); obj.s();//�������õ������õķ���
	}
	public void t(Sub obj){
		System.out.println("Goo t(Sub)"); obj.s();
	}
}
class Super{
	public void s(){
		System.out.println("Super s()");
	}
}
class Sub extends Super{
	public void s(){
		System.out.println("Sub s()");
	}
}