package com.project.chap04.exercise;

import static com.project.common.BaseMainClass.*;

import java.util.Random;

/**
 * <p>功能描述：P67_演示打印素数 
 * 素数[质数]定义: 在一个大于1的自然数中，除了1和此整数自身外，不能被其他自然数整除的</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p> </p>
 * YC.Yin-2016-6-26 下午6:14:46
 */
public class E4_PrimeNumber {

	/**
	 * <p>方法描述：打印出1-100之间的素数 </p>
	 * YC.Yin-2016-6-27 上午10:58:33
	 */
	private static void printlnPrimeNumber() {
		for(int i = 1; i <= 100; i++){
			boolean isPrimeNumber = true;

			//1不是素数
			if(i == 1) continue;

			for(int j = 2 ; j < i; j++){
				if(i % j == 0){
					isPrimeNumber = false;
					break;
				}
			}

			if(isPrimeNumber) print(i+"、");
		}
		println("\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			println("1、打印1-100之间的素数：");
			printlnPrimeNumber();
			
			println("2、判断一个数是否是素数：");
			Random rand = new Random();
			long number = rand.nextLong(); //Math.abs(rand.nextLong()); //rand.nextLong()的绝对值
			println(number +"是否是素数："+ validateIsPrimeNumber(number));
		} catch (Exception e) {
			printlnMessage("验证数值是否是素数出现异常", e);
		}
	}

}
