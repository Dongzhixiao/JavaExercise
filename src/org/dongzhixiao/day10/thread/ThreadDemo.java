package org.dongzhixiao.day10.thread;
import org.dongzhixiao.day10.thread.Bank.Person;
/**
 * 多线程并发安全问题
 * 
 * synchronized关键字
 * 线程安全锁
 * synchronized可以修饰方法也可以单独作为语句块存在
 * synchronized作用是限制多线程并发时同时访问该作用域
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
         * p1和p2都在bank对象上等待了。进入了阻塞
         */
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        bank.count = 10000;
        //bank初始化完毕
        synchronized(bank){
            bank.notifyAll();//通知等待线程可以工作了
//            bank.notify();//只能启动一个线程
        }
    }
}
class Bank{
    int count = 10000;
    /**
     * 取钱方法  
     * 1 可以加上synchronized关键字
     * 加上后，方法就不是异步的，而是同步的了，synchronized会为方法上锁
     * 
     * 2 synchronized同步块
     * synchronized(Object){
     *  需要同步的代码片段
     * }
     * 这里必须注意！Object要确保所有线程看到的是同一个对象！
     * 否则起不到同步的效果！
     * 
     * @param money
     */
    void getMoney(int money){
        synchronized(this){ //这里一般用this，因为可以保证是同一个对象
            if(count == 0){
                throw new RuntimeException("余额为0");
            }
            Thread.yield();
            count -= money;
        }
    }    
    //注意：线程抛异常，只会线程死！
    class Person extends Thread{
        public void run(){
            System.out.println("准备取钱,等待银行开门！");
            try {
                synchronized(Bank.this){//这里wait必须使用synchronized包装！同时参数必须是使用wait方法的那个对象
                    Bank.this.wait();//当前线程(Person)在银行对象上等待
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            while(true){
                getMoney(100);
                System.out.println("当前余额："+count);
                Thread.yield();
            }
        }
    }
}