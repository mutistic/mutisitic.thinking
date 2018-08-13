package com.project.chap03.exercise;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P49_按位操作符（演示按位与(&)、或(|)、异位(^)、非(~)运算）</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>练习10 编写一个具有两个常量值的程序，两个具有交易的二进制位1和0，其中最低有效位为0，另一个最低有效位为1.取这两个值，用按位操作符以所有可能的方式结合运算它们，然后用Integer.toBinaryString()显示。 </p>
 * YC.Yin-2016-6-16 下午9:28:12
 */
public class E10_BitWiseOpertor {

	private static final int numA = 0x01010;
	private static final int numB = 0x10101;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		println("1、按位运算-以十进制显示结果：");
		println("【numA = "+ numA +"】【numB = "+ numB +"】");
		println("【numA & numB = "+ getBitWiseOpertor(0, false)+"】");
		println("【numA | numB = "+ getBitWiseOpertor(1, false)+"】");
		println("【numA ^ numB = "+ getBitWiseOpertor(2, false)+"】");
		println("【~numA = "+ getBitWiseOpertor(3, false)+"】");
		println("【~numB = "+ getBitWiseOpertor(4, false)+"】");
		
		println("\n2、按位运算-以二进制显示结果：");
		println("【numA = "+ getBitWiseOpertor(-1, true) +"】【numB = "+ getBitWiseOpertor(-2, true) +"】");
		println("【numA & numB = "+ getBitWiseOpertor(0, true)+"】");
		println("【numA | numB = "+ getBitWiseOpertor(1, true)+"】");
		println("【numA ^ numB = "+ getBitWiseOpertor(2, true)+"】");
		println("【~numA = "+ getBitWiseOpertor(3, true)+"】");
		println("【~numB = "+ getBitWiseOpertor(4, true)+"】");
		
		println("3、按位赋值-以十进制显示结果：");
		int numC = numA;
		println("【numA = "+ numA +"】【numB = "+ numB +"】【numC = "+ numC +"】");
		println("【numC = (numC &= numB) = "+ (numC &= numB) +"】【numC = "+ numC +"】");
		numC = numA;
		println("【numC = (numC ^= numB) = "+ (numC &= numB) +"】");
		numC = numA;
		println("【numC = (numC |= numB) = "+ (numC &= numB) +"】");
	}

	private static String getBitWiseOpertor(int _opertorType, boolean _isBinaryString){
		int result = 0;
		
		/** 普通赋值 **/
		if(_opertorType == -1) result = numA; 
		if(_opertorType == -2) result = numB; 
		
		/** 按位运算 **/
		if(_opertorType == 0) result = numA & numB; //按位 与(&)运算 
		if(_opertorType == 1) result = numA | numB; //按位或(|)运算
		if(_opertorType == 2) result = numA ^ numB; //按位异位(^)运算
		if(_opertorType == 3) result = ~numA ; //按位非(~)运算
		if(_opertorType == 4) result = ~numB ; //按位非(~)运算
		
		
		if(_isBinaryString) return  Integer.toBinaryString(result);
		else return Integer.toString(result);
	}
	
}
