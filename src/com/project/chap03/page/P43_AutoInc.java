package com.project.chap03.page;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P43_AutoInc示例（演示自增、自减操作符）</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>3.6 自动递增和递减 </p>
 * YC.Yin-2016-6-6 下午10:48:48
 */
public class P43_AutoInc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		println("【i = "+ i +"】");
		println("【i = "+ i +"】【++i = "+ ++i +"】");
		println("【i = "+ i +"】【i++ = "+ i++ +"】");
		
		println("【i = "+ i +"】【--i = "+ --i +"】");
		println("【i = "+ i +"】【i-- = "+ i-- +"】");
		println("【i = "+ i +"】");
	}

}
