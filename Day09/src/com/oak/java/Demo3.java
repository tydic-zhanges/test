package com.oak.java;

public class Demo3 {
	public static void main(String[] args) {
		/*GouZao g = new GouZao("����");
		g.show1();
		GouZao g1 = new GouZao(18);
		g1.show();*/
		GouZao g = new GouZao();

	}

}

class GouZao {
	String name;
	int age;

	// �޲ι��췽��
	public GouZao() {
		System.out.println("�����޲ι��췽��"+name+"---"+age);
	}

/*	// �вι��췽��1
	public GouZao(int age1) {
		age = age1;
		System.out.println("�����޲ι��췽��2" + age);

	}
    //�вι��췽��2
	public GouZao(String name1) {
		name = name1;
		System.out.println("�����޲ι��췽��4");
	}
    //�вι��췽��3
	public GouZao(int age, String name) {
		System.out.println("�����޲ι��췽��3");
	}
   //show����
	public void show() {
		System.out.println("������" + age + "��");
	}

	public void show1() {
		System.out.println("����" + name);
	}*/

}