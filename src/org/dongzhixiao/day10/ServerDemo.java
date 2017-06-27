package org.dongzhixiao.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * �����
 * @author Administrator
 *
 */
public class ServerDemo {
    private ServerSocket socket;
    private int port = 8088;
    /**
     * ����ServerDemo����ʱ�ʹ򿪷���˿�
     */
    public ServerDemo(){
        try {
            /*
             * ServerSocket���췽��Ҫ�����Ǵ���Ҫ�򿪵Ķ˿ں�
             * ServerSocket�����ڴ���ʱ�������ϵͳ���������˿�
             */
            socket = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * ��ʼ����
     * �ȴ����տͻ��˵���������ͨ��
     */
    public void start(){
        try{
            System.out.println("�ȴ��ͻ�������...");
            /*
             * ͨ������ServerSocket��accept������ʹ��������ʼ
             * �ȴ����տͻ��˵�����
             * �÷�����һ����������
             * ֱ���ͻ����������ӣ�����÷����������
             */
            Socket s = socket.accept();
            
            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();
            
            PrintWriter writer = new PrintWriter(out);
            BufferedReader reader = new BufferedReader(
                                      new InputStreamReader(in)
                                      );
            
            //�����ͻ��˷��͵���Ϣ
            String info = reader.readLine();//����
            System.out.println(info);
            
            //������Ϣ���ͻ���
            writer.println("��ã��ͻ��ˣ�");
            writer.flush();
            
            info = reader.readLine();
            System.out.println(info);
            
            writer.println("�ټ����ͻ��ˣ�");
            writer.flush();
            
            socket.close();//�ر���ͻ��˵�����
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        System.out.println("������������");
        ServerDemo demo = new ServerDemo();
        demo.start();
    }
}
