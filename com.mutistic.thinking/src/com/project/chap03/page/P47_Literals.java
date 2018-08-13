package com.project.chap03.page;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P47_Literals示例(演示使用直接常量) </p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>3.9 直接常量 </p>
 * YC.Yin-2016-6-15 下午7:39:03
 */
public class P47_Literals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		println("1、十六进制直接常量示例：");
		int i1 = 0x2f; //小写字母
		println("【i1 = 0x2f】【二进制："+ getToBinaryString(i1) +"】【八进制："+ getToOctalString(i1) +"】" +
				"【十进制："+ getToString(i1) +"】【十六进制："+ getToHexString(i1) +"】"); 
		
		int i2 = 0X2F; //大写字母
		println("【i2 = 0X2F】【二进制："+ getToBinaryString(i2) +"】【八进制："+ getToOctalString(i2) +"】" +
				"【十进制："+ getToString(i2) +"】【十六进制："+ getToHexString(i2) +"】");
		
		char c = 0xffff; //char类型的最大范围：【二进制：1111111111111111】【八进制：0177777】【十进制：65535】【十六进制：0Xffff】 - 2的16次方 - 1
		println("【c = 0xffff】【二进制："+ getToBinaryString(c) +"】【八进制："+ getToOctalString(c) +"】" +
				"【十进制："+ getToString(c) +"】【十六进制："+ getToHexString(c) +"】");
		
		byte b = 0x7f; //byte类型的最大范围：【二进制：1111111】【八进制：0177】【十进制：127】【十六进制：0X7f】 _ 127
		println("【b = 0x7f】【二进制："+ getToBinaryString(b) +"】【八进制："+ getToOctalString(b) +"】" +
				"【十进制："+ getToString(b) +"】【十六进制："+ getToHexString(b) +"】");
		
		short s = 0x7fff; //short类型的最大范围：【二进制：111111111111111】【八进制：077777】【十进制：32767】【十六进制：0X7fff】 _ 2的15次方 -1
		println("【s = 0x7fff】【二进制："+ getToBinaryString(s) +"】【八进制："+ getToOctalString(s) +"】" +
				"【十进制："+ getToString(s) +"】【十六进制："+ getToHexString(s) +"】");
		
		
		println("\n【小结：" +
				"\n1、二进制格式: 前缀：无, 范围：0-1。可以调用封装类的 toBinaryString()方法。" +
				"\n2、八进制格式: 前缀：0, 范围：0-7(对应0-7)。可以调用封装类的 toOctalString()方法。" +
				"\n3、十进制格式: 前缀：无, 范围：0-9(对应0-9)。可以调用封装类的 toString()方法。" +
				"\n4、十六进制格式  前缀：0x, 范围：0-9(对应0-9) a-f(对应10-15、不区分大小写)。可以调用封装类的 toHexString()方法。" +
				"\n5、当char byte short表示的值超过自身范围，则编译器会将值自动转换成int型，并告诉该值要进行窄化处理。如直接声明 short s = 32768; IDE是会提示报错的。】");
	}

	
	private static String getToBinaryString(int _i){
		return Integer.toBinaryString(_i);
	}
	
	private static String getToOctalString(int _i){
		return "0"+Integer.toOctalString(_i);
	}
	
	private static String getToString(int _i){
		return Integer.toString(_i); //new Integer(_i);
	}
	
	private static String getToHexString(int _i){
		return "0X"+Integer.toHexString(_i);
	}
	
}
