package org.dongzhixiao.day10.thread;
/**
 * 线程睡眠阻塞
 * 阻塞：
 *  使当前线程放弃cpu时间，进入阻塞状态。在阻塞状态的线程不会
 *  分配时间片。直到该线程结束阻塞状态回到Runnable状态方可
 *  再次获得时间片来让cpu运行(进入Running状态)
 * @author Administrator
 *
 */
public class ThreadSleep {

    public static void main(String[] args) {
        /*
         * 让当前线程进入阻塞状态
         * Thread.sleep(long time)
         * 主动进入阻塞状态time毫秒后返回到Runnable状态
         */
        int i = 0;
        while(true){
            System.out.println(i+"秒");
            i++;
            try{
                /**
                 * 使用Thread.sleep(long time)阻塞线程时强制
                 * 让我们必须捕获“中断异常”
                 * 引发情况：
                 *  当前线程处于Sleep阻塞期间，被另一个线程中断阻塞状态
                 *  时，当前线程会抛出该异常。
                 */
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
