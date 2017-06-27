package org.dongzhixiao.day10.thread.runnable;

public class TestInnerClass {

    public static void main(String[] args) {
        //1匿名类实现Thread方式
        Thread t1 = new Thread(){
          @Override
          public void run() {
              for(int i = 0; i<10000;i++){
                  System.out.println(i);
              }
          }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                for(int i = 1; i<=10000;++i){
                    System.out.println("你好"+i+"次");
                }
            }
        };
        //2 匿名类实现Runnable方式
        Thread t3 = new Thread(new Runnable(){
           @Override
            public void run() {
               for(int i = 0 ; i<1000;++i){
                   System.out.println("aab");
               }
               
            } 
        });
        t3.run();
        t1.run();
        t2.run();
        
       
    }

}
