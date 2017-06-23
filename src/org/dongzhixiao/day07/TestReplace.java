package org.dongzhixiao.day07;
/**
 * 
 * @author Administrator
 * 测试字符串替换操作
 */
public class TestReplace {

	public static void main(String[] args) {
		String info = "12345BADADF232323ADFD12";
		//将其中数字替换成"#NUMBER#"
		//replaceAll(String regex,String replacement)
		String str = info.replaceAll("\\d+", "#NUMBER#");
		System.out.println(str);
	}

}
