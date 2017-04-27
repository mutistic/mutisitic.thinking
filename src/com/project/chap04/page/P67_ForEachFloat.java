package com.project.chap04.page;

import java.util.Random;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P67_ForEachFloat示例（使用float数组演示基本的ForEach循环）</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>4.4 Foreach语法 </p>
 * YC.Yin-2016-6-28 上午10:13:53
 */
public class P67_ForEachFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		println("foreach循环输出float数组");
		Random rand = new Random(47);
		
		float fs[] = new float[10];
		for(int i = 0; i < 10; i++) {
			fs[i] = rand.nextFloat();
		}
		
		for(float temp : fs) {
			println(temp);
		}
		
	}

}
