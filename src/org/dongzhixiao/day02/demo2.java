package org.dongzhixiao.day02;

public class demo2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  a = 1;
		a = a++;
		System.out.println(a);
		//上面运算注意：
		//1 取a的值1作为(a++)的结果1
		//2将a的值加1， a为2
		//3执行赋值运算，将(a++)的结果1赋值给a为1
	}

}
