package org.dongzhixiao.day09;

import java.io.File;

/**
 * 
 * @author Administrator
 * 目录下的子目录和文件
 */
public class DemoSubFiles {

	public static void main(String[] args) {
		File dir = new File(".");
		//是否为一个目录
		if(dir.exists()&&dir.isDirectory()){
			//获取当前目录的子项(目录或者文件)
			File[] files = dir.listFiles();
			for(File file : files){
				if(file.isFile()){
					System.out.println("文件:"+file.getName());
				}else{
					System.out.println("目录:"+file.getName());
				}
			}
		}
		
		//删除文件      删除根目录下data.dat   直接写代表根目录
		File file1 = new File("data.dat"); 
		if(file1.exists()){
			if(file1.delete()){
				System.out.println("删除成功");
			}else{
				System.out.println("删除失败");
			}				
		}
		//注意：用上方法删目录，必须目录里面没有子项才能成功！
	}

}
