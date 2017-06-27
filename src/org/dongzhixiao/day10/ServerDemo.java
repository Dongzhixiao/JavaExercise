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
 * 服务端
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
            System.out.println("等待客户端连接...");
            /*
             * 通过调用ServerSocket的accept方法，使服务器开始
             * 等待接收客户端的连接
             * 该方法是一个阻塞方法
             * 直到客户端与其连接，否则该方法不会结束
             */
            Socket s = socket.accept();
            
            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();
            
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
    
    public static void main(String[] args) {
        System.out.println("服务器启动中");
        ServerDemo demo = new ServerDemo();
        demo.start();
    }
}
