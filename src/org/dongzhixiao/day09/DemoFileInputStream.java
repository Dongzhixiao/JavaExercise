package org.dongzhixiao.day09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 基本类型序列化：将基本类型数据转换为字节数组的过程
 *      持久化：将数据写入磁盘的过程
 *
 *根据方向流分为：输入流和输出流
 *方向定论基于我们程序：
 *	a 流向我们程序的流叫：输入流
 *	b 从程序向外流的流叫：输出流
 *
 * java中
 *	InputStream:定义了输入流特征的接口
 *  OutputStream:定义了输出流特征的接口
 *  
 * 流根据源头分为：
 * 	基本流(节点流):有来源
 * 	处理流(高级流，过滤流):没有数据来源。不能独立存在。它的存在是用于处理基本流的
 * 
 * 流根据处理的数据单位不同划分为：
 * 	字节流：stream
 * 	字符流：Reader/Writer
 */
/**
 * 用于读写文件的字节流FIS/FOS
 * FileInputStream:  文件输入流
 * FileOutputStream: 文件输出流
 */
public class DemoFileInputStream {

	public static void main(String[] args) {
		File file = new File("data.dat");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			int b = 0;
			while((b = fis.read())!=-1){
				//输出这个字节的16进制形式
				System.out.print(Integer.toHexString(b)+" ");
			}
			if(fis!=null)
				fis.close();//切记，流用完了要
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
