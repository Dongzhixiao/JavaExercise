package org.dongzhixiao.day09;

import java.io.File;

public class TestFileUtils {
	public static void main(String[] args) {
		try {
			FileUtils.listDirectory(new File("."));
			FileUtils.deleteDirectory(new File("demo"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
