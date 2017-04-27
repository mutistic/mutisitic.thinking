package com.project.chap03.exercise;

import static com.project.common.BaseMainClass.*;

import java.util.Random;

/**
 * <p>功能描述：P46_演示操作符</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>练习7：编写一个程序，模拟扔硬币结果 </p>
 * YC.Yin-2016-6-15 下午4:12:59
 */
public class E7_Bool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int result = rand.nextInt(3);
		println("模拟扔硬币结果：");
		if(result == 0){
			println("【result = "+ result +"】【反面】");
		} else if(result == 1){
			println("【result = "+ result +"】【正面】");
		} else if(result == 2){
			println("【result = "+ result +"】【中间】");
		} else {
			println("【result = "+ result +"】【我也不知道是什么面】");	
		}
	}

}
