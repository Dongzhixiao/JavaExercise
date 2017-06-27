package org.dongzhixiao.day10.thread;
import org.dongzhixiao.day10.thread.Bank.Person;
/**
 * ���̲߳�����ȫ����
 * 
 * synchronized�ؼ���
 * �̰߳�ȫ��
 * synchronized�������η���Ҳ���Ե�����Ϊ�������
 * synchronized���������ƶ��̲߳���ʱͬʱ���ʸ�������
 * 
 * 
 * 
 * @author Administrator
 *
 */
public class ThreadDemo {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Person p1 = bank.new Person();
        Person p2 = bank.new Person();
        
        p1.start();
        p2.start();
        /*
         * p1��p2����bank�����ϵȴ��ˡ�����������
         */
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        bank.count = 10000;
        //bank��ʼ�����
        synchronized(bank){
            bank.notifyAll();//֪ͨ�ȴ��߳̿��Թ�����
//            bank.notify();//ֻ������һ���߳�
        }
    }
}
class Bank{
    int count = 10000;
    /**
     * ȡǮ����  
     * 1 ���Լ���synchronized�ؼ���
     * ���Ϻ󣬷����Ͳ����첽�ģ�����ͬ�����ˣ�synchronized��Ϊ��������
     * 
     * 2 synchronizedͬ����
     * synchronized(Object){
     *  ��Ҫͬ���Ĵ���Ƭ��
     * }
     * �������ע�⣡ObjectҪȷ�������߳̿�������ͬһ������
     * �����𲻵�ͬ����Ч����
     * 
     * @param money
     */
    void getMoney(int money){
        synchronized(this){ //����һ����this����Ϊ���Ա�֤��ͬһ������
            if(count == 0){
                throw new RuntimeException("���Ϊ0");
            }
            Thread.yield();
            count -= money;
        }
    }    
    //ע�⣺�߳����쳣��ֻ���߳�����
    class Person extends Thread{
        public void run(){
            System.out.println("׼��ȡǮ,�ȴ����п��ţ�");
            try {
                synchronized(Bank.this){//����wait����ʹ��synchronized��װ��ͬʱ����������ʹ��wait�������Ǹ�����
                    Bank.this.wait();//��ǰ�߳�(Person)�����ж����ϵȴ�
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            while(true){
                getMoney(100);
                System.out.println("��ǰ��"+count);
                Thread.yield();
            }
        }
    }
}