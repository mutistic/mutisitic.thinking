package com.project.chap02.exercise;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P37_调用类的方法（成员函数） </p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第2章 一切都是对象</p> 
 * <p>练习6：编写一个程序，让它含有本章所定义的storage()方法的代码段，并调用之。（代码段位置：P27）</p> 
 * YC.Yin-2016-4-28 上午10:24:36
 */
public class E6_StorageTest {
	
	public static void main(String[] args){
		E6_StorageTest test = new E6_StorageTest();
		int doubleLength = test.storage("调用类的方法");
		println(doubleLength);
	}

	/**
	 * <p>方法描述：给定字符串，计算其长度 </p>
	 * YC.Yin-2016-4-28 上午10:22:19 
	 * @param s 字符串
	 * @return 长度 * 2
	 */
	public int storage(String s){
		return s.length() * 2;
	}
	
}