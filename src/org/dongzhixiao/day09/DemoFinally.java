package org.dongzhixiao.day09;

/**
 * 
 * @author Administrator
 * finally�鶨����catch�����ֻ�ܳ���һ�Σ����߲����֣�
 * ���۳����Ƿ������ִ�У�������ִ�У�
 * 
 * ע��final��finally������
 */
public class DemoFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try{
//			String info = "123456";
//			System.out.print("�ַ�����ʮ���ַ���"+info.charAt(9));
//		}catch(NullPointerException e){
//			e.printStackTrace();
//		}finally{
//			System.out.println("finally!");
//		}
//		System.out.println("�������!");
		
		
		System.out.println(
				test(null)+","+test("0")+","+test(""));
		//������Ϊ��  1,0,2    ʵ����4,4,4
		//��ס��finally������ִ�У������return 4��ǰ��ĸ����ˣ�
	}
	
	public static int test(String str){
		try{
			return str.charAt(0) - '0';
		}catch(NullPointerException e){
			return 1;
		}catch(RuntimeException e){
			return 2;
		}catch(Exception e){
			return 3;
		}finally{//������ִ��
			return 4;
		}
	}

}
