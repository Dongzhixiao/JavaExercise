package org.dongzhixiao.day09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyFile {

	public static void main(String[] args) {
		/**
		 *  复制文件操作
		 *  1 创建一个RandomAccessFile用于读取文件
		 *  2 创建一个RandomAccessFile用于写入文件
		 *  3读取文件中所有字节到被拷贝文件
		 */
		try {
			//1
			File file = new File("day09.txt");
			RandomAccessFile src = new RandomAccessFile(file,"r");
			//2
			File desFile = new File("day09_copy.txt");
			RandomAccessFile des = new RandomAccessFile(desFile,"rw");
			//3 慢
//			int data = 0;//用于保存每个读取的字节
//			//读取一个字节，只要不是-1(文件末尾)，就进行复制
//			while((data = src.read())!=-1){
//				des.write(data);
//			}
			//3 快
			byte[] buff = new byte[1024*100];
			int sum = 0 ;//每次读取的字节数
			while((sum = src.read(buff))>0){
				des.write(buff,0,sum);
			}
			
			src.close();
			des.close();
			System.out.println("复制成功！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
