package com.project.chap02.exercise;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P37_Java编程语言约定之演示驼峰命名法  </p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第2章 一切都是对象</p>
 * <p>练习11：将AllTheColorsOfTheRainbow这个示例改写成一个程序，然后编译、运行（代码段位置：P36）</p>
 * YC.Yin-2016-5-4 下午7:50:33
 */
public class E11_AllTheColorsOfTheRainbow {

	/** 一个整数代表颜色 **/
	int anIntegerRepresentingColors;
	
	/**
	 * <p>方法描述：改变色调的颜色</p>
	 * YC.Yin-2016-5-4 下午8:02:39 
	 * @param newHue 新色调
	 */
	void changeTheHueOfTheColor(int newHue){
		this.anIntegerRepresentingColors = newHue;
	}
	
	public static void main(String[] args) {
		E11_AllTheColorsOfTheRainbow colors = new E11_AllTheColorsOfTheRainbow();
		println("原来的颜色：anIntegerRepresentingColors = "+ colors.anIntegerRepresentingColors);
		colors.changeTheHueOfTheColor(1);
		println("改变后的颜色：anIntegerRepresentingColors = "+ colors.anIntegerRepresentingColors);
		
		
	}
	
}
