package org.dongzhixiao.day10.thread.runnable;

public class MyFirstRunnable implements Runnable{
    /**
     * run方法中定义线程要执行的逻辑
     */
    @Override
    public void run() {
        for(int i = 0; i<10000;i++){
            System.out.println(i);
        }
    }
}
