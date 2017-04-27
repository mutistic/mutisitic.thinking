package com.project.chap03.page;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P52_TernaryIfElse示例（演示三元运算符和if-else）</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>3.12 三元操作符、if-else </p>
 * YC.Yin-2016-6-25 下午3:43:59
 */
public class P52_TernaryIfElse {

	/**
	 * <p>方法描述：演示三元运算符 </p>
	 * YC.Yin-2016-6-25 下午3:43:28 
	 * @param _i 
	 * @return
	 */
	private static int ternary(int _i) {
		return (_i < 10) ? _i * 100 : _i;
	}
	
	/**
	 * <p>方法描述：演示if-else</p>
	 * YC.Yin-2016-6-25 下午3:43:48 
	 * @param _i
	 * @return
	 */
	private static int standardIfElse(int _i) {
		if(_i < 10){
			return _i * 100;
		} else {
			return _i;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		println("1、三元运算符-运算结果：");
		println(ternary(9));
		println(ternary(10));
		println(standardIfElse(9));
		println(standardIfElse(10));
		
		println("\n【小结：" +
				"\n1、三元运算符形式：boolean-exp ? value0 : value1 。" +
				"\n2、如果boolean-exp布尔表达式的结果为true，就计算value0，反之计算value1。这一点与if-else逻辑基本一致。" +
				"\n3、简化了 if-else的代码格式，但是可读性比较差。】");
	}

}
