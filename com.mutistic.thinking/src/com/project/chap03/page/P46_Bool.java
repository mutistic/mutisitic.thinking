package com.project.chap03.page;

import static com.project.common.BaseMainClass.*;

import java.util.Random;

/**
 * <p>功能描述：P45_Bool示例(演示逻辑操作符 与(&&) 或(||) 非(!=)) </p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>3.8 逻辑操作符 </p>
 * YC.Yin-2016-6-6 下午10:48:48
 */
public class P46_Bool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);
		int j = rand.nextInt(100);
		int k = rand.nextInt(100);
		
		println("【 j = "+  j +"】【k = "+ k +"】");
		println("1、演示关系运单符  > < >= <= == !=");
		println("j > k is "+ (j > k));
		println("j < k is "+ (j < k));
		println("j >= k is "+ (j >= k));
		println("j <= k is "+ (j <= k));
		println("j == k is "+ (j == k));
		
		println("\n2、演示逻辑运单符  && || !=");
		println("j < 10 && k < 10 is "+ (j < 10 && k < 10));
		println("j < 10 || k < 10 is "+ (j < 60 || k < 10));
		println("j != k is "+ (j != k));
		
		println("\n【小结：" +
				"\n1、与、或、非逻辑运算符操作只可应用于布尔值。" +
				"\n2、应该使用String值的地方使用了布尔值，布尔值会自动转换成适当的文本。");
	}

}

