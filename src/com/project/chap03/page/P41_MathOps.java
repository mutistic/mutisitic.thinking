package com.project.chap03.page;

import static com.project.common.BaseMainClass.*;
import java.util.Random;

/**
 * <p>功能描述：P41_MathcOps示例（使用随机数演示加、减、乘、除、取模(余) 运算操作符）</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>3.5 算数操作符 </p>
 * YC.Yin-2016-6-2 下午10:11:42
 */
public class P41_MathOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		println("1、使用固定种子随机数演示整数型数据的加、减、乘、除、取模：");
		Random rand = new Random(47); //使用单个 long 种子设置此随机数生成器的种子
		int a, b, c;
		a = rand.nextInt(100) + 1; //返回下一个伪随机数，它是此随机数生成器的序列中均匀分布的 int 值
		println("a = "+ a);
		b = rand.nextInt(100) + 1;
		println("b = "+ b);
		
		c = a + b;
		println("a + b = "+ c);
		c = a -b;
		println("a - b = "+ c);
		c = a * b;
		println("a * b = "+ c);
		c = a / b;
		println("a / b = "+ c);
		c = a % b;
		println("a % b = "+ c);
		
		println("\n2、使用随机种子数演示浮点型数据的自加、自减、自乘、自除、自取模：");
		Random randNew = new Random(); //创建一个新的随机数生成器。此构造方法将随机数生成器的种子设置为某个值，该值与此构造方法的所有其他调用所用的值完全不同、即值根据当前计算机时间随机取值。 
		float h, i;
		h = randNew.nextFloat();
		println("h = "+ h);
		i = randNew.nextFloat();
		println("i = "+ i);
		
		h += i;
		println("h += i ="+ h);
		h -= i;
		println("h += i ="+ h);
		h *= i;
		println("h *= i ="+ h);
		h /= i;
		println("h /= i ="+ h);
		h %= i;
		println("h %= i ="+ h);
		
		println("\n【小结：" +
				"\n1、整数除法运算结果会直接去掉小数位，而不是四舍五入地结果，如 ：2 /3  = "+ (2 / 3) + "。" +
				"\n2、java.util.Random 用于生成随机数，如果是调用无参构造函数，那么Java会将当前时间作为随机数生成器种子。】");
	}

}
