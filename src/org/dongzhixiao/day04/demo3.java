package org.dongzhixiao.day04;

import java.util.Random;
/**
 * 
 * @author Administrator
 * ˫ɫ�����ɲ�Ʊ����
 */
public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] pool = {"01","02","03","04","05","06","07","08","09","10","11","12",
				"13","14","15","16","17","18","19","20","21","22","23","24",
				"25","26","27","28","29","30","31","32","33"};
		boolean[] used = new boolean[pool.length];
		String[] balls = {null,null,null,null,null,null};
		int i = 0; //����balls����һ����λ��index
		Random random = new Random();
		while(true){
			int n = random.nextInt(pool.length);
			if(used[n]){
				continue;
			}
			balls[i++] = pool[n]; //���û��ʹ�ù���ȡ����pool[n]
			used[n] = true;
			if(i == balls.length){
				break;
			}
		}
		for(i = 0 ; i < balls.length ; ++i){
			System.out.println(balls[i]);
		}
	}
}
