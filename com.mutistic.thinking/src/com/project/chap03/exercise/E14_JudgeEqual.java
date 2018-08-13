package com.project.chap03.exercise;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P63_演示==、!=、equals()的判等 </p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>练习14：编写一个接收两个字符串参数的方法， 用各种布尔值的比较关系来比较这两个字符串，然后把结果打印出来。做 == 和 != 比较的同时，用 equals()作测试。在main()里面用几个不同的字符串对象调用这个方法。 </p>
 * YC.Yin-2016-6-25 下午8:39:32
 */
public class E14_JudgeEqual {

	private static void getJuedeEqual(String _str1, String _str2) {
		println("_str1 == _str2 : "+ (_str1 == _str2));	
		println("_str1 != _str2 : "+ (_str1 != _str2));	
		println("_str1.equal(_str2) : "+ (_str1.equals(_str2)));	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		println("1、演示新建对象的判等的结果：");
		String str1 = new String("ABC");	
		String str2 = new String("ABC");
		getJuedeEqual(str1, str2);
		
		println("\n2、演示新建对象的判等的结果：");
		String str3 = "ABC";	
		String str4 = "ABC";	
		getJuedeEqual(str3, str4);
	}

}
