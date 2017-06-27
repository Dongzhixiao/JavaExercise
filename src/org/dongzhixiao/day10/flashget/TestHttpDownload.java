package org.dongzhixiao.day10.flashget;

import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 断线续传测试
 * @author Administrator
 *
 */

public class TestHttpDownload {

    public static void main(String[] args) {
        /**
         * 1:创建下载任务 Download实例
         * 2：根据任务中的下载地址打开网络连接，获取对应输入流
         * 
         * 3：创建任务中保存在本地的文件输出流
         * 4：进行读写操作（下载）
         * 5:关闭
         */
        try{
            //1
            DownloadInfo info = new DownloadInfo(
                    "http://www.baidu.com/download/java_1_7.zip"
                    ,
                    "java_1_7.zip"
            );
            //2  java.net.URL
            URL url = new URL(info.getUrl());//给定网络地址
            //  通过地址打开网络连接(和服务器通信)
            HttpURLConnection conn = 
                    (HttpURLConnection)url.openConnection();//通过地址打开网络连接
           //获取下载文件的大小
           Long totalSize = Long.parseLong(conn.getHeaderField("CONTENT-LENGTH"));
           info.setFileSize(totalSize); 
           conn.disconnect();//与服务器断开
           //再次连接
           conn = (HttpURLConnection)url.openConnection();
           /**
             *  想要实现断点续传。我们必须告诉服务器我们当次读取
             *  文件的开始位置。相当于我们本地调用的seek()
             *  因为我们不可能直接调用服务器的对象的方法
             *  所以我们只能通过某种方式告诉服务器我们要干什么
             *  让它自己调用自己的流对象的seek()到我们想要读的位置
             *  
             *  bytes=0-  的意思是告诉服务器从第一个字节开始读seek(0)
             *  
             *  bytes=128-  的意思是告诉服务器从第129个字节开始读seek(128)
             */
            String prop = "bytes="+info.getPos()+"-";
            //通过连接设置参数，通知服务器从什么地方开始读取
            conn.setRequestProperty("RANGE", prop);
            //打开输入流开始读取文件
            InputStream in = conn.getInputStream();
            //将任务中记录的本地文件作为写出目标文件
            RandomAccessFile raf = 
                    new RandomAccessFile(info.getFileName(), "rw");
            //服务器seek的位置就是我们写的位置
            raf.seek(info.getPos());
            //创建缓冲区
            byte[] buffer = new byte[1024*10];//10k缓冲区
            int sum = -1;//记录读取字节数
            /**
             * 进行下载操作
             */
            while((sum = in.read(buffer))>0){
                raf.write(buffer,0,sum);
                //记录当前下载总字节数
                info.setPos(info.getPos()+sum);
                System.out.println(info.getPos());
            }
            raf.close();
            in.close();
            conn.disconnect();//关闭和服务器的连接
        }catch(Exception e){
            
        }
    }

}
