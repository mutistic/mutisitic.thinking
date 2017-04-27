package com.project.chap05.page;

/**
 * <p>功能描述：P86_Static应用</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第5章 初始化与清理 </p>
 * <p>5.2 static含义 </p>
 * YC.Yin-2016-11-8 下午1:58:24 
 * @version v1.0
 */
public class StaticApply {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticClass sc = new StaticClass();
		
		System.out.println("1、调用静态/非静态属性：");
		System.out.println("静态属性(直接调用): "+ StaticClass.STATIC_VALUE);
		/**
		 * -引用调用[不建议使用该方式]：The static field StaticClass.STATIC_VALUE should be accessed in a static way
		 */
		System.out.println("静态属性(引用调用): "+ sc.STATIC_VALUE);
		
		/**
		 * System.out.println("非静态属性: "+ NO_STATIC_VALUE); 
		 * 不可以直接调用： Cannot make a static reference to the non-static field NO_STATIC_VALUE
		 */
		System.out.println("非静态属性: "+ 	new StaticClass().NO_STATIC_VALUE); 
		
		System.out.println("\n2、调用静态/非静态方法：");
		System.out.println("静态方法(直接调用)：" + StaticClass.staticMethod());
		
		/**
		 * -引用调用[不建议使用该方式]：The static method staticMethod() from the type StaticClass should be accessed in a static way
		 */
		System.out.println("静态方法(引用调用)：" + sc.staticMethod());
		
		/**
		 * System.out.println("静态方法："+ noStaticMethod()); 
		 * 不可以直接调用： Cannot make a static reference to the non-static method noStaticMethod() from the type StaticApply
		 */
		System.out.println("静态方法："+ new StaticClass().noStaticMethod());
	
	}

}
