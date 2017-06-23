package org.dongzhixiao.day09;

import java.io.File;
import java.io.IOException;

/**
 * 
 * @author Dongzhixiao 文件工具类
 */
public class FileUtils {
	// 列出给的目录下所有子项
	public static void listDirectory(File dir) throws IOException {
		if (dir == null) {
			throw new IllegalArgumentException(dir + "为空");
		}
		if (!dir.exists()) {
			throw new IllegalArgumentException("目录：" + dir + "不存在");
		}
		if (!dir.isDirectory()) {
			throw new IllegalArgumentException(dir + "不是一个目录");
		}

		File[] files = dir.listFiles();
		if (files != null && files.length > 0) {
			for (File file : files) {
				if (file.isDirectory()) {
					// 递归查找目录
					listDirectory(file);
				} else {
					System.out.println(file);
				}
			}
		}
	}

	// 删除指定目录
	public static void deleteDirectory(File dir) throws IOException {
		if (dir == null) {
			throw new IllegalArgumentException(dir + "为空");
		}
		if (!dir.exists()) {
			throw new IllegalArgumentException("目录：" + dir + "不存在");
		}
		if (!dir.isDirectory()) {
			throw new IllegalArgumentException(dir + "不是一个目录");
		}
		File[] files = dir.listFiles();
		if (files != null && files.length > 0) {
			for (File file : files) {
				if (file.isDirectory()) {
					// 递归删除文件
					deleteDirectory(file);
				} else {
					if (!file.delete()) {
						throw new IOException("无法删除文件" + file);
					}
				}
			}
		}
		// 当前子目录都被删除后,还有目录要删除
		if (!dir.delete()) {
			throw new IOException("无法删除文件" + dir);
		}
	}
}
