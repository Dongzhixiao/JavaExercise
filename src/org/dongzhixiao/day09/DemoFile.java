package org.dongzhixiao.day09;

import java.io.File;
import java.io.IOException;

/**
 * 
 * @author Administrator
 * File��
 */
public class DemoFile {

	public static void main(String[] args) {
		/**
		 * ·���������ļ�ϵͳ����ܴ�
		 * Linux��Windows�Ͳ�ͬ��
		 * 
		 * ������ʹ�����·��
		 *   .�ʹ���ǰ��Ŀ·��
		 *   
		 *   File.separator---->  win /     Linux \
		 */
		
		//File�����ļ�
		File file = new File("."+File.separator+"data.dat");
		if(!file.exists()){
			/**
			 * createNewFile()ǿ�Ʋ����쳣
			 */
			try {
				file.createNewFile();
				System.out.println("�����ļ��ɹ���");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("�����ļ�ʧ�ܣ�");
			}
		}
		//File�����ļ���
		try{
			File dir = new File("."+File.separator+"demo"+File.separator+"A");
			if(!dir.exists()){
//				dir.mkdir();
				dir.mkdirs();//���԰�û�еĸ�Ŀ¼Ҳ����������
				System.out.println("����Ŀ¼�ɹ���");
			}
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("����Ŀ¼ʧ�ܣ�");
		}
	}

}
