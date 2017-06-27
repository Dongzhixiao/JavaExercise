package org.dongzhixiao.day10.thread;
/**
 * 线程并发安全问题
 * 多线程在访问同一个数据是(写操作)，可能会引发不安全操作。
 */

/**
 * 中断异常演示
 * @author Administrator
 *
 */

public class TestInterruptedException {

    public static void main(String[] args) {
        /**
         * 方法中定义的类叫做局部内部类
         * 局部内部类中若想引用当前方法的其他局部变量，那么该变量
         * 必须是final的
         */
        Thread lin = new Thread(){
            @Override
            public void run() {
                System.out.println("林：睡觉了。。");
                try{
                    Thread.sleep(10000000);
                }catch(InterruptedException e){
//                    e.printStackTrace();
                    System.out.println("林：干嘛呢？！");
                }
            }
        };
        lin.start();
        
        Thread huang = new Thread(){
          @Override
          public void run() {
              System.out.println("黄：80一锤子，您说砸哪？");
              for(int i =0 ; i<5;++i){
                  System.out.println("黄：80!");
                  try{
                      Thread.sleep(1000);
                  }catch(InterruptedException e){
                      e.printStackTrace();
                  }
              }
              System.out.println("黄：哐当！");
              System.out.println("黄：搞定！");
              lin.interrupt();//中断第一个线程的阻塞状态
          }  
        };
        huang.start();
    }

}
