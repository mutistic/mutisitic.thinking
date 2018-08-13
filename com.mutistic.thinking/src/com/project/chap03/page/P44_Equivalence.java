package com.project.chap03.page;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P44_Equivalence（演示== 和 equals 的等价性判断） </p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>3.7.1 测试对象的等价性 </p>
 * YC.Yin-2016-6-6 下午10:48:48
 */
public class P44_Equivalence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n1 = new Integer(47);
		Integer n2 = new Integer(47);
		println("n1 == n2 : "+ (n1 == n2));
		println("n1 != n2 : "+ (n1 != n2));
		println("n1.equals(n2) : "+ n1.equals(n2));
	}

}
