package com.project.chap03.exercise;

import static com.project.common.BaseMainClass.*;

import java.util.Random;

/**
 * <p>功能描述：P48_演示十六进制、八进制直接常量</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>练习8_展示用十六进制和八进制计数法来操作long值，用二进制（Long.toBinaryString()）来显示结果 </p>
 * YC.Yin-2016-6-15 下午9:31:15
 */
public class E8_Literals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		long ls = rand.nextLong();
		println("二进制 toBinaryString ："+ Long.toBinaryString(ls));
		println("十进制 toString ："+ ls); //Long.toString(ls);
		println("八进制 toOctalString ：0"+ Long.toOctalString(ls));
		println("十六进制 toHexString ：0x"+ Long.toHexString(ls));
	}
	
}
