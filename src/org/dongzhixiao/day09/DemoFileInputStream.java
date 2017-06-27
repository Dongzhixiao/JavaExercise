package org.dongzhixiao.day09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * �����������л�����������������ת��Ϊ�ֽ�����Ĺ���
 *      �־û���������д����̵Ĺ���
 *
 *���ݷ�������Ϊ���������������
 *�����ۻ������ǳ���
 *	a �������ǳ�������У�������
 *	b �ӳ��������������У������
 *
 * java��
 *	InputStream:�����������������Ľӿ�
 *  OutputStream:����������������Ľӿ�
 *  
 * ������Դͷ��Ϊ��
 * 	������(�ڵ���):����Դ
 * 	������(�߼�����������):û��������Դ�����ܶ������ڡ����Ĵ��������ڴ����������
 * 
 * �����ݴ�������ݵ�λ��ͬ����Ϊ��
 * 	�ֽ�����stream
 * 	�ַ�����Reader/Writer
 */
/**
 * ���ڶ�д�ļ����ֽ���FIS/FOS
 * FileInputStream:  �ļ�������
 * FileOutputStream: �ļ������
 */
public class DemoFileInputStream {

	public static void main(String[] args) {
		File file = new File("data.dat");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			int b = 0;
			while((b = fis.read())!=-1){
				//�������ֽڵ�16������ʽ
				System.out.print(Integer.toHexString(b)+" ");
			}
			if(fis!=null)
				fis.close();//�мǣ���������Ҫ
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
