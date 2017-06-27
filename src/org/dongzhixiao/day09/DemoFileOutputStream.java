package org.dongzhixiao.day09;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * �����ļ������
 * FileOutputStream
 * @author Administrator
 *	
 */
public class DemoFileOutputStream {

	public static void main(String[] args) {
		try{
			File file = new File("out.dat");
			if(!file.exists()){
				file.createNewFile();
			}
			
			FileOutputStream fos = new FileOutputStream(file,true);//true׷������,Ĭ��false����ֱ���滻
			String info = "��ã��������";
			byte[] data = info.getBytes("UTF-8");
			fos.write(data);
			fos.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
