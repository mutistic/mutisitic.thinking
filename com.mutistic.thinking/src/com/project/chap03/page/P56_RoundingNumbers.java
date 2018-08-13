package com.project.chap03.page;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P56_RoundingNumbers示例（演示Math的round()的舍入情况） </p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p> </p>
 * YC.Yin-2016-6-25 下午7:57:58
 */
public class P56_RoundingNumbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		println("1、演示舍入（java.lang.Math的round()舍入）：");
		double above = 1.7, below = 0.4;
		println("Math.round(above) = "+ Math.round(above));
		println("Math.round(below) = "+ Math.round(below));
		
		float fabove = 1.7f, fbelow = 0.4f;
		println("Math.round(fabove) = "+ Math.round(fabove));
		println("Math.round(fbelow) = "+ Math.round(fbelow));
	}

}
