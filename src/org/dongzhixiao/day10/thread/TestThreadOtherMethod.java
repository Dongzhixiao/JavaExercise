package org.dongzhixiao.day10.thread;
/**
 * 线程的方法
 * yield():放弃当次时间片，主动进入Runnable状态
 * setPriority():设置线程优先级
 *               优先级越高，理论上获取cup的次数越多
 *               设置线程优先级一定要在线程启动之前
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
                  System.out.println("你是谁？");
                  Thread.yield();
              }
          }
      };
      Thread t2 = new Thread(){
          @Override
        public void run() {
              for(int i = 0 ; i<100000; ++i){
                  System.out.println("你是修水管的");
                  Thread.yield();
              }
          }
      };
      Thread t3 = new Thread(){
          @Override
        public void run() {
              for(int i = 0 ; i<100000; ++i){
                  System.out.println("我是打酱油的");
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
