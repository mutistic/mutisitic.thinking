package com.project.chap02.exercise;

import static com.project.common.BaseMainClass.*;

/**
 * <p>题目描述：P37_验证Java的默认初始化 </p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第2章 一切都是对象</p> 
 * <p>练习1：创建一个类，它包含一个int域和一个char域，它们都没有被初始化，将他们的值大一出来，以验证Java执行了默认初始化</p> 
 * YC.Yin-2016-4-27 下午10:34:49
 */
public class E1_Initialize {

	/** 布尔型  - 基本数据类型 **/
	private static boolean BOOLEAN_DATE;
	/** 字符型   - 基本数据类型**/
	private static char CHAR_DATE;
	/** 字节型   - 基本数据类型**/
	private static byte BYTE_DATE;
	/** 短整型  - 基本数据类型**/
	private static short SHORT_DATE;
	/** 整型  - 基本数据类型 **/
	private static int INT_DATE;
	/** 长整型  - 基本数据类型 **/
	private static long LONG_DATE;
	/** 浮点型 - 基本数据类型 **/
	private static float FLOAT_DATE;
	/** 双精度型 - 基本数据类型 **/
	private static double DOUBLE_DATE;
	/** 字符串型 - 引用类型 **/
	private static String STRING_DATE;
	/** Object类型 - 引用类型 **/
	private static Object OBJECT_DATE;
	
	/** 输出基本数据类型的默认初始值 - main()方法入口 **/
	public static void main(String[] args) {
		
		println("\n1、基本数据类型默认初始值：");
		println("布尔型默认初始化值：boolean = "+ BOOLEAN_DATE);
		println("字符型默认初始化值：char = "+ CHAR_DATE);
		println("字节型默认初始化值：byte = "+ BYTE_DATE);
		println("短整型默认初始化值：short = "+ SHORT_DATE);
		println("整型默认初始化值：int = "+ INT_DATE);
		println("长整型默认初始化值：long = "+ LONG_DATE);
		println("浮点型默认初始化值：float = "+ FLOAT_DATE);
		println("双精度型默认初始化值：double = "+ DOUBLE_DATE);
		
		println("\n2、引用数据类型默认初始值：");
		println("字符串类型默认初始化值：String = "+ STRING_DATE);
		println("Object对象类型默认初始化值：Object = "+ OBJECT_DATE);
		
		println("\n\n【小结："); 
		println("1、若基本数据类型作为类成员的时候，即使没有进行初始化。Java也会给定默认的初始值。");
		println("2、char默认初始值是：'/uoooo'(null) " +
				"\nbyte默认初始值是：(byte)0" +
				"\nshort默认初始值是：(short)0" +
				"\nlong默认初始值是：0L" +
				"\nfloat默认初始值是：0.0f" +
				"\ndoublet默认初始值是：0.0d");
		println("3、在java中基本类型的默认值是0，引用类型会默认为null。】");
	}
	
}
