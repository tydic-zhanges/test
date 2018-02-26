package com.oak.java;
/**
 *   多态
 * @author Administrator
 *
 */

public class Demo2 {
	public static void main(String[] args) {
		Master master = new Master();
		master.feed(new Dog(), new Bone());//把任何一个子类交给父类
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
		System.out.println("狗狗爱吃骨头");
	}
}
class Cat extends Animal{
	public void eat(){
		System.out.println("猫爱吃鱼");
	}
}
class Food{
	String name;
	public void showName(){
		
	}
}
class Fish extends Food{
	public void showName(){
		System.out.println("鱼");
	}
}
class Bone extends Food{
	public void showName(){
		System.out.println("骨头");
	}
}