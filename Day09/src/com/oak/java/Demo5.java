package com.oak.java;

import java.util.Arrays;
import java.util.Random;

/**
 * ����һ��һά���飬ʹ�ö�̬�;�̬���ַ�ʽ����
 * ���������飬ͨ������ȡֵ
 **/

public class Demo5 {
	public static void main(String[] args) {
		//��̬����,�Զ���������
		int[] arr = new int[4];
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i]=ran.nextInt(10);
		} 
		System.out.println("��һ������Ϊ��"+Arrays.toString(arr));
		
		//��̬����
		int[] arr1 ={1,2,3,4};
		 for (int i = 0; i < arr1.length; i++) {
			System.out.println("�ڶ�������"+"arr"+"["+i+"]"+"="+arr[i]);
		}
		
		
	}

}
