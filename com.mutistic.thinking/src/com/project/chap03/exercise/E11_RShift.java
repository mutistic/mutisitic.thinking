package com.project.chap03.exercise;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P52_移位操作符（演示有符号右位移操作符）</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>练习11 以一个最高有效位(n-1位)的二进制数字开始，用有符号有位移操作符对其进行右移，直至所有的二进制位都被移除为止，每移一位都要使用Integer.toBinaryString()显示结果。 </p>
 * YC.Yin-2016-6-16 下午9:28:12
 */
public class E11_RShift {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			println("1、演示负数的有符号右位移：");
			rShift(-0x1111111);
			println("\n2、演示正数的有符号右位移：");
			rShift(0x1111111);
		} catch (Exception e) {
			printlnMessage("将数字转换成二进制字符串出现异常", e);
		}
	}
	
	private static void rShift(int i) throws Exception{
		printlnSacleBinary("i", i);	
		for(int j = Integer.toBinaryString(i).length(); j > 0; j--){
			if(i != -1){
				//每次移动1位
				printlnSacleBinary("i >>= 1", i >>= 1);	
			}
		}
	}
}