package com.oak.java;

/**
 * static ���ص㣺
 * 			�������γ�Ա������Ҳ�������γ�Ա����
 * 			1.������ļ��ض�����
 * 					������main������
 * 			2.�����ڶ������
 * 			3.��������ж�����
 * 				������
 * 					��ˮ���� ����static��̬���Σ���ˮ�������������˹����
 * 				���ǽ����� ������Щ�ǹ�����أ����ң��յ���ͶӰ����Щ���ǿ���ʹ��static����
 * 					ˮ���������Թ���������ʹ��static���Σ�
 * 					
 * 			4.����ͨ������ȥ����
 * 					��ʵ������Ҳ����ʹ�� ������������
 * 					�Ƽ�ʹ����������
 * 					��̬���ε����ݣ�һ�����ǳ���Ϊ��������ص����Ա
 * 
 * 			5�����Ա������Щ�أ�
 * 					��Ա����
 * 					��Ա����
 * 			���Ա���Ա� static ���� */


public class StaticDemo {
public static void main(String[] args) {
		
		Persion p = new Persion();
		System.out.println(p.num);
		System.out.println(Persion.num2 );
		System.out.println(p.num2);
		
		//��̬���� ����ͨ��  ����������
		StaticDemo.show();
		p.show1();
		Persion p1 = new Persion();
		p1.show1();
	}
	
	//static ���εķ��� �о�̬����
	public static void show(){
		System.out.println("�����Ǿ�̬�ĳ�Ա����");
	}
	
}



class Persion{
	
	
	//�Ǿ�̬����
	int num = 10;
	//��̬����    static ���εľ��Ǿ�̬��
	static int num2 = 20;
	
	public static void show1(){
		System.out.println("������Persion���еľ�̬�ĳ�Ա����");
	}

}
