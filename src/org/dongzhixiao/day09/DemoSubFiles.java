package org.dongzhixiao.day09;

import java.io.File;

/**
 * 
 * @author Administrator
 * Ŀ¼�µ���Ŀ¼���ļ�
 */
public class DemoSubFiles {

	public static void main(String[] args) {
		File dir = new File(".");
		//�Ƿ�Ϊһ��Ŀ¼
		if(dir.exists()&&dir.isDirectory()){
			//��ȡ��ǰĿ¼������(Ŀ¼�����ļ�)
			File[] files = dir.listFiles();
			for(File file : files){
				if(file.isFile()){
					System.out.println("�ļ�:"+file.getName());
				}else{
					System.out.println("Ŀ¼:"+file.getName());
				}
			}
		}
		
		//ɾ���ļ�      ɾ����Ŀ¼��data.dat   ֱ��д�����Ŀ¼
		File file1 = new File("data.dat"); 
		if(file1.exists()){
			if(file1.delete()){
				System.out.println("ɾ���ɹ�");
			}else{
				System.out.println("ɾ��ʧ��");
			}				
		}
		//ע�⣺���Ϸ���ɾĿ¼������Ŀ¼����û��������ܳɹ���
	}

}
