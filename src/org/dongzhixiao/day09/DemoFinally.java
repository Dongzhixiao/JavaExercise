package org.dongzhixiao.day09;

/**
 * 
 * @author Administrator
 * finally块定义在catch块最后，只能出现一次（或者不出现）
 * 无论程序是否出错都会执行，无条件执行！
 * 
 * 注意final和finally的区别！
 */
public class DemoFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try{
//			String info = "123456";
//			System.out.print("字符串第十个字符："+info.charAt(9));
//		}catch(NullPointerException e){
//			e.printStackTrace();
//		}finally{
//			System.out.println("finally!");
//		}
//		System.out.println("程序结束!");
		
		
		System.out.println(
				test(null)+","+test("0")+","+test(""));
		//上面以为是  1,0,2    实际是4,4,4
		//记住，finally无条件执行，后面的return 4把前面的覆盖了！
	}
	
	public static int test(String str){
		try{
			return str.charAt(0) - '0';
		}catch(NullPointerException e){
			return 1;
		}catch(RuntimeException e){
			return 2;
		}catch(Exception e){
			return 3;
		}finally{//无条件执行
			return 4;
		}
	}

}
