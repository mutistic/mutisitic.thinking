package com.project.chap03.page;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P48_Exponents示例（演示指数记数法 e）</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>3.9.1 指数记数法 </p>
 * YC.Yin-2016-6-15 下午9:49:37
 */
public class P48_Exponents {

	/**
	 * <p>方法描述：</p>
	 * YC.Yin-2016-6-15 下午9:44:29 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float expFloat = 1.39e-43f;
		println(expFloat); //1.39 * 10 的 -43次方
		float expFloat2 = 1.39E-43f;
		println(expFloat2);
		
		double expDouble = 47e46d;
		println(expDouble); //47 * 10 的 46次方 = 4.7 * 10 的 47次方
		double expDouble2 = 47e46;
		println(expDouble2);
		
		println("\n【小结：" +
				"\n1、指数记数法 e：在C、C++、JAVA中表示为 10的幂次(不区分大小写)，即1.39e-43 表示为  1.39乘于10的-43次方。" +
				"\n2、在科学与工程领域，e表示自然对数的基数，约等于2.718，在JAVA中 Math.E 给出了更精准的double型的值。Math.E 与 指数记数法 e 的意义是不同的。");
	}

}
