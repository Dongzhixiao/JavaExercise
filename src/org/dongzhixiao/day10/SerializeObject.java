package org.dongzhixiao.day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.dongzhixiao.day10.flashget.DownloadInfo;

/**
 * �������л�
 *  ��һ������ת��Ϊ�ֽ���ʽ�Ĺ��̾��Ƕ������л���
 * ��������л�ʹ����
 *  ObjectOutputStream��writeObject(Object obj)����
 *  �������������л���д��
 *  
 *  ����ķ����л�ʹ����
 *  ObjectInputStream��Object ReadObject()����
 *  ����ȡ���ֽ����л�ԭΪ����
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
            //info���л�д���ļ���
            File file = new File("obj.tem");
            FileOutputStream fos = new FileOutputStream(file);    
            //ͨ��oos���Խ��������л���д��obj.tem�ļ���
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //��info���л���д��
            oos.writeObject(info);
            oos.close();
            
            /**
             * �����л�����
             */
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            //�����л�
            DownloadInfo obj = (DownloadInfo)ois.readObject();
            
            System.out.println(obj.getUrl());
            System.out.println(obj.getFileName());
            System.out.println(obj.getFileSize());
            System.out.println(obj.getPos());
            
            System.out.println(info == obj);
            ois.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("�ǳ�sorry");
        }
    }

}
