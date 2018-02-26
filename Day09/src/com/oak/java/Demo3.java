package com.oak.java;

public class Demo3 {
	public static void main(String[] args) {
		/*GouZao g = new GouZao("张三");
		g.show1();
		GouZao g1 = new GouZao(18);
		g1.show();*/
		GouZao g = new GouZao();

	}

}

class GouZao {
	String name;
	int age;

	// 无参构造方法
	public GouZao() {
		System.out.println("这是无参构造方法"+name+"---"+age);
	}

/*	// 有参构造方法1
	public GouZao(int age1) {
		age = age1;
		System.out.println("这是无参构造方法2" + age);

	}
    //有参构造方法2
	public GouZao(String name1) {
		name = name1;
		System.out.println("这是无参构造方法4");
	}
    //有参构造方法3
	public GouZao(int age, String name) {
		System.out.println("这是无参构造方法3");
	}
   //show方法
	public void show() {
		System.out.println("他今年" + age + "岁");
	}

	public void show1() {
		System.out.println("他叫" + name);
	}*/

}