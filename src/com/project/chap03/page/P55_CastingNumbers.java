package com.project.chap03.page;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P55_CastingNumbers示例（演示窄化转换时信息丢失情况）</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>3.15.1 截尾和舍入 </p>
 * YC.Yin-2016-6-25 下午7:01:58
 */
public class P55_CastingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		println("1、窄化转换-演示截尾（浮点型窄化转换成整数型，小数点后的数据会丢失）：");
		double above = 1.7, below = 0.4;
		println("(int)above = "+ (int)above);
		println("(int)below = "+ (int)below);
		
		float fabove = 1.7f, fbelow = 0.4f;
		println("(int)fabove = "+ (int)fabove);
		println("(int)fbelow = "+ (int)fbelow);
		
		println("\n【小结：" +
				"\n在执行窄化转换时，必须注意截尾与舍入问题。窄化转换时只会截尾不会四舍五入。如果需要舍入的话可以是用java.lang.Math的round()方法。】");
	}

}
