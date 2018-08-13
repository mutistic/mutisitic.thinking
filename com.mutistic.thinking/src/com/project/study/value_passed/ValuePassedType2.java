package com.project.study.value_passed;

import static com.project.common.BaseMainClass.*;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>功能描述：验证Java中只有值传递2 </p> 
 * YC.Yin-2016-5-5 下午3:25:24
 * <p>验证Java中只有值传递方式 </p>
 */
public class ValuePassedType2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		println("1、使用String引用类型验证值传递：");
		String str = "ABC";
		String newStr = str;
		
		str += "DE";
		println("【str = "+ str +"】【newStr = "+ newStr +"】" );
		
		println("-------------------------------------------------------------------");
		println("2、使用集合引用类型验证值(地址)传递：");
		List<String> strList = new ArrayList<String>(); //strList变量指向一个 ArrayList对象，即strList是ArrayList对象的地址，ArrayList对象是strList的引用。
		strList.add("A"); 
		List<String> newList = strList; //此时 =赋值的结果是 将 strList对象的地址 传递给  newList， 两个对象拥有的对象的地址是一致。
		
		println("方式一：");
		strList.add("B"); 
		println("【strList.toString() = "+ strList.toString());
		println("【newList.toString() = "+ newList.toString());
		
		println("方式二：");
		strList = new ArrayList<String>();
		strList.add("C");
		println("【strList.toString() = "+ strList.toString());
		println("【newList.toString() = "+ newList.toString());
	}
	
}
