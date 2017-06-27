package org.dongzhixiao.day09;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class DemoRandomAccessFile1 {

	public static void main(String[] args) {
		RandomAccessFile raf;
		try {
			raf = new RandomAccessFile("data.dat", "rw");
			//д���������ֵ
			raf.writeInt(Integer.MAX_VALUE); 
			raf.writeLong(Long.MAX_VALUE);
			//��UTF-8���뽫�ַ���д���ļ�
			raf.writeUTF("hello!");
			
			raf.seek(0);
			
			int intMax = raf.readInt();//������ȡ4���ֽڷ���int
			long longMax = raf.readLong();
			String info = raf.readUTF();
			System.out.println("���int��"+intMax);
			System.out.println("���long��"+longMax);
			System.out.println("�ַ�����"+info);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
