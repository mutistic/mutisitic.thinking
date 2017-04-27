package com.project.chap04.exercise;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P66_打印1-100的值 </p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>练习1：写一个程序，打印从1到100的值 </p>
 * YC.Yin-2016-6-26 下午5:25:00
 */
public class E1_ArrayPrintln {

	/**
	 * <p>方法描述：while循环打印1-100 </p>
	 * YC.Yin-2016-6-26 下午5:40:45
	 */
	private static void whilePrintln() {
		int i = 1;
		while(i <= 100) {
			println("while: 【i ="+ i +"】");
			i++;
		}
	}
	
	/**
	 * <p>方法描述：doWhile循环打印1-100 </p>
	 * YC.Yin-2016-6-26 下午5:40:45
	 */
	private static void doWhilePrintln() {
		int i = 1;
		do {
			println("doWhile: 【i ="+ i +"】");
			i++;
		} while(i <= 100);
	}
	
	/**
	 * <p>方法描述：for循环打印1-100 </p>
	 * YC.Yin-2016-6-26 下午5:40:45
	 */
	private static void forPrintln() {
		for(int i = 1; i <= 100; i++) {
			println("for: 【i ="+ i +"】");
		}
	}
	
	/**
	 * <p>方法描述：foreach循环打印1-100 </p>
	 * YC.Yin-2016-6-26 下午5:40:45
	 */
	@SuppressWarnings("unused")
	private static void foreachPrintln() {
		int j = 0;
		for (int i : new int[100]) {
			j++;
			println("foreach: 【j ="+ j +"】");
			
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		println("1、while循环打印1-100：");
		whilePrintln();
		
		println("\n2、do-while循环打印1-100：");
		doWhilePrintln();
		
		println("\n3、for循环打印1-100：");
		forPrintln();
		
		println("\n4、foreach循环打印1-100：");
		foreachPrintln();
	}

}
