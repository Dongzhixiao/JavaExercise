package org.dongzhixiao.day09;

import java.io.File;
import java.io.IOException;

public class DemoCreateFile {

	public static void main(String[] args) {
		/**
		 * ���ַ��������ļ���
		 * 1 ֱ��ָ��data.datλ�ã�������createNewFile  ǰ�᣺Ŀ¼����
		 * 2 ��ָ��data.dat��Ŀ¼�������ڶ������ã��ٴ����ļ���
		 */
		//1
//		File file = new File("."+File.separator+"demo"+File.separator+"A"+File.separator+"data.dat");
//		if(!file.exists()){
//			try {
//				file.createNewFile();
//				System.out.println("�����ļ��ɹ���");
//			} catch (IOException e) {
//				e.printStackTrace();
//				System.out.println("�����ļ�ʧ�ܣ�");
//			}
//		}
		//2
		File dir = new File("."+File.separator+"demo"+File.separator+"A");
		if(!dir.exists()){
			dir.mkdirs();
		}
		File file = new File(dir,"data.dat");//��һ������ʱ��Ŀ¼
		if(!file.exists()){
			try{
				file.createNewFile();
				System.out.println("�����ļ��ɹ���");
			}catch(IOException e){
				e.printStackTrace();
				System.out.println("�����ļ�ʧ�ܣ�");
			}
		}
		
	}

}
