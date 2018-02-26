package com.oak.java;

/**
 * static 的特点：
 * 			可以修饰成员变量，也可以修饰成员方法
 * 			1.随着类的加载而加载
 * 					（回想main方法）
 * 			2.优先于对象存在
 * 			3.被类的所有对象共享
 * 				举例：
 * 					饮水机： （用static静态修饰）饮水机是我们所有人共享的
 * 				我们教室中 还有哪些是共享的呢：教室，空调，投影仪这些都是可以使用static修饰
 * 					水杯：不可以共享（不可以使用static修饰）
 * 					
 * 			4.可以通过类名去调用
 * 					其实他本身也可以使用 对象名来调用
 * 					推荐使用类名调用
 * 					静态修饰的内容，一般我们称其为：与类相关的类成员
 * 
 * 			5，类成员包括哪些呢？
 * 					成员变量
 * 					成员方法
 * 			类成员可以被 static 修饰 */


public class StaticDemo {
public static void main(String[] args) {
		
		Persion p = new Persion();
		System.out.println(p.num);
		System.out.println(Persion.num2 );
		System.out.println(p.num2);
		
		//静态方法 可以通过  类名来调用
		StaticDemo.show();
		p.show1();
		Persion p1 = new Persion();
		p1.show1();
	}
	
	//static 修饰的方法 叫静态方法
	public static void show(){
		System.out.println("这里是静态的成员方法");
	}
	
}



class Persion{
	
	
	//非静态变量
	int num = 10;
	//静态变量    static 修饰的就是静态的
	static int num2 = 20;
	
	public static void show1(){
		System.out.println("这里是Persion类中的静态的成员方法");
	}

}
