package org.dongzhixiao.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * ʹ�û����ַ���������ȡ����������Ϣ
 * @author Administrator
 *
 */
public class DemoSystemIn {

    public static void main(String[] args) throws IOException {
        //������������ת��Ϊ�ַ���������ת��Ϊ�����ַ�������
        //1 �����̵��ֽ�������ת��Ϊ�ַ�������
       InputStreamReader isr = new InputStreamReader(System.in);
       
       //2 ʹ�û����ַ��������������ж�ȡ
       BufferedReader reader = new BufferedReader(isr);
       
       //ѭ����ȡ�û�������Ϣ�����������̨
       String info = null;
       while(true){
           info = reader.readLine();
           if("exit".equals(info.trim())){
               break;
           }
           System.out.println(info);
       }
    }

}
