package org.dongzhixiao.day10.thread;
/**
 * �߳�˯������
 * ������
 *  ʹ��ǰ�̷߳���cpuʱ�䣬��������״̬��������״̬���̲߳���
 *  ����ʱ��Ƭ��ֱ�����߳̽�������״̬�ص�Runnable״̬����
 *  �ٴλ��ʱ��Ƭ����cpu����(����Running״̬)
 * @author Administrator
 *
 */
public class ThreadSleep {

    public static void main(String[] args) {
        /*
         * �õ�ǰ�߳̽�������״̬
         * Thread.sleep(long time)
         * ������������״̬time����󷵻ص�Runnable״̬
         */
        int i = 0;
        while(true){
            System.out.println(i+"��");
            i++;
            try{
                /**
                 * ʹ��Thread.sleep(long time)�����߳�ʱǿ��
                 * �����Ǳ��벶���ж��쳣��
                 * ���������
                 *  ��ǰ�̴߳���Sleep�����ڼ䣬����һ���߳��ж�����״̬
                 *  ʱ����ǰ�̻߳��׳����쳣��
                 */
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
