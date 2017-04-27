package com.project.chap03.page;

import java.util.Random;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P51_BitManinpulation示例（演示按位操作符的所有操作符）</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>3.11 移位操作符 </p>
 * YC.Yin-2016-6-21 上午10:46:56
 */
public class P51_BitManinpulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			intBitManinpulation();
			println("\n");
			longBitManinpulation();
		} catch (Exception e) {
			printlnMessage("将数字转换成二进制字符串出现异常", e);
		}
	}
	
	private static void intBitManinpulation() throws Exception{
		println("int型数据演示操作符");
		println("1-1、一元运算符：负号(-)、正号(+)");
		printlnSacleBinary("-1", -1);
		printlnSacleBinary("+1", +1);
		
		println("\n1-2、int型基本数据类型上下限：");
		int maxValue = 2147483647; //Integer.MAX_VALUE = 0x7fffffff;
		int minValue = -2147483648; //Integer.MIN_VALUE = 0x80000000;
		printlnSacleBinary("maxValue", maxValue);
		printlnSacleBinary("minValue", minValue);
		
		println("\n1-3、按位非(~)、取反(-)、按位与(&)、按位或(|)、按位异或(^)");
		Random rand = new Random(47); //为了保证演示结果一致
		int i = rand.nextInt(), j = rand.nextInt();
		printlnSacleBinary("i", i);
		printlnSacleBinary("j", j);
		printlnSacleBinary("~i", ~i); //按位非(~)
		printlnSacleBinary("-i", -i); //取反(-)
		printlnSacleBinary("i & j", (i & j)); //按位与(&)
		printlnSacleBinary("i | j", (i | j)); //按位或(|)
		printlnSacleBinary("i ^ j", (i ^ j)); //按位异或(^)
		
		
		println("\n1-4、左移位(<<)、无符号右移位(>>)、有符号右移位(>>>)");
		printlnSacleBinary("i", i);
		printlnSacleBinary("5", 5);
		printlnSacleBinary("i << 5", (i << 5)); //左移位(<<)
		printlnSacleBinary("i >> 5", (i >> 5)); //右移位(>>)
		printlnSacleBinary("(~i) >> 5", ((~i) >> 5)); //按位非(~)后、有符号右移位(>>)
		printlnSacleBinary("i >>> 5", (i >>> 5)); //有符号右移位(>>>)
		printlnSacleBinary("(~i) >>> 5", ((~i) >>> 5)); //按位非(~)后、有符号右移位(>>>)
	}
	
	private static void longBitManinpulation() throws Exception{
		println("long型数据演示操作符");
		println("2-1、一元运算符：负号(-)、正号(+)");
		printlnSacleBinary("-1L", -1L);
		printlnSacleBinary("+1L", +1L);
		
		println("\n2-2、long型基本数据类型上下限：");
		long maxValue = 0x7fffffffffffffffL; //Long.MAX_VALUE = 0x7fffffffffffffffL;
		long minValue = 0x8000000000000000L; //Integer.MIN_VALUE = 0x8000000000000000L;
		printlnSacleBinary("maxValue", maxValue);
		printlnSacleBinary("minValue", minValue);
		
		println("\n2-3、按位非(~)、取反(-)、按位与(&)、按位或(|)、按位异或(^)");
		Random rand = new Random(47); //为了保证演示结果一致
		long l = rand.nextLong(), m = rand.nextLong();
		printlnSacleBinary("l", l);
		printlnSacleBinary("m", m);
		printlnSacleBinary("~l", ~l); //按位非(~)
		printlnSacleBinary("-l", -l); //取反(-)
		printlnSacleBinary("l & m", (l & m)); //按位与(&)
		printlnSacleBinary("l | m", (l | m)); //按位或(|)
		printlnSacleBinary("l ^ m", (l ^ m)); //按位异或(^)
		
		
		println("\n2-4、左移位(<<)、无符号右移位(>>)、有符号右移位(>>>)");
		printlnSacleBinary("l", l);
		printlnSacleBinary("5", 5);
		printlnSacleBinary("l << 5", (l << 5)); //左移位(<<)
		printlnSacleBinary("l >> 5", (l >> 5)); //右移位(>>)
		printlnSacleBinary("(~l) >> 5", ((~l) >> 5)); //按位非(~)后、有符号右移位(>>)
		printlnSacleBinary("l >>> 5", (l >>> 5)); //有符号右移位(>>>)
		printlnSacleBinary("(~l) >>> 5", ((~l) >>> 5)); //按位非(~)后、有符号右移位(>>>)
	}

}
