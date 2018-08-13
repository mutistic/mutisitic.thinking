package com.project.chap04.page;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P69_IfElse2示例（演示return关键字）</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>4.5 return  </p>
 * YC.Yin-2016-6-28 下午2:14:31
 */
public class P69_IfElse2 {

	private static int test(int _tastval, int _target) {
		if(_tastval > _target) 
			return +1;
		else if(_tastval < _target)
			return -1;
		else
			return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		println(test(10, 5));
		println(test(5, 10));
		println(test(5, 5));
	}

}
