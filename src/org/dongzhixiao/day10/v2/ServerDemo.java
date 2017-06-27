package org.dongzhixiao.day10.v2;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * �����
 * ����˫������У��ӿ��д���ݲ�����
 * ˬ������п��Թ涨���д洢Ԫ�صĴ�С��
 * һ�������е�Ԫ�ص������ֵ��������Ԫ�ؽ��ȴ���
 * �ȴ�ʱ���Ǹ����ġ�������ʱ�䵽��Ԫ�ػ�û�л���
 * ��������У���ô���׳���ʱ�쳣��
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
    //�̳߳�
    private ExecutorService threadPool;
    //˫�������
    private BlockingQueue<String> msgQueue;
    
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
            //����50���̶̹߳���С���̳߳�
            threadPool = Executors.newFixedThreadPool(50);
            /**
             * ����˫�������
             * LinkedBlockingDeque�ɲ�ָ����С����ָ��������
             * ��ֵ�󣬴�����н��ȴ������������ֵΪint���ֵ
             */  
            msgQueue = new LinkedBlockingDeque<String>(10000);
            Timer timer = new Timer();
            timer.schedule(new TimerTask(){
                @Override
                public void run() {
                    try{
                        PrintWriter writer = 
                                new PrintWriter(new FileWriter("log.txt"),true);
                        //�Ӷ����л�ȡ����Ԫ�أ���д����
                        String msg= null;
                        for(int i = 0; i<msgQueue.size();++i){
                            msg = msgQueue.poll(0,TimeUnit.MILLISECONDS);
                            if(msg == null){
                                break;
                            }
                            writer.println(msg);//ͨ�������д������
                        }
                        writer.close();
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }, 
            0,
            500
            );
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
//                Thread clientThread = new Thread(new Handler(s));
//                clientThread.start();
                //���߳���(����������)�����̳߳�
                //�̳߳ػ��Զ�������������һ�������߳�ȥִ�С�
                threadPool.execute(new Handler(s));
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
                
                BufferedReader reader = new BufferedReader(
                                          new InputStreamReader(in)
                                          );
                
                String info = null;
                while(true){
                    info = reader.readLine();
                    //ѭ����ȡ�ͻ��˷��͹�������Ϣ
                    if(info != null){
                        //������гɹ�����true��ʧ�ܷ���false
                        //�÷����������̣߳����жϻᱨ��
                        boolean b = 
                                msgQueue.offer(info,5,TimeUnit.SECONDS);
                    }
                }
                
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
/**
 * ˫������У�
 *  BlockingQeque:
 *  ����˶�д�����������⡣����ͬʱд�������ͬ���ġ�
 */
