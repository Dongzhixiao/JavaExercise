package org.dongzhixiao.day10.thread.runnable;

public class TestRunnable {

    public static void main(String[] args) {
        //����������Ҫ����������
        Runnable r1 = new MyFirstRunnable();
        Runnable r2 = new MySecRunnable();
        //����������ֱ𽻸��߳�ȥ��������
        //�����񽻸��߳̿���ʹ���̵߳����ع��췽��Thread(Runnable runnable)
        Thread t1= new Thread(r1);
        Thread t2 = new Thread(r2);
        
        t1.start();
        t2.start();
    }

}
