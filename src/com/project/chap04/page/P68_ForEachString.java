package com.project.chap04.page;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P68_ForEachString示例（使用String数组演示基本的ForEach循环）</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>4.4 Foreach语法 </p>
 * YC.Yin-2016-6-28 上午10:18:06
 */
public class P68_ForEachString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//java.lang.String的 toCharArray()方法 可以将字符串转换成char数组
		println("将String转换成char数组，然后使用foreach循环输出");
		for(char temp : "An African Swallow ".toCharArray()) {
			print("【"+ temp +"】");
		}
	}

}
