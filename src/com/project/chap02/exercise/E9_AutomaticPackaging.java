package com.project.chap02.exercise;


import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P37_验证基本数据类型的自动包装功能 </p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第2章 一切都是对象 </p>
 * <p>练习9：编写一个程序，展示自动包装功能对所有的基本类型和包装器类型都起作用 </p>
 * YC.Yin-2016-5-4 下午4:35:36
 */
public class E9_AutomaticPackaging {

	public static void main(String[] args) {
		automaticInPackaging();
		println("----------------------------------------------------");
		automaticOutPackaging();
	}
	
	/**
	 * <p>方法描述：自动装箱 </p>
	 * YC.Yin-2016-5-4 下午4:53:05
	 */
	public static void automaticInPackaging(){
		println("演示基本数据类型的自动包装功能之自动装箱功能：");
		boolean dataBooolean = false; //赋值
		Boolean packBooolean = dataBooolean; //自动装箱（其实： Boolean packBooolean = false; 体现了自动装箱）
		println("1、布尔型：boolean - Boolean：【boolean ： "+ dataBooolean +"】【Boolean ： "+ packBooolean +"】");
		
		char dataChar = 'C';
		Character packChar = dataChar;
		println("2、字符型：char - Character：【char : "+ dataChar +"】【Character : "+ packChar +"】");
		
		byte dataByte = 'b';
		Byte packByte = dataByte;
		println("3、字节型：byte - Byte：【byte = "+ dataByte +"】【Byte = "+ packByte +"】");
		
		short dataShort = 4;
		Short packShort = dataShort;
		println("4、短整型：short - Short：【short : "+ dataShort +"】【Short : "+ packShort +"】");
		
		int dataInt = 5;
		Integer packInteger = dataInt;
		println("5、整型：int - Integer：【int : "+ dataInt +"】【Integer : "+ packInteger +"】");
		
		long dataLong = 6l;
		Long packLong = dataLong;
		println ("6、长整型：long - Long：【long : "+ dataLong +"】【Long : "+ packLong +"】");
		
		float dataFloat = 7f;
		Float packFloat = dataFloat;
		println("7、浮点型：float - Float：【float : "+ dataFloat +"】【Float : "+ packFloat +"】");
		
		double dataDouble = 8d;
		Double packDouble = dataDouble;
		println("8、双精度型：double - Double：【double : "+ dataDouble +"】【Double : "+ packDouble +"】");
	}
	
	/**
	 * <p>方法描述：自动拆箱 </p>
	 * YC.Yin-2016-5-4 下午4:53:05
	 */
	public static void automaticOutPackaging(){
		println("演示基本数据类型的自动包装功能之自动拆箱功能：");
		Boolean packBooolean = new Boolean(true); //赋值（其实： Boolean packBooolean = true; 体现了自动装箱）
		boolean dataBooolean = packBooolean; //自动拆箱 （可写成： boolean dataBooolean = new Boolean(true);）
		println("1、布尔型：boolean - Boolean：【boolean ： "+ dataBooolean +"】【Boolean ： "+ packBooolean +"】");
		
		Character packChar = new Character('C');
		char dataChar = packChar;
		println("2、字符型：char - Character：【char : "+ dataChar +"】【Character : "+ packChar +"】");
		
		Byte packByte = 'b';
		byte dataByte = packByte;
		println("3、字节型：byte - Byte：【byte = "+ dataByte +"】【Byte = "+ packByte +"】");
		
		Short packShort = 4;
		short dataShort = packShort;
		println("4、短整型：short - Short：【short : "+ dataShort +"】【Short : "+ packShort +"】");
		
		Integer packInteger = new Integer(5);
		int dataInt = packInteger;
		println("5、整型：int - Integer：【int : "+ dataInt +"】【Integer : "+ packInteger +"】");
		
		Long packLong = new Long(6);
		long dataLong = packLong;
		println ("6、长整型：long - Long：【long : "+ dataLong +"】【Long : "+ packLong +"】");
		
		Float packFloat = new Float(7);
		float dataFloat = packFloat;
		println("7、浮点型：float - Float：【float : "+ dataFloat +"】【Float : "+ packFloat +"】");
		
		Double packDouble = new Double(8d);
		double dataDouble = packDouble;
		println("8、双精度型：double - Double：【double : "+ dataDouble +"】【Double : "+ packDouble +"】");
	}
	
}
