package org.dongzhixiao.day10.thread;

public class MySecThread extends Thread{
    @Override
    public void run() {
        for(int i = 0; i<=10000;++i){
            System.out.println("ÄãºÃ"+i+"´Î");
        }
    }
}
