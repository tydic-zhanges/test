package com.oak.java;
/**
 *   ��̬
 * @author Administrator
 *
 */

public class Demo2 {
	public static void main(String[] args) {
		Master master = new Master();
		master.feed(new Dog(), new Bone());//���κ�һ�����ཻ������
		master.feed(new Cat(), new Fish());
	}

}
class Master{
	public void feed(Animal a,Food f){
		a.eat();
		f.showName();
	}
}

class Animal{
	String name;
	int age;
	public void eat(){
		System.out.println("chi");
	}
	public void cry(){
		System.out.println("jiao");
	}
}
class Dog extends Animal{
	public void eat(){
		System.out.println("�������Թ�ͷ");
	}
}
class Cat extends Animal{
	public void eat(){
		System.out.println("è������");
	}
}
class Food{
	String name;
	public void showName(){
		
	}
}
class Fish extends Food{
	public void showName(){
		System.out.println("��");
	}
}
class Bone extends Food{
	public void showName(){
		System.out.println("��ͷ");
	}
}