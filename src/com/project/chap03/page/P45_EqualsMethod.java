package com.project.chap03.page;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P45_EqualsMethod示例（演示  == 和 equals() 测试对象、对象引用的等价性） </p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>3.7.1 测试对象的等价性 </p>
 * YC.Yin-2016-6-6 下午10:48:48
 */
public class P45_EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Valuess v1 = new Valuess();
		Valuess v2 = new Valuess();
		v1.i = v2.i = 1;
		println(" v1 == v2 : "+ (v1 == v2));
		println(" v1.equals(v2) : "+ v1.equals(v2));
		println(" v1.i == v2.i : "+ (v1.i == v2.i));
		println(" v1.i.equals(v2.i) : "+ v1.i.equals(v2.i));
	}

}

class Valuess {
	Integer i;
}