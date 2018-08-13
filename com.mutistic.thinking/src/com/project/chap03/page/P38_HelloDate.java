package com.project.chap03.page;

import static com.project.common.BaseMainClass.*;

import java.util.Date;

/**
 * <p>功能描述：P38_HelloDate示例（使用内部封装的print()方法打印输出到控制台）</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符</p>
 * <p>3.1 更简单的打印 </p> 
 * YC.Yin-2016-5-4 下午8:51:15
 */
public class P38_HelloDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date nowDate = new Date();
		System.out.println("1、使用System.out.print()方法打印：");
		System.out.print("Hello，当前时间是：");
		System.out.print(nowDate);
		
		println("\n----------------------------------------------------------------------------------------------------");
		print("2、使用静态导入的import static com.project.common.BaseMainClass.print 方法打印：\n");
		print("Hello，当前时间是：");
		print(nowDate);
		
		println("\n----------------------------------------------------------------------------------------------------");
		println("【小结" +
				"\n1、使用静态导入的关键字是： import static " +
				"\n2、import static 包名.类名.静态方法名称/静态成员名称;  该导入格式可以使用具体的静态方法或则静态成员。" +
				"\n3、import static 包名.类名.*;  该导入格式可以导入类中所有静态方法和静态成员。" +
				"\n4、优点：导入后，再使用这些属性会非常简单，这样可以规避单继承的问题。" +
				"\n5、缺点：虽然缩减了代码，导致代码的可读性会变差。】");
	}

}
