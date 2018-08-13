package com.project.chap03.page;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P40_Assignment示例（演示值传递方式赋值、引用传递方式赋值）</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符</p>
 * <p>3.4 赋值 </p> 
 * YC.Yin-2016-5-4 下午10:16:53
 */
public class P40_Assignment {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		passedByValue();
		println("\n-------------------------------------------------------------------");
		passedByReference();
		
		println("\n-------------------------------------------------------------------");
		println("【小结：" +
				"\n1、对基本数据类型的赋值，是采用值传递的方式赋值。这是因为基本数据类型存储了实际的值，而并非只想一个对象的引用。" +
				"\n2、对引用类型的赋值，是采用引用传递的方式赋值。对其中一个对象操作时，实际操作的是引用。" +
				"\n3、赋值操作的是一个对象的引用。此赋值方式会使引用被覆盖，那么垃圾回收器会自动清理，不再被引用的对象。】");
	}
	
	/**
	 * <p>方法描述：演示值传递</p>
	 * YC.Yin-2016-5-4 下午10:34:48
	 */
	public static void passedByValue() {
		Test t1 = new Test();
		Test t2 = new Test();
		
		println("1、基本数据类型-值传递方式赋值：");
		t1.number = 1;
		t2.number = 2;
		println("【t1.number = "+ t1.number +"】");	
		println("【t2.number = "+ t2.number +"】");	
		
		println("\n-------------------------------------------------------------------");
		println("2、基本数据类型赋值-属性值传递方式赋值）：");
		t1.number = t2.number;
		t2.number = 3;
		println("【t1.number = "+ t1.number +"】");	
		println("【t2.number = "+ t2.number +"】");	
		
		println("\n-------------------------------------------------------------------");
		println("3、基本数据类型-类引用传递方式赋值：");
		t1 = t2;
		t2.number = 4;
		println("【t1.number = "+ t1.number +"】");	
		println("【t2.number = "+ t2.number +"】");		
	}
	
	/**
	 * <p>方法描述：演示引用传递</p>
	 * YC.Yin-2016-5-4 下午10:34:48
	 */
	public static void passedByReference() {
		Test t1 = new Test();
		Test t2 = new Test();
		
		println("4、引用类型-字符串引用传递方式赋值：");
		t1.name = "A";
		t2.name = "B";
		println("【t1.name = "+ t1.name +"】");	
		println("【t2.name = "+ t2.name +"】");	
		
		println("\n-------------------------------------------------------------------");
		println("5、引用类型-字符串引用传递方式赋值：");
		t1.name = t2.name;
		t2.name = "C"; //t2.name = new String("C");
		println("【t1.name = "+ t1.name +"】");	
		println("【t2.name = "+ t2.name +"】");	
		
		println("\n-------------------------------------------------------------------");
		println("6、引用类型-类引用传递方式赋值：");
		t1 = t2;
		t2.name = "C";
		println("【t1.name = "+ t1.name +"】");	
		println("【t2.name = "+ t2.name +"】");	
		
	}
	
}

/** 功能描述：用于展示赋值运算的类 **/
class Test {
	/** 基本数据类型  **/
	int number;
	/** 引用数据类型 **/
	String name;
}
