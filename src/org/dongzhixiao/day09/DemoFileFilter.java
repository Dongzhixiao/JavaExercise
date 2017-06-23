package org.dongzhixiao.day09;

import java.io.File;
import java.io.FileFilter;

/**
 * 
 * @author Dongzhixiao
 *
 */
public class DemoFileFilter {

	public static void main(String[] args) {
		// 定义一个文件过滤器，过滤.java文件
		FileFilter filter = new FileFilter(){
			/**
			 * 定义过滤条件的参数pathname是将过滤的目录中的每个
			 * 子项依次传入进行匹配
			 * 若满足条件，返回true，否则返回false
			 */
			@Override
			public boolean accept(File pathname) {
				//保留文件名以.java结尾的
				//也可以加入其它过滤条件，比如文件大小等……
				return pathname.getName().endsWith(".java");
			}
		};
		//创建一个目录
		File dir = new File(".");
		//获取满足过滤器的子项
		File[] sub = dir.listFiles(filter);//回调模式：方法回调使用方法者提供的逻辑，常见有：按钮监听器、过滤器应用
		for(File file:sub){
			System.out.println(file);
		}
	}

}