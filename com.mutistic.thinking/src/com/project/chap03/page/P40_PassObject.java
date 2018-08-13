package com.project.chap03.page;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P40_PassObject示例（演示调用方法传递引用类型数据）</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符</p>
 * <p>3.4.1 方法调用中别名的问题 </p> 
 * YC.Yin-2016-6-2 下午9:47:02
 */
public class P40_PassObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Letter letter = new Letter();
		letter.valueInt = 123;
		letter.valueChar = 'A';
		letter.valueStr = "old";
		
		println("1、调用前Letter对象的属性值：");
		println("【letter.valueInt = "+ letter.valueInt +"】【letter.valueChar = "+ letter.valueChar 
				+"】【letter.valueStr = "+ letter.valueStr +"】");
		
		chargeData(letter);
		println("\n2、调用后Letter对象的属性值：");
		println("【letter.valueInt = "+ letter.valueInt +"】【letter.valueChar = "+ letter.valueChar 
				+"】【letter.valueStr = "+ letter.valueStr +"】");
		
		println("【\n小结：" +
				"\n1、对于方法参数列表中的引用类型参数，调用者其实际传递的是对象的引用。】");
	}
	
	static void chargeData(Letter _letter){
		_letter.valueInt = 456;
		_letter.valueChar = 'C';
		_letter.valueStr = "charge";
	}

}

class Letter {
	int valueInt;
	char valueChar;
	String valueStr;
}