package org.dongzhixiao.day03;
/**
 * 
 * @author Administrator
 * ����һ����Χ����������
 * 1 �ж�һ�����Ƿ�������
 * ��������num����[2,num/2]�ڵ���������������num����num��������
 * 2 �ҳ�һ����Χ����������
 */
public class demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num = 2 ; num <= 1000; ++num){
			boolean isPrime = true;
			for(int n = 2 ; n <= num/2 ; ++n){
				if(num%n == 0){
					//��ǰnum��������
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				System.out.println(num+"��������");
			}
//			else{
//				System.out.println(num+"����������");
//			}
		}
	}

}
