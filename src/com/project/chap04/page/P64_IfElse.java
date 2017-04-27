package com.project.chap04.page;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P64_IfElse示例（演示基本的if-else控制执行流程）</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>4.2 if-else </p>
 * YC.Yin-2016-6-25 下午11:02:45
 */
public class P64_IfElse {

	private static int result = 0;
	
	/**
	 * <p>方法描述：测试基本的if-else判断 </p>
	 * YC.Yin-2016-6-25 下午11:07:40 
	 * @param _testval 
	 * @param _target
	 */
	private static void test(int _testval, int _target) {
		if(_testval > _target){
			result = +1;
		} else if(_testval < _target){
			result = -1;
		} else { // else (_testval == _target){ // Match
			result = 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(10, 5);
		println("if(10 > 5) : "+ result);
		
		test(5, 10);
		println("else if(10 < 5) : "+ result);
		
		test(5, 5);
		println("else : "+ result);
	}

}
