package com.project.chap03.exercise;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P49_演示指数记数法</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>练习9 分别显示用float和double指数记数法所能表示的最大和最小的数字 </p>
 * YC.Yin-2016-6-20 下午7:37:55
 */
public class E9_Exponents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float maxFloat = 3.4028235e+38f; //Float.MAX_VALUE
		float minFloat = 1.4e-45f;  //Float.MIN_VALUE
		println("Float.MAX_VALUE : "+ maxFloat);
		println("Float.MIN_VALUE : "+ minFloat);
		
		double maxDouble = 1.7976931348623157e+308; //Double.MAX_VALUE
		double minDouble = 4.9e-324; //
		println("Double.MAX_VALUE : "+ maxDouble);
		println("Double.MIN_VALUE : "+ minDouble);
	}

}
