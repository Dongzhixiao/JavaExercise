package org.dongzhixiao.day10.thread;
/**
 * �̲߳�����ȫ����
 * ���߳��ڷ���ͬһ��������(д����)�����ܻ���������ȫ������
 */

/**
 * �ж��쳣��ʾ
 * @author Administrator
 *
 */

public class TestInterruptedException {

    public static void main(String[] args) {
        /**
         * �����ж����������ֲ��ڲ���
         * �ֲ��ڲ������������õ�ǰ�����������ֲ���������ô�ñ���
         * ������final��
         */
        Thread lin = new Thread(){
            @Override
            public void run() {
                System.out.println("�֣�˯���ˡ���");
                try{
                    Thread.sleep(10000000);
                }catch(InterruptedException e){
//                    e.printStackTrace();
                    System.out.println("�֣������أ���");
                }
            }
        };
        lin.start();
        
        Thread huang = new Thread(){
          @Override
          public void run() {
              System.out.println("�ƣ�80һ���ӣ���˵���ģ�");
              for(int i =0 ; i<5;++i){
                  System.out.println("�ƣ�80!");
                  try{
                      Thread.sleep(1000);
                  }catch(InterruptedException e){
                      e.printStackTrace();
                  }
              }
              System.out.println("�ƣ��ѵ���");
              System.out.println("�ƣ��㶨��");
              lin.interrupt();//�жϵ�һ���̵߳�����״̬
          }  
        };
        huang.start();
    }

}
