package org.dongzhixiao.day09;

import java.io.File;
import java.io.IOException;

/**
 * 
 * @author Administrator
 * File类
 */
public class DemoFile {

	public static void main(String[] args) {
		/**
		 * 路径描述的文件系统差异很大
		 * Linux和Windows就不同！
		 * 
		 * 因此最好使用相对路径
		 *   .就代表当前项目路径
		 *   
		 *   File.separator---->  win /     Linux \
		 */
		
		//File创建文件
		File file = new File("."+File.separator+"data.dat");
		if(!file.exists()){
			/**
			 * createNewFile()强制捕获异常
			 */
			try {
				file.createNewFile();
				System.out.println("创建文件成功！");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("创建文件失败！");
			}
		}
		//File创建文件夹
		try{
			File dir = new File("."+File.separator+"demo"+File.separator+"A");
			if(!dir.exists()){
//				dir.mkdir();
				dir.mkdirs();//可以把没有的父目录也创建出来！
				System.out.println("创建目录成功！");
			}
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("创建目录失败！");
		}
	}

}
