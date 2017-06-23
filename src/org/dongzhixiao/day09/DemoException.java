package org.dongzhixiao.day09;
/**
 * 
 * @author Administrator
 * java异常处理机制
 * Exception: 程序级别，我们可控
 * Error:     系统级别，我们不可控
 * 
 * java异常Exception分为
 * 运行时异常：编译时不检查异常
 * 可检查异常：编译时检查
 * 
 * RuntimeException:运行时异常
 * 若方法中抛出的异常或者其子类，那么声明方法时可以
 * 不在throws中列举该类抛出的异常！
 */
public class DemoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String info = "hello";
			System.out.println(info.length());
			
			System.out.println("第十个字符是"+info.charAt(9));
			
			
		}catch(NullPointerException	e){
			System.out.println("这里有空指针");
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("字符没有那么长");
		}catch(Exception e){//注意，父类房子最下面，子类在上面！
			//良好习惯，最后写一个最大异常，捕获未知错误，保证程序一直进行
			System.out.println("出现了某种未知异常");
		}
		System.out.println("程序结束了");
	}

}
