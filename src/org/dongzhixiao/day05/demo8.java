package org.dongzhixiao.day05;
/**
 * 
 * @author Administrator
 * ���԰󶨵��������ͣ��ɱ������;��������ĸ�����
 * ������̬�󶨵������ɶ�������;��������ĸ�����
 */
public class demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cheater c = new Cheater();
		Person p = c;
		System.out.println(p.name+","+c.name);  //���ݱ������Ͳ�������
		p.whoau(); c.whoau();  //����ʵ�ʶ�����ҷ���
	}

}
class Person{
	String name = "��̫��";
	public void whoau(){
		System.out.println(this.name);
	}
}
class Cheater extends Person{
	String name = "ϲ����";
	public void whoau(){
		System.out.println(this.name);
	}
}