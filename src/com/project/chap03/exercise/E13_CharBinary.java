package com.project.chap03.exercise;

import static com.project.common.BaseMainClass.*;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>功能描述：P52_移位操作符（演示char类型数据的二进制形式）</p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>练习13 以二进制形式显示char类型的值。使用多个不同的字符来展示。 </p>
 * YC.Yin-2016-6-16 下午9:28:12
 */
public class E13_CharBinary {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Character[] charArray = (Character[]) getLetterArray(true);
			for(char t : charArray){
				printlnSacleBinary(""+t, t);
			}
		} catch (Exception e) {
			printlnMessage("将数字转换成二进制字符串出现异常", e);
		}
	}
	
	/**
	 * <p>方法描述：获取字母的数组(Character类型)</p>
	 * YC.Yin-2016-6-24 下午4:38:08 
	 * @param _isSpecialChar 标识_是否需要特殊字符:[ \ ] ^ _ `
	 * @return
	 */
	private static Object[] getLetterArray(boolean _isSpecialChar) {

		List<Character> letterList = new ArrayList<Character>();
		println("【A = "+ (int)'A'+"】【Z = "+ (int)'Z'+"】【a = "+ (int)'a'+"】【z = "+ (int)'z'+"】");
		//添加大写字母A-Z
		for(int i = 65; i <= 90; i++){
			letterList.add((char)i);
		}
		
		if(_isSpecialChar){
			//添加特殊字符[ \ ] ^ _ `
			for(int i = 91; i <= 96; i++){
				letterList.add((char)i);
			}
		}
		
		//添加小写字母a-z
		for(int i = 97; i <= 122; i++){
			letterList.add((char)i);
		}
		
		return letterList.toArray();
	}
}
