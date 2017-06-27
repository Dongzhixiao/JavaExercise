package org.dongzhixiao.day09;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 测试文件输出流
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
			
			FileOutputStream fos = new FileOutputStream(file,true);//true追加内容,默认false，即直接替换
			String info = "你好！输出流！";
			byte[] data = info.getBytes("UTF-8");
			fos.write(data);
			fos.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
