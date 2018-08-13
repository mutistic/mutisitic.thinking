package com.project.chap02.exercise;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P37_验证类中static（静态）域只有一个实例-测试类</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第2章 一切都是对象</p>
 * <p>练习8：编写一个程序，展示无论你创建了某个特定类的多少个对象，这个类中某个特定的 static域只有一个实例</p>
 * YC.Yin-2016-5-4 下午2:44:45
 */
@SuppressWarnings("static-access")
public class E8_StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E8_StaticClass sc1 = new E8_StaticClass();
		E8_StaticClass sc2 = new E8_StaticClass();
		
		println("1、验证静态成员-基本数据类型(int)的static域只有一个实例：E8_StaticClass.INT_STATIC = "+ E8_StaticClass.INT_STATIC);
		E8_StaticClass.INT_STATIC = 1;
		sc1.INT_STATIC = 2;
		sc2.INT_STATIC = 3;
		if(sc1.INT_STATIC == sc2.INT_STATIC){
			println("验证结果：基本数据类型(int)的static域只有一个实例：");
		} else {
			println("验证结果：基本数据类型(int)的static域并非有一个实例：");
		}
		println("E8_StaticClass.INT_STATIC = "+ E8_StaticClass.INT_STATIC);
		println("sc1.INT_STATIC = "+ sc1.INT_STATIC);
		println("sc2.INT_STATIC = "+ sc2.INT_STATIC);
		
		println("---------------------------------------------------------------------------------");
		println("2、验证静态成员-引用类型(String)的static域只有一个实例：E8_StaticClass.STRING_STATIC = "+ E8_StaticClass.STRING_STATIC);
		E8_StaticClass.STRING_STATIC = "练习1";
		sc1.STRING_STATIC = "练习2";
		sc2.STRING_STATIC = "练习3";
		if(sc1.STRING_STATIC == sc2.STRING_STATIC){ //此时验证引用类型是否是同一个实例，需要用 == 验证，而不是用String的 equals()方法验证。
			println("验证结果：引用类型(String)的static域只有一个实例：");
		} else {
			println("验证结果：引用类型(String)的static域并非有一个实例：");
		}
		println("E8_StaticClass.STRING_STATIC = "+ E8_StaticClass.STRING_STATIC);
		println("sc1.STRING_STATIC = "+ sc1.STRING_STATIC);
		println("sc2.STRING_STATIC = "+ sc2.STRING_STATIC);
		
		println("---------------------------------------------------------------------------------");
		println("3、验证静态成员-类类型(class)的static域只有一个实例：E8_StaticClass.CLASS_STATIC.hashCode() = "+ E8_StaticClass.CLASS_STATIC.hashCode());
		E8_StaticClass.CLASS_STATIC = new E8_StaticClass();
		sc1.CLASS_STATIC = new E8_StaticClass();
		sc2.CLASS_STATIC = new E8_StaticClass();
		if(sc1.CLASS_STATIC == sc2.CLASS_STATIC){
			println("验证结果：类类型(class)的static域只有一个实例：");
		} else {
			println("验证结果：类类型(class)的static域并非有一个实例：");
		}
		println("sc1.CLASS_STATIC.hashCode() = "+ sc1.CLASS_STATIC.hashCode());
		println("sc2.CLASS_STATIC.hashCode() = "+ sc2.CLASS_STATIC.hashCode());
		println("E8_StaticClass.CLASS_STATIC.hashCode() = "+ E8_StaticClass.CLASS_STATIC.hashCode());
		
	}
}
