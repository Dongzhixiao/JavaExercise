package org.dongzhixiao.day10.flashget;

import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * ������������
 * @author Administrator
 *
 */

public class TestHttpDownload {

    public static void main(String[] args) {
        /**
         * 1:������������ Downloadʵ��
         * 2�����������е����ص�ַ���������ӣ���ȡ��Ӧ������
         * 
         * 3�����������б����ڱ��ص��ļ������
         * 4�����ж�д���������أ�
         * 5:�ر�
         */
        try{
            //1
            DownloadInfo info = new DownloadInfo(
                    "http://www.baidu.com/download/java_1_7.zip"
                    ,
                    "java_1_7.zip"
            );
            //2  java.net.URL
            URL url = new URL(info.getUrl());//���������ַ
            //  ͨ����ַ����������(�ͷ�����ͨ��)
            HttpURLConnection conn = 
                    (HttpURLConnection)url.openConnection();//ͨ����ַ����������
           //��ȡ�����ļ��Ĵ�С
           Long totalSize = Long.parseLong(conn.getHeaderField("CONTENT-LENGTH"));
           info.setFileSize(totalSize); 
           conn.disconnect();//��������Ͽ�
           //�ٴ�����
           conn = (HttpURLConnection)url.openConnection();
           /**
             *  ��Ҫʵ�ֶϵ����������Ǳ�����߷��������ǵ��ζ�ȡ
             *  �ļ��Ŀ�ʼλ�á��൱�����Ǳ��ص��õ�seek()
             *  ��Ϊ���ǲ�����ֱ�ӵ��÷������Ķ���ķ���
             *  ��������ֻ��ͨ��ĳ�ַ�ʽ���߷���������Ҫ��ʲô
             *  �����Լ������Լ����������seek()��������Ҫ����λ��
             *  
             *  bytes=0-  ����˼�Ǹ��߷������ӵ�һ���ֽڿ�ʼ��seek(0)
             *  
             *  bytes=128-  ����˼�Ǹ��߷������ӵ�129���ֽڿ�ʼ��seek(128)
             */
            String prop = "bytes="+info.getPos()+"-";
            //ͨ���������ò�����֪ͨ��������ʲô�ط���ʼ��ȡ
            conn.setRequestProperty("RANGE", prop);
            //����������ʼ��ȡ�ļ�
            InputStream in = conn.getInputStream();
            //�������м�¼�ı����ļ���Ϊд��Ŀ���ļ�
            RandomAccessFile raf = 
                    new RandomAccessFile(info.getFileName(), "rw");
            //������seek��λ�þ�������д��λ��
            raf.seek(info.getPos());
            //����������
            byte[] buffer = new byte[1024*10];//10k������
            int sum = -1;//��¼��ȡ�ֽ���
            /**
             * �������ز���
             */
            while((sum = in.read(buffer))>0){
                raf.write(buffer,0,sum);
                //��¼��ǰ�������ֽ���
                info.setPos(info.getPos()+sum);
                System.out.println(info.getPos());
            }
            raf.close();
            in.close();
            conn.disconnect();//�رպͷ�����������
        }catch(Exception e){
            
        }
    }

}
