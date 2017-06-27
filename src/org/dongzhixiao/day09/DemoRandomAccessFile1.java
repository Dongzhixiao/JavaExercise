package org.dongzhixiao.day09;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class DemoRandomAccessFile1 {

	public static void main(String[] args) {
		RandomAccessFile raf;
		try {
			raf = new RandomAccessFile("data.dat", "rw");
			//写入整数最大值
			raf.writeInt(Integer.MAX_VALUE); 
			raf.writeLong(Long.MAX_VALUE);
			//以UTF-8编码将字符串写入文件
			raf.writeUTF("hello!");
			
			raf.seek(0);
			
			int intMax = raf.readInt();//连续读取4个字节返回int
			long longMax = raf.readLong();
			String info = raf.readUTF();
			System.out.println("最大int："+intMax);
			System.out.println("最大long："+longMax);
			System.out.println("字符串："+info);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
