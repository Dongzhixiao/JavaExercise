package org.dongzhixiao.day03;

import java.util.Scanner;
/**
 * 
 * @author Administrator
 * 注意；比较字符串是否相等必须用equals方法！不能使用==运算符！！
 * "1".equals(cmd)比cmd.equals("1")要好！！
 */
public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		while(true){
			System.out.println("选择功能： \n1.查看全部 \n2.删除 、\n3.添加 \n0.退出 \n请选择：");
			String cmd = console.nextLine();
			if("1".equals(cmd)){
				System.out.println("查看全部");
			}else if("2".equals(cmd)){
				System.out.println("删除");
			}else if("3".equals(cmd)){
				System.out.println("添加");
			}else if("0".equals(cmd)){
				System.out.println("bye!");
				break;
			}else{
				System.out.println("输出错误！");
			}
		}	
	}

}
