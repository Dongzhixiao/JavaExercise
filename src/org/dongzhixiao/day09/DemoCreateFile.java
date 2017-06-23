package org.dongzhixiao.day09;

import java.io.File;
import java.io.IOException;

public class DemoCreateFile {

	public static void main(String[] args) {
		/**
		 * 两种方法创建文件：
		 * 1 直接指定data.dat位置，并调用createNewFile  前提：目录存在
		 * 2 先指定data.dat的目录，不存在都创建好，再创建文件！
		 */
		//1
//		File file = new File("."+File.separator+"demo"+File.separator+"A"+File.separator+"data.dat");
//		if(!file.exists()){
//			try {
//				file.createNewFile();
//				System.out.println("创建文件成功！");
//			} catch (IOException e) {
//				e.printStackTrace();
//				System.out.println("创建文件失败！");
//			}
//		}
		//2
		File dir = new File("."+File.separator+"demo"+File.separator+"A");
		if(!dir.exists()){
			dir.mkdirs();
		}
		File file = new File(dir,"data.dat");//第一个参数时父目录
		if(!file.exists()){
			try{
				file.createNewFile();
				System.out.println("创建文件成功！");
			}catch(IOException e){
				e.printStackTrace();
				System.out.println("创建文件失败！");
			}
		}
		
	}

}
