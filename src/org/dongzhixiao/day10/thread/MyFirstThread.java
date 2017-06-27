package org.dongzhixiao.day10.thread;
/**
 * 线程
 * @author Administrator
 * 实现线程两布
 * 1：继承自Thread
 * 2：重写run方法
 *   run方法中应该定义我们需要并发执行的任务逻辑代码
 *
 */
public class MyFirstThread extends Thread{
    @Override
    public void run() {
        for(int i = 0 ; i<10000;i++){
            System.out.println(i);
        }
    }
}
