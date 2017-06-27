package org.dongzhixiao.day10.flashget;

import java.io.Serializable;

/**
 * ����һ��������������Ҫ����Ϣ
 * 
 * VO : Value Object ֵ����
 * ����  : ����һ������
 * 
 * ���������ݱ�ʾ�������ݿ��е�һ�����ݵĻ�
 * ��ô�������ͽ�����Entity ʵ��
 * 
 * @author Administrator
 *
 */
public class DownloadInfo implements Serializable{
    /**
     * �����ܼ��ϰ汾�ţ�ÿ�θĵ�ʱ���޸İ汾�ţ�ʹ���������ʾ
     * 
     * JDK�ṩ�Ĵ����java bean��ʵ���˸ýӿ�
     * 
     * transient�ؼ��ֱ�������Բ������л�
     */
    private static final long serialVersionUID = 1L;
    //Serializable�������л��Ľӿڣ�����û���κγ�����
    private String url;      //�����ļ��ĵ�ַ
    private long pos;        //�Ѿ����ص��ֽ���
    private long fileSize;   //�ļ��ܴ�С
    private String fileName; //�����ڱ��ص��ļ���
    
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
/**  ���л�Ҳ�д��л�
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