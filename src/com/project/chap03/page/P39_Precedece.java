package com.project.chap03.page;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P39_Precedec示例（Java操作符优先级）</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符</p>
 * <p>3.3 优先级 </p> 
 * YC.Yin-2016-5-4 下午9:45:40
 */
public class P39_Precedece {

	public static void main(String[] args) {
		int x = 1, y = 2, z = 3;
		println("【x = "+ x +"】【y = "+ y +"】【z = "+ z +"】");
		
		println("1、乘除优先于大于加减：");
		int b = x + y - 2/2 + z; 
		println("x + y - 2/2 + z = "+ b);
		
		println("2、()小括号内部运单优先于乘除，乘除优先于大于加减：");
		int c = x + (y - 2)/(2 + z); 
		println("x + (y - 2)/(2 + z) = "+ c);
		
		println("----------------------------------------------------------------------------------------------------");
		String s1 = "P39_Precedec示例", s2 = "（Java操作符优先级）";
		println("【s1 = "+ s1 +"】【s2 = "+ s2 +"】");
		
		println("3、String字符串的 +（字符串连接）");
		String s3 = s1 + s2;
		println("s1 + s2 = "+ s3);
		
		println("4、字符串的 +=（字符串自连接）");
		s1 += 123;
		println("s1 += s2 = "+ s1);
		
		println("----------------------------------------------------------------------------------------------------");
		println("【小结：" +
				"\n1、优先级：() > 乘除 > 加减。 其中多个同等级的运算，根据先后位置来判断运算的顺序。" +
				"\n2、字符串的 + += 都是拼接字符串。被运算的变量如果不是String类型，则会隐式转换成String类型，引用类型则会调用 toString()方法转换成String字符串。" +
				"\n3、+ - * / % = ：加、减、乘、除、取模、赋值  等运算一般被用于基本数据类型。" +
				"\n4、特殊操作符：++（自加）、--（自减）、+=（自连接）、==（等于）、=（赋值）、!=（不等于）。 】");
	}
	
}
