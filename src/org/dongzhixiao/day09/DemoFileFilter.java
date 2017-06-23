package org.dongzhixiao.day09;

import java.io.File;
import java.io.FileFilter;

/**
 * 
 * @author Dongzhixiao
 *
 */
public class DemoFileFilter {

	public static void main(String[] args) {
		// ����һ���ļ�������������.java�ļ�
		FileFilter filter = new FileFilter(){
			/**
			 * ������������Ĳ���pathname�ǽ����˵�Ŀ¼�е�ÿ��
			 * �������δ������ƥ��
			 * ����������������true�����򷵻�false
			 */
			@Override
			public boolean accept(File pathname) {
				//�����ļ�����.java��β��
				//Ҳ���Լ����������������������ļ���С�ȡ���
				return pathname.getName().endsWith(".java");
			}
		};
		//����һ��Ŀ¼
		File dir = new File(".");
		//��ȡ���������������
		File[] sub = dir.listFiles(filter);//�ص�ģʽ�������ص�ʹ�÷������ṩ���߼��������У���ť��������������Ӧ��
		for(File file:sub){
			System.out.println(file);
		}
	}

}