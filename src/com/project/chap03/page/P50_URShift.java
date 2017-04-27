package com.project.chap03.page;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P50_URShift示例（演示无符号右移位&赋值操作符(>>>=)）</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>3.11 移位操作符 </p>
 * YC.Yin-2016-6-20 下午8:09:55
 */
public class P50_URShift {

	public static void main(String[] args) {
		try {
			positiveNumber();
			println("\n");
			negativeNumber();
		} catch (Exception e) {
			printlnMessage("将数字转换成二进制字符串出现异常", e);
		}
		
		println("\n【小结：" +
				"\n1、移位操作符操作的运算对象也是二进制的“位”。只能用于处理整数类型。" +
				"\n2、左移位操作符(<<) 按照操作符右侧指定的位数操作符左边的操作数向左移位(在低位补0)。" +
				"\n3、有符号右移位操作符(>>) 按照操作符右侧指定的位数将操作符左边的操作数向右移动。若符号位正，则在高位插入0，反之插入1。" +
				"\n4、无符号右移位操作符(>>>) 使用零扩展，无论正负，都在高位插入0。" +
				"\n5、对char、byte、short类型数据经行移位处理，则会被转成int类型，并且返回int类型的值，只会用到数值右端的低5位。" +
				"对long类型进行数值处理，返回的结果也是long，只会用到数值有右端的低6位。" +
				"\n6、移位可与等号组合使用(<<=、>>=、>>>=)，操作符左边的值会移动由右边的值指定的位数,再将得到的结果赋值给左边的变量。】");
	}

	private static void positiveNumber () throws Exception{
		println("1、负数-无符号右移位&赋值操作(>>>=)演示：");
		println("1-1、int数据类型：");
		int i = -1;
		printlnSacleBinary("10", 10);
		printlnSacleBinary("i", i);
		i >>>= 10; 
		printlnSacleBinary("i >>>= 10", (i >>>= 10));
	
		println("\n1-2、long数据类型：");
		long l = -1;
		printlnSacleBinary("l", l);
		l >>>= 10; 
		printlnSacleBinary("l >>>= 10", (l >>>= 10));
		
		println("\n1-3、short数据类型：");
		short s = -1;
		printlnSacleBinary("s", s);
		s >>>= 10; 
		printlnSacleBinary("s >>>= 10", (s >>>= 10));
		
		
		println("\n1-4、byte数据类型：");
		byte b = -1;
		printlnSacleBinary("b", s);
		b >>>= 10; 
		printlnSacleBinary("b >>>= 10", (b >>>= 10));
		printlnSacleBinary("b >>> 10", (b >>> 10));
	}
	
	private static void negativeNumber() throws Exception{
		println("2、正数-无符号右移位&赋值操作(>>>=)演示：");
		println("1-1、int数据类型：");
		int i = 1;
		printlnSacleBinary("10", 10);
		printlnSacleBinary("i", i);
		i >>>= 10; 
		printlnSacleBinary("i >>>= 10", (i >>>= 10));
	
		println("\n1-2、long数据类型：");
		long l = 1;
		printlnSacleBinary("l", l);
		l >>>= 10; 
		printlnSacleBinary("l >>>= 10", (l >>>= 10));
		
		println("\n1-3、short数据类型：");
		short s = 1;
		printlnSacleBinary("s", s);
		s >>>= 10; 
		printlnSacleBinary("s >>>= 10", (s >>>= 10));
		
		
		println("\n1-4、byte数据类型：");
		byte b = 1;
		printlnSacleBinary("b", s);
		b >>>= 10; 
		printlnSacleBinary("b >>>= 10", (b >>>= 10));
		printlnSacleBinary("b >>> 10", (b >>> 10));
	}
	
}
