package com.project.chap02.page;

import java.util.Date;

import com.project.common.BaseMainClass;
import com.thinker.util.DateUtils;


/**
 * <p>功能描述：P30_HelloDate示例（打印本机当前时间） </p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第2章 一切都是对象</p> 
 * <p>2.7 你的第一个Java程序 - 1 </p> 
 * YC.Yin-2016-4-26 下午7:00:57
 */
public class P30_HelloDate extends BaseMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.print("Hello，当前时间是：");
			System.out.print(DateUtils.format(new Date()));
			
			println("\n\n【小结：" +
					"\n1、CMD相关命令：" +
					"\n\t生成class文件： javac T2_HelloDate.java" +
					"\n\t执行class文件：java T2_HelloDate】");
		} catch (Exception e) {
			println("[ERROR:打印本机当前时间出现 未知异常]");
			e.printStackTrace();//输出错误日志到控制台
		}
	}

}
