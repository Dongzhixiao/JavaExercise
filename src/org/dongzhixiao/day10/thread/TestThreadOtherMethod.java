package org.dongzhixiao.day10.thread;
/**
 * �̵߳ķ���
 * yield():��������ʱ��Ƭ����������Runnable״̬
 * setPriority():�����߳����ȼ�
 *               ���ȼ�Խ�ߣ������ϻ�ȡcup�Ĵ���Խ��
 *               �����߳����ȼ�һ��Ҫ���߳�����֮ǰ
 * 
 * 
 * @author Administrator
 *
 */
public class TestThreadOtherMethod {

    public static void main(String[] args) {
        Thread t1 = new Thread(){
          @Override
        public void run() {
              for(int i = 0 ; i<100000; ++i){
                  System.out.println("����˭��");
                  Thread.yield();
              }
          }
      };
      Thread t2 = new Thread(){
          @Override
        public void run() {
              for(int i = 0 ; i<100000; ++i){
                  System.out.println("������ˮ�ܵ�");
                  Thread.yield();
              }
          }
      };
      Thread t3 = new Thread(){
          @Override
        public void run() {
              for(int i = 0 ; i<100000; ++i){
                  System.out.println("���Ǵ��͵�");
                  Thread.yield();
              }
          }
      };
      
      t1.setPriority(Thread.MAX_PRIORITY);
      t2.setPriority(Thread.MIN_PRIORITY);
      
      t1.run();
      t2.run();
      t3.run();
    }

}
