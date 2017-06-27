package org.dongzhixiao.day09;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOUtils {
    /**
     * ����������д������ļ���
     * 
     * @param src
     * @param data
     * @throws IOException
     */
    public static void saveBytes(File src, byte[] data) throws IOException {
        if (src == null) {
            throw new IllegalArgumentException("�ļ�Ϊ��");
        }
        // д�ļ����û�л��Լ�����
        FileOutputStream fos = null;// �����ļ������
        try {
            fos = new FileOutputStream(src);
            fos.write(data);
        } catch (IOException e) {
            throw e;// ��ȡ�����쳣�׳���������
        } finally {
            if (fos != null)
                fos.close();
        }
    }

    /**
     * ��src�ļ����Ʊ��浽des�ļ�
     * 
     * @param src
     * @param des
     * @throws IOException
     */
    public static void copyFile(File src, File des) throws IOException {
        if (src == null) {
            throw new IllegalArgumentException(src + "Ϊ��");
        }
        if (!src.exists()) {
            throw new IllegalArgumentException("�ļ���" + src + "������");
        }
        FileInputStream fis = null;// �����ļ�������
        FileOutputStream fos = null;// �����ļ������
        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(des);
            int data = -1;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
        } catch (IOException e) {
            throw e;// ��ȡ�����쳣�׳���������
        } finally {
            if (fis != null)
                fis.close();
            if (fos != null)
                fos.close();
        }
    }

    /**
     * �����ֽ����������
     * @author Administrator
     * BufferedInputStream  :�����ֽ����������
     * BufferedOutputStream :�����ֽ���������
     * �ڲ�ά��һ����������������߶�дЧ�ʣ��ǡ��߼�����
     * 
     * ���߼�����������췽����Ҫ������һ���������Ǹ߼�������
     */
    /**
     * ʹ�û��������п���
     * 
     * @param src
     * @param des
     * @throws IOException
     */
    public static void copyFile2(File src, File des) throws IOException {
        if (src == null) {
            throw new IllegalArgumentException(src + "Ϊ��");
        }
        if (!src.exists()) {
            throw new IllegalArgumentException("�ļ���" + src + "������");
        }
        /**
         * ���������� �Զ��������ݼ�:ctrl+shift+o
         */
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            bis = new BufferedInputStream(new FileInputStream(src));
            bos = new BufferedOutputStream(new FileOutputStream(des));
            int data = -1;
            while ((data = bis.read()) != -1) {
                bos.write(data);
            }
            bos.flush();//���ݶ�д���Ӧ��flush:��������δд�������һ����д��
        } catch (IOException e) {
            throw e;// ��ȡ�����쳣�׳���������
        } finally {
            if (bis != null)
                bis.close();
            if (bos != null)
                bos.close();
        }
    }

    /**
     * ��ȡ�����ļ��������������ֽ��������ʽ����
     * 
     * @param src
     * @return
     * @throws IOException
     */
    public static byte[] loadBytes(File src) throws IOException {
        if (src == null) {
            throw new IllegalArgumentException(src + "Ϊ��");
        }
        if (!src.exists()) {
            throw new IllegalArgumentException("�ļ���" + src + "������");
        }
        FileInputStream fis = null;// �����ļ�������
        try {
            fis = new FileInputStream(src);
            // byte[] data = new byte[(int)src.length()];
            /**
             * FileInputStream��available()���� ���ص�ǰ�ֽ��������ɶ�ȡ�����ֽ���
             */
            byte[] data = new byte[fis.available()];
            fis.read(data);
            return data;
        } catch (IOException e) {
            throw e;// ��ȡ�����쳣�׳���������
        } finally {
            if (fis != null)
                fis.close();
        }
    }
    /**
     * DataInputStream:����ֱ�Ӷ�ȡ�����������ݵ���
     * DataOutputStream:����ֱ��д������������ݵ���
     * @author Administrator
     *
     */
    /**
     * ���������������д���ַ���
     * @param info
     * @param out
     * @throws IOException
     */
    public static void saveString(String info,OutputStream out)
                                 throws IOException{
         DataOutputStream dos = new DataOutputStream(out);
         dos.writeUTF(info);
         dos.flush();
         //����Ӧ��dos�ص�ô��
//         dos.close(); //���ܹأ�����ͼ������ˣ��ⲿ���ܻ�Ҫ�ã�
     }
    /**
     * ���������ж�ȡ�ַ���
     * @param in
     * @return
     * @throws IOException
     */
    public static String loadString(InputStream in)
                                        throws IOException{
        DataInputStream dis = new DataInputStream(in);
        return dis.readUTF();
     }
}   
