package com.project.chap05.page;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P80_PrimitiveOverloading示例（演示 向上转型）</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第5章 初始化与清理 </p>
 * <p>5.2.2 涉及基本类型的重载 </p>
 * @author YC.Yin
 * @version v1.0 2016-11-15 下午2:10:22
 */
public class P80_PrimitiveOverloading {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P80_PrimitiveOverloading load = new P80_PrimitiveOverloading();
		load.testConsoleVal();
		load.testChar();
		load.testByte();
		load.testShort();
		load.testInt();
		load.testLong();
		load.testFloat();
		load.testDouble();
		println("\n\n【小结：");
		println("向上转型: 当传入的数据类型（实际参数类型）小于方法中声明的形式参数类型时，实际数据类型就会被提升。",
				"char类型有所区别，如果无法找接受 char类型的方法时，会直接把 char直接提升至 int型",
				"char > byte > short > int > long > float > double】");
	}
	
	/**
	 * <p>方法描述：查看输入到控制台-调用的重载方法 </p> 
	 * @author YC.Yin
	 * @version v1.0 2016-11-15 下午2:31:40
	 */
	void testConsoleVal() {
		println("\n\n----------------查看输入到控制台-调用的重载方法----------------");
		print(0);
		f1(0); f2(0); f3(0); f4(0); f5(0); f6(0); f7(0);
	}
	
	/**
	 * <p>方法描述：查看 char类型-调用的重载方法 .</p> 
	 * @author YC.Yin
	 * @version v1.0 2016-11-15 下午2:33:15
	 */
	void testChar() {
		println("\n\n----------------查看 char类型-调用的重载方法----------------");
		char x = 'x';
		print(x);
		f1(x); f2(x); f3(x); f4(x); f5(x); f6(x); f7(x);
	}
	
	/**
	 * <p>方法描述：查看 byte类型-调用的重载方法 </p> 
	 * @author YC.Yin
	 * @version v1.0 2016-11-15 下午2:35:09
	 */
	void testByte() {
		println("\n\n----------------查看 byte类型-调用的重载方法----------------");
		byte x = 0;
		print(x);
		f1(x); f2(x); f3(x); f4(x); f5(x); f6(x); f7(x);
	}
	
	/**
	 * <p>方法描述：查看 short类型-调用的重载方法 </p> 
	 * @author YC.Yin
	 * @version v1.0 2016-11-15 下午2:37:24
	 */
	void testShort() {
		println("\n\n----------------查看 short类型-调用的重载方法----------------");
		short x = 0;
		print(x);
		f1(x); f2(x); f3(x); f4(x); f5(x); f6(x); f7(x);
	}
	
	/**
	 * <p>方法描述：查看 int类型-调用的重载方法 </p> 
	 * @author YC.Yin
	 * @version v1.0 2016-11-15 下午2:37:58
	 */
	void testInt() {
		println("\n\n----------------查看 int类型-调用的重载方法----------------");
		int x = 0;
		print(x);
		f1(x); f2(x); f3(x); f4(x); f5(x); f6(x); f7(x);
	}
	
	/**
	 * <p>方法描述：查看 long类型-调用的重载方法 </p> 
	 * @author YC.Yin
	 * @version v1.0 2016-11-15 下午2:38:24
	 */
	void testLong() {
		println("\n\n----------------查看 long类型-调用的重载方法----------------");
		long x = 0;
		print(x);
		f1(x); f2(x); f3(x); f4(x); f5(x); f6(x); f7(x);
	}
	
	/**
	 * <p>方法描述：查看 float类型-调用的重载方法 </p> 
	 * @author YC.Yin
	 * @version v1.0 2016-11-15 下午2:40:56
	 */
	void testFloat() {
		println("\n\n----------------查看 float类型-调用的重载方法----------------");
		float x = 0;
		print(x);
		f1(x); f2(x); f3(x); f4(x); f5(x); f6(x); f7(x);
	}
	
	/**
	 * <p>方法描述：查看 double类型-调用的重载方法 </p> 
	 * @author YC.Yin
	 * @version v1.0 2016-11-15 下午2:41:02
	 */
	void testDouble() {
		println("\n\n----------------查看 double类型-调用的重载方法----------------");
		double x = 0;
		print(x);
		f1(x); f2(x); f3(x); f4(x); f5(x); f6(x); f7(x);
	}
	
	/** char-double的调用方法 **/
	private void f1(char x) {   print("【f1("+ x +"(char)】");   }
	private void f1(byte x) {   print("【f1("+ x +"(byte)】");   }
	private void f1(short x) {  print("【f1("+ x +"(short)】");  }
	private void f1(int x) {    print("【f1("+ x +"(int)】");    }
	private void f1(long x) {   print("【f1("+ x +"(long)】");   }
	private void f1(float x) {  print("【f1("+ x +"(float)】");  }
	private void f1(double x) { print("【f1("+ x +"(double)】"); }
 
	/** byte-double的调用方法 **/
	private void f2(byte x) {   print("【f2("+ x +"(byte)】");   }
	private void f2(short x) {  print("【f2("+ x +"(short)】");  }
	private void f2(int x) {    print("【f2("+ x +"(int)】");    }
	private void f2(long x) {   print("【f2("+ x +"(long)】");   }
	private void f2(float x) {  print("【f2("+ x +"(float)】");  }
	private void f2(double x) { print("【f2("+ x +"(double)】"); }
	 
	/** short-double的调用方法 **/
	private void f3(short x) {  print("【f3("+ x +"(short)】");  }
	private void f3(int x) {    print("【f3("+ x +"(int)】");    }
	private void f3(long x) {   print("【f3("+ x +"(long)】");   }
	private void f3(float x) {  print("【f3("+ x +"(float)】");  }
	private void f3(double x) { print("【f3("+ x +"(double)】"); }
	 
	/** int-double的调用方法 **/
	private void f4(int x) {    print("【f4("+ x +"(int)】");    }
	private void f4(long x) {   print("【f4("+ x +"(long)】");   }
	private void f4(float x) {  print("【f4("+ x +"(float)】");  }
	private void f4(double x) { print("【f4("+ x +"(double)】"); }
	 
	/** long-double的调用方法 **/
	private void f5(long x) {   print("【f5("+ x +"(long)】");   }
	private void f5(float x) {  print("【f5("+ x +"(float)】");  }
	private void f5(double x) { print("【f5("+ x +"(double)】"); }
	 
	/** float-double的调用方法 **/
	private void f6(float x) {  print("【f6("+ x +"(float)】");  }
	private void f6(double x) { print("【f6("+ x +"(double)】"); }
	 
	/** double的调用方法 **/
	private void f7(double x) { print("【f7("+ x +"(double)】"); }
	
}
