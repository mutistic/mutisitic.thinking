package com.project.chap02.exercise;

/**
 * <p>功能描述：P37_验证类中static（静态）域只有一个实例-声明静态成员 </p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第2章 一切都是对象</p>
 * <p>练习8：编写一个程序，展示无论你创建了某个特定类的多少个对象，这个类中某个特定的 static域只有一个实例</p>
 * YC.Yin-2016-5-4 下午2:44:45
 */
public class E8_StaticClass {

	/** 静态成员-基本数据类型(int) **/
	public static int INT_STATIC = 37;
	
	/** 静态成员-引用类型(String) **/
	public static String STRING_STATIC = "练习8";
	
	/** 静态成员-类类型(class) **/
	public static E8_StaticClass CLASS_STATIC = new E8_StaticClass();

}
