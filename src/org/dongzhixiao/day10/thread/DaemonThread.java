package org.dongzhixiao.day10.thread;
/**
 * ��̨�߳�Ҳ��Ϊ�ػ��߳�
 * �ص㣺
 *  ����ǰ�߳�������ǰ̨�߳������󣬺�̨�߳�ǿ�������������Ƿ������У�
 * @author Administrator
 *
 */
public class DaemonThread {
    public static void main(String[] args) {//main������һ���߳���������һ��ǰ̨�߳�
        Thread rose = new Thread(){
            @Override
            public void run() {
                for(int i = 0;i<10;++i){
                    System.out.println("let me go!");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("AAAaaaa....��ͨ!");
            }
        };
        
        Thread jack = new Thread(){
            @Override
            public void run() {
                for(int i = 0;i<1000;++i){
                    System.out.println("you jump,i jump!");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        //��̨�߳�(�ػ��߳�)�ŵ㣺�����Լ�������������
        //ȱ�㣺�޷����ƺ�������Ҫ�ƺ����Ķ���Ϊǰ̨�߳�
        jack.setDaemon(true);//�ػ��߳�
        
        rose.start();
        jack.start();
        
//        try {
//            Thread.sleep(500000);//main��������
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }//main�����߳�������Ȼ��rose�߳���������̨�߳��Զ�����
    /**
     * wait/notify����
     * �����������������߳�Thread�ж���ķ���
     * ����������������Object�С�
     * ��������������������Э���̹߳����ġ�
     */
}
