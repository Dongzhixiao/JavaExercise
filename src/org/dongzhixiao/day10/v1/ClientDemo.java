package org.dongzhixiao.day10.v1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * MINA��ܣ���Դsocket��ܡ��ܶ���Ϸ��������ͨ�ſ��ȫ����
 * @author Administrator
 *
 */

public class ClientDemo {
    private Socket socket;
    /**
     * �������Ӳ��������������Ϣ
     * ���裺
     *  1��ͨ���������ĵ�ַ���˿������������
     *    ����Socketʱ��Ҫ������������
     *  2.���ӳɹ������ͨ��Socket��ȡ�������������
     *    ʹ�����������շ���˷��͹�������Ϣ
     *    ʹ�����������Ϣ���͸������
     *  3.�ر�����
     */
    public void send(){
        try{
            System.out.println("��ʼ���ӷ�����");
            /**
             * 1 ���ӷ�����
             *  һ��Socket��ʵ��������ô���Ϳ�ʼͨ�������ĵ�ַ�Ͷ˿ں�ȥ����
             *  ��������������ӡ�
             *  ����ĵ�ַ"localhost"�Ƿ������ĵ�ַ
             *  8088�˿��Ƿ���������Ķ˿ڡ�
             *  ��������Ķ˿���ϵͳ����ģ���������֪��
             */
            socket = new Socket("localhost",8088);//localhostһ��ָ����
            /**
             * �ͷ�����ͨ��(��д����)
             * ʹ��socket��ȡ����������
             */
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            /**
             * ���������ɴ����ַ����Ļ����ַ������
             */
            PrintWriter writer = new PrintWriter(out);
            writer.println("��ã���������");
            /**
             * ע�⣬д��������Ļ��������ˣ���û�������ķ��͡�
             * ��ջ�����
             */
            writer.flush();
            
            /**
             * ��������ת��Ϊ�����ַ�������
             */
            BufferedReader reader = new BufferedReader(
                                      new InputStreamReader(in)
                                      );
            /**
             * ��ȡ���������͹�������Ϣ
             */
            String info = reader.readLine();//��ȡ��������Ϣ������
            System.out.println(info);
            
            writer.println("�ټ�����������");
            writer.flush();
            
            info = reader.readLine();
            System.out.println(info);
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        ClientDemo demo = new ClientDemo();
        demo.send();//���ӷ�������ͨ��
        
        
    }
}
