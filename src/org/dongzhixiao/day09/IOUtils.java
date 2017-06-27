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
     * 将给定数组写入给定文件中
     * 
     * @param src
     * @param data
     * @throws IOException
     */
    public static void saveBytes(File src, byte[] data) throws IOException {
        if (src == null) {
            throw new IllegalArgumentException("文件为空");
        }
        // 写文件如果没有回自己创建
        FileOutputStream fos = null;// 创建文件输出流
        try {
            fos = new FileOutputStream(src);
            fos.write(data);
        } catch (IOException e) {
            throw e;// 读取出错将异常抛出给调用者
        } finally {
            if (fos != null)
                fos.close();
        }
    }

    /**
     * 将src文件复制保存到des文件
     * 
     * @param src
     * @param des
     * @throws IOException
     */
    public static void copyFile(File src, File des) throws IOException {
        if (src == null) {
            throw new IllegalArgumentException(src + "为空");
        }
        if (!src.exists()) {
            throw new IllegalArgumentException("文件：" + src + "不存在");
        }
        FileInputStream fis = null;// 创建文件输入流
        FileOutputStream fos = null;// 创建文件输出流
        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(des);
            int data = -1;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
        } catch (IOException e) {
            throw e;// 读取出错将异常抛出给调用者
        } finally {
            if (fis != null)
                fis.close();
            if (fos != null)
                fos.close();
        }
    }

    /**
     * 缓冲字节输入输出流
     * @author Administrator
     * BufferedInputStream  :缓冲字节输入输出流
     * BufferedOutputStream :缓冲字节输出输出流
     * 内部维护一个缓冲区。可以提高读写效率，是【高级流】
     * 
     * 辨别高级流：如果构造方法需要传入另一个流，则是高级流！！
     */
    /**
     * 使用缓冲流进行拷贝
     * 
     * @param src
     * @param des
     * @throws IOException
     */
    public static void copyFile2(File src, File des) throws IOException {
        if (src == null) {
            throw new IllegalArgumentException(src + "为空");
        }
        if (!src.exists()) {
            throw new IllegalArgumentException("文件：" + src + "不存在");
        }
        /**
         * 创建缓冲流 自动导入包快捷键:ctrl+shift+o
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
            bos.flush();//数据都写完后应该flush:将缓冲区未写入的数据一次性写入
        } catch (IOException e) {
            throw e;// 读取出错将异常抛出给调用者
        } finally {
            if (bis != null)
                bis.close();
            if (bos != null)
                bos.close();
        }
    }

    /**
     * 读取给定文件，并将数据以字节数组的形式返回
     * 
     * @param src
     * @return
     * @throws IOException
     */
    public static byte[] loadBytes(File src) throws IOException {
        if (src == null) {
            throw new IllegalArgumentException(src + "为空");
        }
        if (!src.exists()) {
            throw new IllegalArgumentException("文件：" + src + "不存在");
        }
        FileInputStream fis = null;// 创建文件输入流
        try {
            fis = new FileInputStream(src);
            // byte[] data = new byte[(int)src.length()];
            /**
             * FileInputStream的available()方法 返回当前字节输入流可读取的总字节数
             */
            byte[] data = new byte[fis.available()];
            fis.read(data);
            return data;
        } catch (IOException e) {
            throw e;// 读取出错将异常抛出给调用者
        } finally {
            if (fis != null)
                fis.close();
        }
    }
    /**
     * DataInputStream:可以直接读取基本类型数据的流
     * DataOutputStream:可以直接写入基本类型数据的流
     * @author Administrator
     *
     */
    /**
     * 向给定的输入流中写入字符串
     * @param info
     * @param out
     * @throws IOException
     */
    public static void saveString(String info,OutputStream out)
                                 throws IOException{
         DataOutputStream dos = new DataOutputStream(out);
         dos.writeUTF(info);
         dos.flush();
         //这里应将dos关掉么？
//         dos.close(); //不能关，否则低级流关了，外部可能还要用！
     }
    /**
     * 从输入流中读取字符串
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
