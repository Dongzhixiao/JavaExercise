package org.dongzhixiao.day09;
/**
 * 
 * @author Administrator
 * java�쳣�������
 * Exception: ���򼶱����ǿɿ�
 * Error:     ϵͳ�������ǲ��ɿ�
 * 
 * java�쳣Exception��Ϊ
 * ����ʱ�쳣������ʱ������쳣
 * �ɼ���쳣������ʱ���
 * 
 * RuntimeException:����ʱ�쳣
 * ���������׳����쳣���������࣬��ô��������ʱ����
 * ����throws���оٸ����׳����쳣��
 */
public class DemoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String info = "hello";
			System.out.println(info.length());
			
			System.out.println("��ʮ���ַ���"+info.charAt(9));
			
			
		}catch(NullPointerException	e){
			System.out.println("�����п�ָ��");
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("�ַ�û����ô��");
		}catch(Exception e){//ע�⣬���෿�������棬���������棡
			//����ϰ�ߣ����дһ������쳣������δ֪���󣬱�֤����һֱ����
			System.out.println("������ĳ��δ֪�쳣");
		}
		System.out.println("���������");
	}

}
