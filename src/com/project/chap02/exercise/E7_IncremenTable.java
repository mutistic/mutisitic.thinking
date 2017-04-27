package com.project.chap02.exercise;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P37_调用类中静态方法、静态字段</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第2章 一切都是对象</p>
 * <p>练习7：将IncremenTable的代码段改写成一个完成的可运行程序。(代码段位置：P30)</p>
 * YC.Yin-2016-5-4 下午2:35:49
 */
@SuppressWarnings("static-access")
public class E7_IncremenTable {

	/** 静态成员 **/
	static int number = 1;
	/** 静态方法 **/
	static void increments(){
		E7_IncremenTable.number ++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		println("1、使用 类名.属性名  调用类中的静态成员：");
		println("number ="+ E7_IncremenTable.number);
		
		println("\n2、使用 类名.方法名  调用类中的静态方法：");
		E7_IncremenTable.increments();
		println("number ="+ E7_IncremenTable.number);
		
		println("\n3、使用 对象名.方法名、对象名.属性么  调用类中的静态方法、静态成员：");
		E7_IncremenTable in = new E7_IncremenTable();
		in.increments();
		println("number ="+ in.number);
	}
	
}
