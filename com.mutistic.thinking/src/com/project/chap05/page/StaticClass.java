package com.project.chap05.page;

public class StaticClass {

	public static String STATIC_VALUE = "static静态属性";
	public String NO_STATIC_VALUE = "非static静态属性";
	
	public static String staticMethod() {
		return "static静态方法";
	}
	
	public String noStaticMethod() {
		return "非static静态方法";
	}
}
