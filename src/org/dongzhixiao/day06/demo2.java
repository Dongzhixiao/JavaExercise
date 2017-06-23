package org.dongzhixiao.day06;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ary = new int[2][3];
		ary[1] = new int[]{4,5,6,7};
		
		System.out.println(ary[1][2]);
		System.out.println(ary.length);
		System.out.println(ary[0].length);
		System.out.println(ary[1].length);
		
		for(int i = 0 ; i<ary.length ; i++){
			int[] temp = ary[i];
			for(int j = 0 ; j<temp.length; j++){
				System.out.print(temp[j]+" ");
			}
			System.out.println();
		}
	}

}
