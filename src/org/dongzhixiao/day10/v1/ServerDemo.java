package org.dongzhixiao.day10.v1;

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
 * 
 * 
 * ExecutorService�ṩ�˹�����ֹ���̳߳ء��ķ���
 * 
 * ���̳߳ء��Ĵ������ǹ������������ǲ�Ҫֱ��new�̳߳أ�
 * ��Ϊ�̳߳صĴ����������ܶ�׼������
 * 
 * Executors.newCachedThreadPool();(��γ���)
 * �ɸ���������Ҫ��̬�����߳���ִ���������̳߳�����
 * ���е��߳̽����ø��߳���ִ��������û���򴴽����̡߳�
 * �����ϳ�������Է�int���ֵ���̡߳�
 * 1min��û�б����õ��̻߳������
 * 
 * Executors.newFixedThreadPool(int threads);(���)
 * �����̶���С���̳߳ء����е��߳����ǹ̶��ġ���
 * �����̶߳����ڱ���״̬���������Ŷӵȴ���
 * 
 * Executors.newScheduledThreadPool();
 * ���������ӳ�Ч�����̳߳ء��ɽ������е������ӳ�ָ��ʱ��
 * ���������С� 
 * 
 * Executors.newSingleThreadPool();
 * �������̵߳��̳߳ء����н���һ���̡߳�����δ����
 * �����ŶӵȺ�
 * 
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
            /*
             * ͨ������ServerSocket��accept������ʹ��������ʼ
             * �ȴ����տͻ��˵�����
             * �÷�����һ����������
             * ֱ���ͻ����������ӣ�����÷����������
             */
            while(true){
                System.out.println("�ȴ��ͻ�������...");
                Socket s = socket.accept();
                System.out.println("һ���ͻ���������");
                /*
                 * ��һ���ͻ��������ˣ�������һ���߳�ȥ�Ӵ���
                 */
                Thread clientThread = new Thread(new Handler(s));
                clientThread.start();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    /**
     * �����߳��塣���̵߳������������ӵ��������˵Ŀͻ��˽��н�������
     * @author Administrator
     *
     */
    class Handler implements Runnable{
        //��ǰ�߳�Ҫ����ͨ�ŵĿͻ���Socket
        private Socket socket;
        public Handler(Socket socket) {
            this.socket = socket;
        }
        @Override
        public void run() {
            try{
                InputStream in = socket.getInputStream();
                OutputStream out = socket.getOutputStream();
                
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
    }
    
    public static void main(String[] args) {
        System.out.println("������������");
        ServerDemo demo = new ServerDemo();
        demo.start();
    }
}
