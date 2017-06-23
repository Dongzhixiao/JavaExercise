package org.dongzhixiao.day09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.RandomAccess;

/**
 * RandomAccessFile
 * 作用：读写文件内容
 * 计算机硬盘保存数据都是byte by byte 
 * 打开文件模式：
 * rw:打开文件后可读可写
 * r: 打开文件后只读
 */
public class DemoRandomAccessFile {

	public static void main(String[] args) {
		//向文件.\data.dat中写数据
		/**
		 * 1 创建File对象用于描述文件
		 * 2 不存在则创建该文件
		 * 3 创建RandomAccessFile,并将File传入
		 * 使RandomAccessFile对Fil表示的文件进行读写操作
		 * 4 向文件中写入内容
		 */
		//1
		File file = new File("data.dat");
		//2
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//3
		try {
			RandomAccessFile raf = new RandomAccessFile(file,"rw");
			//4
			//写一个int最大值
			//write(int)写一个字节
			/**
			 * 01111111 11111111 11111111 11111111
			 * 
			 * 00000000 00000000 00000000 01111111  | 00 00 00 7f
			 * 00000000 00000000 01111111 11111111  | 00 00 7f ff
			 * 00000000 01111111 11111111 11111111  | 00 7f ff ff
			 * 01111111 11111111 11111111 11111111  | 7f ff ff ff
			 */
			int i = 0x7fffffff; //int最大值
//			System.out.println("i："+i);
			raf.write(i>>>24);//写Int最大值8位
			raf.write(i>>>16);
			raf.write(i>>>8);
			raf.write(i);
			//将8个字节一次写入
			byte[] data = new byte[]{0,1,2,3,4,5,6,7,8,9};
			raf.write(data);
			//write(byte[] data,int off,int len)
			//data数组从off写len个
			raf.write(data, 2, 5);
			
			/**
			 *         01111111 11111111 11111111 11111111
			 * num:    00000000 00000000 00000000 00000000(initial)
			 * 	
			 * b<<24:  01111111 00000000 00000000 00000000
			 */
			int num = 0;
			//read() 读取一个字节，若结尾返回-1
			//read()之前要将文件指针放到文件开头！
			System.out.println("当前指针位置："+raf.getFilePointer());
			raf.seek(0); //千万不要忘记这个移动文件指针操作
			System.out.println("当前指针位置："+raf.getFilePointer());
			int b = raf.read();//读取第一个字节  7f
			System.out.println("当前指针位置："+raf.getFilePointer());
			num = num | (b<<24);
			b = raf.read();//读取第二个字节  ff
			System.out.println("当前指针位置："+raf.getFilePointer());
			num = num | (b<<16);
			b = raf.read();//读取第三个字节  ff
			System.out.println("当前指针位置："+raf.getFilePointer());
			num = num | (b<<8);
			b = raf.read();//读取第四个字节  ff
			System.out.println("当前指针位置："+raf.getFilePointer());
			num = num | b;
			
			System.out.println("int最大值："+num);
			
			raf.seek(0);//回到文件开始位置
			byte[] buf = new byte[1024];//1k容量
			int sum = raf.read(buf);//尝试读取1k数据
			System.out.println("总共读取字节数："+sum);
			System.out.println(Arrays.toString(buf));
			
			raf.close(); //最后一定要关闭
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
