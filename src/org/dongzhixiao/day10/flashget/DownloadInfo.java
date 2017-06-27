package org.dongzhixiao.day10.flashget;

import java.io.Serializable;

/**
 * 保存一个下载任务所需要的信息
 * 
 * VO : Value Object 值对象
 * 作用  : 保存一组数据
 * 
 * 若这组数据表示的是数据库中的一条数据的话
 * 那么这个对象就叫做：Entity 实体
 * 
 * @author Administrator
 *
 */
public class DownloadInfo implements Serializable{
    /**
     * 尽可能加上版本号，每次改的时候修改版本号，使得其可以提示
     * 
     * JDK提供的大多数java bean都实现了该接口
     * 
     * transient关键字表面该属性不被序列化
     */
    private static final long serialVersionUID = 1L;
    //Serializable可以序列化的接口，里面没有任何抽象类
    private String url;      //下载文件的地址
    private long pos;        //已经下载的字节数
    private long fileSize;   //文件总大小
    private String fileName; //保存在本地的文件名
    
    public DownloadInfo(String url,String fileName){
        this.url = url;
        this.fileName = fileName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getPos() {
        return pos;
    }

    public void setPos(long pos) {
        this.pos = pos;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
/**  序列化也叫串行化
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