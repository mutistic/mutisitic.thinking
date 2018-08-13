package com.project.chap04.page;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P67_CommaOperator示例（演示for循环中的逗号操作符）</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>4.3.3 逗号操作符 </p>
 * YC.Yin-2016-6-28 上午10:10:06
 */
public class P67_CommaOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1, j = i+ 10; i< 5; i++, j = i *2) {
			println("【i = "+ i +"】【j = "+ j +"】");
		}
	}

}
