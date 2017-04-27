package com.project.chap03.exercise;

import static com.project.common.BaseMainClass.*;
import java.util.Date;

/**
 * <p>功能描述：P38_使用内部封装的print()方法打印输出到控制台</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符</p>
 * <p>练习1：使用简短的和正常的打印语句来编写一个程序</p>
 * YC.Yin-2016-5-4 下午8:51:15
 */
public class E1_HelloDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date nowDate = new Date();
		System.out.print("Hello，当前时间是：");
		System.out.print(nowDate);
		
		print("\nHello，当前时间是：");
		print(nowDate);
	}

}
