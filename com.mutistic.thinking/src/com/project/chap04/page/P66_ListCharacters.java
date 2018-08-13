package com.project.chap04.page;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P66_ListCharacters示例（演示for循环）</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>4.3.2 for循环 </p>
 * YC.Yin-2016-6-25 下午11:23:31
 */
public class P66_ListCharacters {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char c = 0; c < 128; c++) {
			//判断是否是大写字母
			if(Character.isUpperCase(c)){
				println("【value = "+ (int)c +"】【Character = "+ c +"】");
			}
			
			//判断是否是小写字母
			if(Character.isLowerCase(c)){
				println("【value = "+ (int)c +"】【Character = "+ c +"】");
			}
		}
	}

}
