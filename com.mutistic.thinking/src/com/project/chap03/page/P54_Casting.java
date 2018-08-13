package com.project.chap03.page;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P54_Casting示例（演示类型转换(窄化转换、扩展转换)）</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>3.15 类型转换操作符 </p>
 * YC.Yin-2016-6-25 下午6:43:57
 */
public class P54_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		println("1、扩展转换演示结果：");
		int i = 200;
		long l = (long)i;
		println("【i = "+ i +"】【l = (long)i = "+ l +"】" );
		long l2 = (long)200;
		println("【l2 = (long)200 = "+ l2 +"】" );
		long l3 = 200;
		println("【l3 = 200 = "+ l3 +"】" );
		
		println("\n2、窄化转换演示结果：");
		int i2 = (int)l2;
		println("【i2 = (int)l2 = "+ i2 +"】" );
		
		
		println("\n【小结：" +
				"\n1、在Java中，类型转换时一种比较安全的操作。" +
				"\n2、窄化转换：可能会导致信息的丢失，比如说将Double型强制转换成int型数时，小数位部分信息会丢失。属于强制类型转换。" +
				"\n3、扩展转换：可以不必显示地进行类型转换，新类型肯定能容纳原来类型的信息，不会照成信息丢失。属于自动类型转换。" +
				"\n4、Java允许把任何基本数据类型转换成别的基本数据类型，boolean型除外(不允许任何类型的转换处理)。非继承关系的类数据类型之间是不允许进行类型转换。】");
	}

}
