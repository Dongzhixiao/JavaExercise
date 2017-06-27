package org.dongzhixiao.day10.v1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * MINA框架，开源socket框架。很多游戏服务器的通信框架全用它
 * @author Administrator
 *
 */

public class ClientDemo {
    private Socket socket;
    /**
     * 建立连接并向服务器发送信息
     * 步骤：
     *  1。通过服务器的地址及端口与服务器连接
     *    创建Socket时需要以上两个数据
     *  2.连接成功后可以通过Socket获取输入流和输出流
     *    使用输入流接收服务端发送过来的信息
     *    使用输出流将信息发送给服务端
     *  3.关闭连接
     */
    public void send(){
        try{
            System.out.println("开始连接服务器");
            /**
             * 1 连接服务器
             *  一旦Socket被实例化，那么它就开始通过给定的地址和端口号去尝试
             *  与服务器进行连接。
             *  这里的地址"localhost"是服务器的地址
             *  8088端口是服务器对外的端口。
             *  我们自身的端口是系统分配的，我们无需知道
             */
            socket = new Socket("localhost",8088);//localhost一般指本机
            /**
             * 和服务器通信(读写数据)
             * 使用socket获取输入和输出流
             */
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            /**
             * 将输出流变成处理字符串的缓冲字符输出流
             */
            PrintWriter writer = new PrintWriter(out);
            writer.println("你好！服务器！");
            /**
             * 注意，写到输出流的缓冲区里了，并没有真正的发送。
             * 清空缓冲区
             */
            writer.flush();
            
            /**
             * 将输入流转换为缓冲字符输入流
             */
            BufferedReader reader = new BufferedReader(
                                      new InputStreamReader(in)
                                      );
            /**
             * 读取服务器发送过来的信息
             */
            String info = reader.readLine();//读取服务器信息会阻塞
            System.out.println(info);
            
            writer.println("再见！服务器！");
            writer.flush();
            
            info = reader.readLine();
            System.out.println(info);
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        ClientDemo demo = new ClientDemo();
        demo.send();//连接服务器并通信
        
        
    }
}
