package org.dongzhixiao.day05;

public class demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c1 = new Cat(4);
		Cat c2 = new Cat(5);
		System.out.println(c1.age+","+c2.age+","+Cat.numOfCats);
	}

}
class Cat{
	int age;//
	static int numOfCats = 0;
	public Cat(int age){
		this.age = age;
		numOfCats++;
	}
}