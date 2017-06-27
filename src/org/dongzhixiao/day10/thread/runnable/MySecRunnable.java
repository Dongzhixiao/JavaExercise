package org.dongzhixiao.day10.thread.runnable;

public class MySecRunnable implements Runnable{
    @Override
    public void run() {
        for(int i = 1; i<=10000;++i){
            System.out.println("ÄãºÃ"+i+"´Î");
        }
    }
}
