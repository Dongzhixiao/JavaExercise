package org.dongzhixiao.day03;

import java.util.Scanner;
/**
 * 
 * @author Administrator
 * ע�⣻�Ƚ��ַ����Ƿ���ȱ�����equals����������ʹ��==���������
 * "1".equals(cmd)��cmd.equals("1")Ҫ�ã���
 */
public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		while(true){
			System.out.println("ѡ���ܣ� \n1.�鿴ȫ�� \n2.ɾ�� ��\n3.��� \n0.�˳� \n��ѡ��");
			String cmd = console.nextLine();
			if("1".equals(cmd)){
				System.out.println("�鿴ȫ��");
			}else if("2".equals(cmd)){
				System.out.println("ɾ��");
			}else if("3".equals(cmd)){
				System.out.println("���");
			}else if("0".equals(cmd)){
				System.out.println("bye!");
				break;
			}else{
				System.out.println("�������");
			}
		}	
	}

}
