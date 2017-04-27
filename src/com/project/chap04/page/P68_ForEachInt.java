package com.project.chap04.page;

import static com.project.common.BaseMainClass.*;

import com.project.common.BaseMainClass;

/**
 * <p>功能描述：P68_ForEachInt示例（使用int数组演示基本的ForEach循环）</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p> </p>
 * YC.Yin-2016-6-28 上午10:51:27
 */
public class P68_ForEachInt {

	private static Integer[] range(int _toNum) throws Exception {
		return BaseMainClass.range(1, _toNum, 1);
	}
	
	private static Integer[] range(int _fromNum, int _toNum) throws Exception {
		return BaseMainClass.range(_fromNum, _toNum, 1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			println("foreach输出int数组");
			println("1、使用range(10) 生成0-9的int数组");
			for(int i : range(10))
				print(i +" ");
			
			println("\n\n2、使用range(5, 10) 生成4-9的int数组");
			for(int i : range(5, 10))
				print(i +" ");
			
			println("\n\n3、使用range(5, 20, 3) 生成4-19，步长为3的int数组");
			for(int i : BaseMainClass.range(5, 20, 3))
				print(i +" ");
		} catch (Exception e) {
			printlnMessage("生成int数组出现异常", e);
		}
	}

}
