package org.dongzhixiao.day09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyFile {

	public static void main(String[] args) {
		/**
		 *  �����ļ�����
		 *  1 ����һ��RandomAccessFile���ڶ�ȡ�ļ�
		 *  2 ����һ��RandomAccessFile����д���ļ�
		 *  3��ȡ�ļ��������ֽڵ��������ļ�
		 */
		try {
			//1
			File file = new File("day09.txt");
			RandomAccessFile src = new RandomAccessFile(file,"r");
			//2
			File desFile = new File("day09_copy.txt");
			RandomAccessFile des = new RandomAccessFile(desFile,"rw");
			//3 ��
//			int data = 0;//���ڱ���ÿ����ȡ���ֽ�
//			//��ȡһ���ֽڣ�ֻҪ����-1(�ļ�ĩβ)���ͽ��и���
//			while((data = src.read())!=-1){
//				des.write(data);
//			}
			//3 ��
			byte[] buff = new byte[1024*100];
			int sum = 0 ;//ÿ�ζ�ȡ���ֽ���
			while((sum = src.read(buff))>0){
				des.write(buff,0,sum);
			}
			
			src.close();
			des.close();
			System.out.println("���Ƴɹ���");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
