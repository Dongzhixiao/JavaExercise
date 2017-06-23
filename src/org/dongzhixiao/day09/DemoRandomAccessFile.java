package org.dongzhixiao.day09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.RandomAccess;

/**
 * RandomAccessFile
 * ���ã���д�ļ�����
 * �����Ӳ�̱������ݶ���byte by byte 
 * ���ļ�ģʽ��
 * rw:���ļ���ɶ���д
 * r: ���ļ���ֻ��
 */
public class DemoRandomAccessFile {

	public static void main(String[] args) {
		//���ļ�.\data.dat��д����
		/**
		 * 1 ����File�������������ļ�
		 * 2 �������򴴽����ļ�
		 * 3 ����RandomAccessFile,����File����
		 * ʹRandomAccessFile��Fil��ʾ���ļ����ж�д����
		 * 4 ���ļ���д������
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
			//дһ��int���ֵ
			//write(int)дһ���ֽ�
			/**
			 * 01111111 11111111 11111111 11111111
			 * 
			 * 00000000 00000000 00000000 01111111  | 00 00 00 7f
			 * 00000000 00000000 01111111 11111111  | 00 00 7f ff
			 * 00000000 01111111 11111111 11111111  | 00 7f ff ff
			 * 01111111 11111111 11111111 11111111  | 7f ff ff ff
			 */
			int i = 0x7fffffff; //int���ֵ
//			System.out.println("i��"+i);
			raf.write(i>>>24);//дInt���ֵ8λ
			raf.write(i>>>16);
			raf.write(i>>>8);
			raf.write(i);
			//��8���ֽ�һ��д��
			byte[] data = new byte[]{0,1,2,3,4,5,6,7,8,9};
			raf.write(data);
			//write(byte[] data,int off,int len)
			//data�����offдlen��
			raf.write(data, 2, 5);
			
			/**
			 *         01111111 11111111 11111111 11111111
			 * num:    00000000 00000000 00000000 00000000(initial)
			 * 	
			 * b<<24:  01111111 00000000 00000000 00000000
			 */
			int num = 0;
			//read() ��ȡһ���ֽڣ�����β����-1
			//read()֮ǰҪ���ļ�ָ��ŵ��ļ���ͷ��
			System.out.println("��ǰָ��λ�ã�"+raf.getFilePointer());
			raf.seek(0); //ǧ��Ҫ��������ƶ��ļ�ָ�����
			System.out.println("��ǰָ��λ�ã�"+raf.getFilePointer());
			int b = raf.read();//��ȡ��һ���ֽ�  7f
			System.out.println("��ǰָ��λ�ã�"+raf.getFilePointer());
			num = num | (b<<24);
			b = raf.read();//��ȡ�ڶ����ֽ�  ff
			System.out.println("��ǰָ��λ�ã�"+raf.getFilePointer());
			num = num | (b<<16);
			b = raf.read();//��ȡ�������ֽ�  ff
			System.out.println("��ǰָ��λ�ã�"+raf.getFilePointer());
			num = num | (b<<8);
			b = raf.read();//��ȡ���ĸ��ֽ�  ff
			System.out.println("��ǰָ��λ�ã�"+raf.getFilePointer());
			num = num | b;
			
			System.out.println("int���ֵ��"+num);
			
			raf.seek(0);//�ص��ļ���ʼλ��
			byte[] buf = new byte[1024];//1k����
			int sum = raf.read(buf);//���Զ�ȡ1k����
			System.out.println("�ܹ���ȡ�ֽ�����"+sum);
			System.out.println(Arrays.toString(buf));
			
			raf.close(); //���һ��Ҫ�ر�
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
