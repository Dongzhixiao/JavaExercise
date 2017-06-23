package org.dongzhixiao.day03;
/**
 * 
 * @author Administrator
 * 查找一个范围内所有质数
 * 1 判断一个数是否是质数
 * 假设数是num，在[2,num/2]内的数，都不能整除num，则num就是质数
 * 2 找出一个范围内所有质数
 */
public class demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num = 2 ; num <= 1000; ++num){
			boolean isPrime = true;
			for(int n = 2 ; n <= num/2 ; ++n){
				if(num%n == 0){
					//当前num不是质数
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				System.out.println(num+"是质数！");
			}
//			else{
//				System.out.println(num+"不是质数！");
//			}
		}
	}

}
