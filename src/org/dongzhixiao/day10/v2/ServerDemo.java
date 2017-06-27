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
 * 服务端
 * 加入双缓冲队列，加快读写数据操作。
 * 爽缓冲队列可以规定队列存储元素的大小。
 * 一旦队列中的元素到达最大值，待插入元素将等待。
 * 等待时间是给定的。当给定时间到了元素还没有机会
 * 被放入队列，那么会抛出超时异常！
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
    //线程池
    private ExecutorService threadPool;
    //双缓冲队列
    private BlockingQueue<String> msgQueue;
    
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
            //创建50个线程固定大小的线程池
            threadPool = Executors.newFixedThreadPool(50);
            /**
             * 创建双缓冲队列
             * LinkedBlockingDeque可不指定大小，若指定，到达
             * 峰值后，待入队列将等待。理论上最大值为int最大值
             */  
            msgQueue = new LinkedBlockingDeque<String>(10000);
            Timer timer = new Timer();
            timer.schedule(new TimerTask(){
                @Override
                public void run() {
                    try{
                        PrintWriter writer = 
                                new PrintWriter(new FileWriter("log.txt"),true);
                        //从队列中获取所有元素，做写操作
                        String msg= null;
                        for(int i = 0; i<msgQueue.size();++i){
                            msg = msgQueue.poll(0,TimeUnit.MILLISECONDS);
                            if(msg == null){
                                break;
                            }
                            writer.println(msg);//通过输出流写出数据
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
//                Thread clientThread = new Thread(new Handler(s));
//                clientThread.start();
                //将线程体(并发的任务)交给线程池
                //线程池会自动将该任务分配给一个空闲线程去执行。
                threadPool.execute(new Handler(s));
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
                
                BufferedReader reader = new BufferedReader(
                                          new InputStreamReader(in)
                                          );
                
                String info = null;
                while(true){
                    info = reader.readLine();
                    //循环读取客户端发送过来的信息
                    if(info != null){
                        //插入队列成功返回true，失败返回false
                        //该方法会阻塞线程，若中断会报错！
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
        System.out.println("服务器启动中");
        ServerDemo demo = new ServerDemo();
        demo.start();
    }
}
/**
 * 双缓冲队列：
 *  BlockingQeque:
 *  解决了读写数据阻塞问题。但是同时写或读还是同步的。
 */
