package com.project.chap03.exercise;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P41_演示使用别名机制对方法的传递 </p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符</p>
 * <p>练习3：创建一个包含一个float域的类，并用这个类来展示方法调用时的别名机制 </p> 
 * YC.Yin-2016-6-2 下午9:47:02
 */
public class E3_PassObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Letter letter = new Letter();
		letter.valueFloat = 123l;
		
		println("1、调用前Letter对象的属性值：");
		println("【letter.valueInt = "+ letter.valueFloat +"】");
		
		chargeData(letter);
		println("\n2、调用后Letter对象的属性值：");
		println("【letter.valueInt = "+ letter.valueFloat +"】");
	}
	
	static void chargeData(Letter _letter){
		_letter.valueFloat = 456l;
	}

}

class Letter {
	float valueFloat;
}