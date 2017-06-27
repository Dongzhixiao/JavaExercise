package org.dongzhixiao.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 使用缓冲字符输入流读取键盘输入信息
 * @author Administrator
 *
 */
public class DemoSystemIn {

    public static void main(String[] args) throws IOException {
        //将键盘输入流转换为字符输入流再转换为缓冲字符输入流
        //1 将键盘的字节输入流转换为字符输入流
       InputStreamReader isr = new InputStreamReader(System.in);
       
       //2 使用缓冲字符输入流，按照行读取
       BufferedReader reader = new BufferedReader(isr);
       
       //循环获取用户输入信息并输出到控制台
       String info = null;
       while(true){
           info = reader.readLine();
           if("exit".equals(info.trim())){
               break;
           }
           System.out.println(info);
       }
    }

}
