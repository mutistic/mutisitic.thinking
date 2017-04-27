package com.project.study.value_passed;

import static com.project.common.BaseMainClass.*;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>功能描述：验证Java中只有值传递 </p> 
 * YC.Yin-2016-5-5 下午3:25:24
 * <p>验证Java中只有值传递方式 </p>
 */
public class ValuePassedType {
	
	/**
	 * <p>方法描述：定义了一个改变基本数据类型参数值的函数 </p>
	 * YC.Yin-2016-5-5 下午3:25:51 
	 * @param _x 基本数据类型参数
	 */
	public static void changeValue(int _x) {
		_x = _x * 2;
	}
	
	/**
	 * <p>方法描述：定义了一个改变String引用类型参数值的函数 </p>
	 * YC.Yin-2016-5-5 下午3:25:51 
	 * @param x 基本数据类型参数
	 */
	public static void changeValue(String _str) {
		_str = "Hello World";
	}
	
	/**
	 * <p>方法描述：定义了一个改变Integer[]数组引用类型参数值的函数 </p>
	 * YC.Yin-2016-5-5 下午3:25:51 
	 * @param x 基本数据类型参数
	 */
	public static void changeValue(Integer[]  _xArray) {
		_xArray[2] = 20;
	}
	
	/**
	 * <p>方法描述：定义了一个改变List<String>集合引用类型参数值的函数 </p>
	 * YC.Yin-2016-5-5 下午3:25:51 
	 * @param x 基本数据类型参数
	 */
	public static void changeValue(List<String>  _strList) {
		_strList.remove(1);
		_strList.add(1,"D");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		println("1、使用基本数据类型验证值传递：");
		int num = 5;
		println("改变前：num = " + num);
		changeValue(num);
		println("改变后：num = " + num);
		
		println("-------------------------------------------------------------------");
		println("2、使用String引用类型验证值传递：");
		String str = "ABC";
		println("改变前：str = " + str);
		changeValue(str);
		println("改变后：str = " + str);
		
		
		println("-------------------------------------------------------------------");
		println("3、使用数组引用类型验证值传递：");
		Integer[] numArr = new Integer[]{0,1,2};
		println("改变前：【numArray[0] = "+ numArr[0] +"】【numArray[1] = "+ numArr[1] +"】【numArray[2] = "+ numArr[2] +"】");
		changeValue(numArr);
		println("改变前：【numArray[0] = "+ numArr[0] +"】【numArray[1] = "+ numArr[1] +"】【numArray[2] = "+ numArr[2] +"】");
		
		
		println("-------------------------------------------------------------------");
		println("4、使用集合引用类型验证值传递：");
		List<String> strList = new ArrayList<String>();
		strList.add("A");
		strList.add("B");
		strList.add("C");
		println("改变前：【strList.get(0) = "+ strList.get(0) +"】【strList.get(1) = "+ strList.get(1) +"】【strList.get(2) = "+ strList.get(2) +"】");
		changeValue(numArr);
		println("改变前：【strList.get(0) = "+ strList.get(0) +"】【strList.get(1) = "+ strList.get(1) +"】【strList.get(2) = "+ strList.get(2) +"】");
	
		println("【小结：\nJava参数，不管是原始类型还是引用类型，传递的都是副本(有另外一种说法是传值，但是说传副本更好理解吧，传值通常是相对传址而言)。" +
				"\n如果参数类型是原始类型，那么传过来的就是这个参数的一个副本，也就是这个原始参数的值，这个跟之前所谈的传值是一样的。如果在函数中改变了副本的 值不会改变原始的值." +
				"\n如果参数类型是引用类型，那么传过来的就是这个引用参数的副本，这个副本存放的是参数的地址。如果在函数中没有改变这个副本的地址，而是改变了地址中的 值，那么在函数内的改变会影响到传入的参数。" +
				"如果在函数中改变了副本的地址，如new一个，那么副本就指向了一个新的地址，此时传入的参数还是指向原来的 地址，所以不会改变参数的值。】");
	}
	
}
