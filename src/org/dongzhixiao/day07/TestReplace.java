package org.dongzhixiao.day07;
/**
 * 
 * @author Administrator
 * �����ַ����滻����
 */
public class TestReplace {

	public static void main(String[] args) {
		String info = "12345BADADF232323ADFD12";
		//�����������滻��"#NUMBER#"
		//replaceAll(String regex,String replacement)
		String str = info.replaceAll("\\d+", "#NUMBER#");
		System.out.println(str);
	}

}
