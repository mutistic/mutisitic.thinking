package com.project.chap03.exercise;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P40_演示使用别名机制对Float域赋值</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符</p>
 * <p>练习2：创建一个包含float域的类, 并用这个类来展示别名机制 </p>
 * YC.Yin-2016-6-2 下午9:22:16
 */
public class E2_Assigement {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FloatTest t1 = new FloatTest();
		t1.number = 1f;
		t1.assigement = new E2_Assigement();
		
		FloatTest t2 = new FloatTest();
		t2.number = t1.number;
		t2.assigement = t1.assigement;
		
		println("1、t1和t2是否是同一个引用: ");
		if(t1 == t2){
			println("t1 和 t2 这两个对象指向同一个引用,即 t1 == t2");
		} else {
			println("t1 和 t2 这两个对象指向的不是同一个引用,即 t1 != t2");
		}
		
		println("\n2、使用别名为float(浮点型)属性赋值: ");
		println("t1.number ="+ t1.number);
		println("t2.number ="+ t2.number);
		
		
		println("\n3、使用别名为class(类类型)属性赋值:");
		if(t1.assigement == t2.assigement){
			println("t1.assigement 和 t2.assigement class属性指向同一个引用,即 t1.assigement == t2.assigement");
		} else {
			println("t1.assigement 和 t2.assigement class属性指向的不是同一个引用,即 t1.assigement != t2.assigement");
		}
	}

	
	
}

class FloatTest{
	float number;
	E2_Assigement assigement;
}

