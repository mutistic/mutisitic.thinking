package com.project.chap03.exercise;

import static com.project.common.BaseMainClass.*;
import java.util.Random;

/**
 * <p>功能描述：P43_演示基本数据类型的计算 </p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>练习4：编写一个计算速度的程序，它所使用的距离和时间都是常量 </p>
 * YC.Yin-2016-6-2 下午10:11:42
 */
public class E4_CalcVelocity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		println("1、使常量计算速度(计算公式：v=s/t)：");
		int s1 =  100;
		int t1 =  10;
		println("距离： s = "+ s1);
		println("时间 ： t = "+ t1);
		println("速度 ： v = s / t = "+ s1 +" / "+ t1 +" = "+ (s1 / t1));
		
		
		println("\n2、使用随机数计算速度(计算公式：v=s/t)：");
		Random randFloat = new Random(); 
		float s2 = randFloat.nextFloat();
		float t2 = randFloat.nextFloat();
		println("距离： s = "+ s2);
		println("时间 ： t = "+ t2);
		println("速度 ： v = s / t = "+ s2 +" / "+ t2 +" = "+ (s2 / t2));
	}

}
