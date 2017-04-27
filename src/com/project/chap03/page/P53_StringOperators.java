package com.project.chap03.page;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P53_StringOperators示例（演示字符串的+ 和 +=）</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>3.13 字符串操作符 + 和 += </p>
 * YC.Yin-2016-6-25 下午3:45:14
 */
public class P53_StringOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0, y = 1, z = 2;
		String s = "x, y, z";
		println(s + x + y + z);
		println(x + " " + s);
		s += "(summed) =";
		println(s + (x + y + z));
		print("" + x);
		
		println("\n【小结：" +
				"\n1、字符串操作符的 + +=、可用于拼接不同的字符串。" +
				"\n2、当字符串+ += 一个数值型数据的话，会将数值型数据转换成字符串。" +
				"\n3、C++支持操作符重载，Java不支持。" +
				"\n4、= 是赋值运算， == 是判等运算。】");
	}

}
