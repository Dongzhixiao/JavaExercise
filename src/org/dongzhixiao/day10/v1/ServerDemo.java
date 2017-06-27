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
 * 服务端
 * 
 * 
 * ExecutorService提供了管理终止【线程池】的方法
 * 
 * 【线程池】的创建都是工厂方法。我们不要直接new线程池，
 * 因为线程池的创建还需做很多准备工作
 * 
 * Executors.newCachedThreadPool();(其次常用)
 * 可根据任务需要动态创建线程来执行任务，若线程池中有
 * 空闲的线程将重用该线程来执行任务。若没有则创建新线程。
 * 理论上池子里可以放int最大值个线程。
 * 1min内没有被调用的线程会清理掉
 * 
 * Executors.newFixedThreadPool(int threads);(最常用)
 * 创建固定大小的线程池。池中的线程数是固定的。若
 * 所有线程都处于饱和状态，新任务将排队等待。
 * 
 * Executors.newScheduledThreadPool();
 * 创建具有延迟效果的线程池。可将带运行的任务延迟指定时间
 * 长后再运行。 
 * 
 * Executors.newSingleThreadPool();
 * 创建单线程的线程池。池中仅有一个线程。所有未运行
 * 任务排队等候。
 * 
 * @author Administrator
 *
 */
public class ServerDemo {
    private ServerSocket socket;
    private int port = 8088;
    /**
     * 构建ServerDemo对象时就打开服务端口
     */
    public ServerDemo(){
        try {
            /*
             * ServerSocket构造方法要求我们传入要打开的端口号
             * ServerSocket对象在创建时就向操作系统申请打开这个端口
             */
            socket = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 开始服务
     * 等待接收客户端的请求并与其通信
     */
    public void start(){
        try{
            /*
             * 通过调用ServerSocket的accept方法，使服务器开始
             * 等待接收客户端的连接
             * 该方法是一个阻塞方法
             * 直到客户端与其连接，否则该方法不会结束
             */
            while(true){
                System.out.println("等待客户端连接...");
                Socket s = socket.accept();
                System.out.println("一个客户端连接了");
                /*
                 * 当一个客户端连接了，就启动一个线程去接待它
                 */
                Thread clientThread = new Thread(new Handler(s));
                clientThread.start();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    /**
     * 定义线程体。该线程的作用是与连接到服务器端的客户端进行交互操作
     * @author Administrator
     *
     */
    class Handler implements Runnable{
        //当前线程要进行通信的客户端Socket
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
                
                //先听客户端发送的信息
                String info = reader.readLine();//阻塞
                System.out.println(info);
                
                //发送信息给客户端
                writer.println("你好！客户端！");
                writer.flush();
                
                info = reader.readLine();
                System.out.println(info);
                
                writer.println("再见！客户端！");
                writer.flush();
                
                socket.close();//关闭与客户端的连接
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("服务器启动中");
        ServerDemo demo = new ServerDemo();
        demo.start();
    }
}
