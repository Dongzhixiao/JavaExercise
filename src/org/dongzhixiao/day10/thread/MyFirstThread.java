package org.dongzhixiao.day10.thread;
/**
 * �߳�
 * @author Administrator
 * ʵ���߳�����
 * 1���̳���Thread
 * 2����дrun����
 *   run������Ӧ�ö���������Ҫ����ִ�е������߼�����
 *
 */
public class MyFirstThread extends Thread{
    @Override
    public void run() {
        for(int i = 0 ; i<10000;i++){
            System.out.println(i);
        }
    }
}
