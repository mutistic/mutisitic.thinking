package com.project.chap03.page;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P63_Overflow示例（演示int值溢出）</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>3.17 操作符小结 </p>
 * YC.Yin-2016-6-25 下午8:35:31
 */
public class P63_Overflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int big = Integer.MAX_VALUE;
		println("Integer.MAX_VALUE = " + big);
		int bigger = big * 4;
		println("Integer.MAX_VALUE * 4 = " + bigger); //值溢出
	}

}
