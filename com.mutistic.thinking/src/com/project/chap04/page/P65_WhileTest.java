package com.project.chap04.page;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P65_WhileTest示例（演示while循环）</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>4.3 迭代 </p>
 * YC.Yin-2016-6-25 下午11:02:11
 */
public class P65_WhileTest {

	private static boolean condtion() {
		double result = Math.random(); //Math库中的静态方法random()随机生成一个范围在[0,1](包括0，不包括1)的double值
		println("Math.random() = "+ result);
		return result < 0.99;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while(condtion()){
			println("Inside 'While'(执行while循环)[执行次数："+ (i++) +"]\n");
		}
		println("Exited 'while'(退出while循环)");
		
		println("\n【小结：" +
				"\n1、Math.random(): Math库中的静态方法random()随机生成一个范围在[0,1](包括0，不包括1)的double值。" +
				"\n2、while循环(先验证，后循环[与do while循环正好相反])：是先验证布尔值表达式，为true会继续循环，false退出循环。" +
				"\n3、do-while循环：是先循环、后验证。与while的唯一区别是，do-while会先执行循环体，后判断布尔值表达式。】");
	}

}
