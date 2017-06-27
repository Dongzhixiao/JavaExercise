package org.dongzhixiao.day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.dongzhixiao.day10.flashget.DownloadInfo;

/**
 * 对象序列化
 *  将一个对象转换为字节形式的过程就是对象序列化。
 * 对象的序列化使用类
 *  ObjectOutputStream的writeObject(Object obj)方法
 *  将给定对象序列化后写出
 *  
 *  对象的反序列化使用类
 *  ObjectInputStream的Object ReadObject()方法
 *  将读取的字节序列还原为对象
 */
public class SerializeObject {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try{
            DownloadInfo info = new DownloadInfo(
                    "http://www.baidu.com/download/xxx.zip"
                    ,
                    "xxx.zip");
            info.setPos(12587);
            info.setFileSize(556778);
            //info序列化写到文件中
            File file = new File("obj.tem");
            FileOutputStream fos = new FileOutputStream(file);    
            //通过oos可以将对象序列化后写入obj.tem文件中
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //将info序列化后写出
            oos.writeObject(info);
            oos.close();
            
            /**
             * 反序列化操作
             */
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            //反序列化
            DownloadInfo obj = (DownloadInfo)ois.readObject();
            
            System.out.println(obj.getUrl());
            System.out.println(obj.getFileName());
            System.out.println(obj.getFileSize());
            System.out.println(obj.getPos());
            
            System.out.println(info == obj);
            ois.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("非常sorry");
        }
    }

}
