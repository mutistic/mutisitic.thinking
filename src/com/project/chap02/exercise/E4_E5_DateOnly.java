package com.project.chap02.exercise;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P37_为类中字段（数据成员）赋值 </p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第2章 一切都是对象</p> 
 * <p>练习4：将DateOnly代码段改写成为一个程序，然后编译、运行（代码段位置：P26）</p> 
 * <p>练习5：修改练习4，将DateOnly中的数据在main()方法中赋值并打印出来</p> 
 * YC.Yin-2016-4-28 上午10:12:31
 */
public class E4_E5_DateOnly {
	
	/** int数据类型 **/
	int intDate;
	/** double数据类型 **/
	double doubleDate;
	/** boolean数据类型 **/
	boolean booleanDate;

	/** 为类中字段（数据成员）赋值 - main()方法入口 **/
	public static void main(String[] args){
		E4_E5_DateOnly date = new E4_E5_DateOnly();
		date.intDate = 10;
		date.doubleDate = 20d;
		date.booleanDate = false;
		
		println("intDate = "+ date.intDate);
		println("doubleDate = "+ date.doubleDate);
		println("booleanDate = "+ date.booleanDate);
	}
	
}