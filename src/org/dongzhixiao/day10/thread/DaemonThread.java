package org.dongzhixiao.day10.thread;
/**
 * 后台线程也称为守护线程
 * 特点：
 *  当当前线程中所有前台线程死亡后，后台线程强制死亡。无论是否还在运行！
 * @author Administrator
 *
 */
public class DaemonThread {
    public static void main(String[] args) {//main方法靠一个线程启动，是一个前台线程
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
                System.out.println("AAAaaaa....扑通!");
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
        //后台线程(守护线程)优点：不用自己主动让其死亡
        //缺点：无法做善后工作，需要善后工作的定义为前台线程
        jack.setDaemon(true);//守护线程
        
        rose.start();
        jack.start();
        
//        try {
//            Thread.sleep(500000);//main方法阻塞
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }//main方法线程先死，然后rose线程死，最后后台线程自动死了
    /**
     * wait/notify方法
     * 这两个方法不是在线程Thread中定义的方法
     * 这两个方法定义在Object中。
     * 这两个方法作用是用于协调线程工作的。
     */
}
