package com.oak.java;

import java.util.Arrays;
import java.util.Random;

/**
 * 定义一个一维数组，使用动态和静态两种方式定义
 * 并遍历数组，通过索引取值
 **/

public class Demo5 {
	public static void main(String[] args) {
		//静态定义,自动生成数组
		int[] arr = new int[4];
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i]=ran.nextInt(10);
		} 
		System.out.println("第一个数组为："+Arrays.toString(arr));
		
		//动态定义
		int[] arr1 ={1,2,3,4};
		 for (int i = 0; i < arr1.length; i++) {
			System.out.println("第二个数组"+"arr"+"["+i+"]"+"="+arr[i]);
		}
		
		
	}

}
