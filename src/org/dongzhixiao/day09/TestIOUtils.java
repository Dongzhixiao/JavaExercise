package org.dongzhixiao.day09;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class TestIOUtils {

	public static void main(String[] args) {
		File file = new File("data.dat");
		try{
			byte[] data = IOUtils.loadBytes(file);
			System.out.println(Arrays.toString(data));
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
