package com.project.chap02.page;

import java.util.Map;

import com.project.common.BaseMainClass;

/**
 * <p>功能描述：P31_ShowProperties示例（演示System类的方法）</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第2章 一切都是对象</p> 
 * <p>2.7 你的第一个Java程序 - 2 </p> 
 * YC.Yin-2016-4-27 下午7:14:23
 */
public class P31_ShowProperties extends BaseMainClass {

	/** ShowProperties示例- main()方法入口 **/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			println("1、获取系统属性（部分）：");
			println("用户的账户名称："+ System.getProperty("user.name")); //计算机当前登录用户名称
			println("加载库时搜索的路径列表："+ System.getProperty("java.library.path")); //获取环境变量中的path的属性值
	        
			println("\n2、将属性列表输出到System.out流：");
			System.getProperties().list(System.out);
			
			println("\n3、从System.in输入流中读取属性列表：");
//			System.getProperties().load(System.in);
			
			println("\n4、获悉系统环境变量（不能修改）：");
			Map<String, String> envMap = System.getenv();
			for(String keyTemp : envMap.keySet()){
				println("【key："+ keyTemp +"】【value："+ envMap.get(keyTemp) +"】");
			}
			
			println("\n\n【小结："); 
			println("1、System.getProperty()： 无参方法用于返回 java.util.Properties对象，该对象表示了一个持久的属性集。Properties对象方法：" +
					"\n\tgetProperty(String key)：用指定的键在属性列表中搜索属性。" +
					"\n\tlist(java.io.PrintStream out)：将属性列表输出到指定的输出流。\tlist(java.io.PrintWriter out)：将属性列表输出到指定的输出流。" +
					"\n\tload(java.io.InputStream inStream)：从输入流中读取属性列表（键和元素对）。\tload(java.io.Reader reader)：按简单的面向行的格式从输入字符流中读取属性列表（键和元素对）。");
			println("2、System.getProperty(String key)：获取指定键指示的系统属性。");
			println("3、System.getenv()：返回一个不能修改的当前系统环境的字符串映射视图。该环境是一个取决于系统的从名称到值的映射，它从父进程传递给子进程。");
			println("4、System和Properties 相关介绍和方法具体可以参考Java API。】");
		} catch (Exception e) {
			println("[ERROR:执行期间出现 未知异常]");
			e.printStackTrace();
		}
	}
	
}
