package com.project.chap02.exercise;

/**
 * <p>功能描述：P37_打印命令行参数数组(args) </p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第2章 一切都是对象</p>
 * <p>练习10 打印出从命令行获得的三个参数。为此，需要确认命令行数组String的下标 </p>
 * YC.Yin-2016-5-4 下午5:11:45
 */
public class E10_CommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("开始打印命令行参数具体值：");
		if(args == null || args.length <= 0 ){
			System.out.println("命令行参数没有值");
		} else {
			for(int i = 0; i < args.length; i++){
				System.out.println("args["+ i +"] = "+ args[i]);
			}
		}
		
		System.out.println("【小结：" +
				"\n1、为使得命令行参数有值，可以使用CMD - java 命令为参数赋值，命令格式为：java E10_CommandLine 参数1 参数2 参数3" +
				"\n2、数组下标是从0开始。】");
	}

}
