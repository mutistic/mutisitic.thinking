package com.project.chap04.exercise;

import static com.project.common.BaseMainClass.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * <p>功能描述：P67_演示while + if-else逻辑 </p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>练习3：修改练习2，把代码用一个while无限循环包括起来。然后云心它直至用键盘终端其运行（通常是通过按Ctrl-C） </p>
 * YC.Yin-2016-6-26 下午5:42:51
 */
public class E3_WhileRandom {

	/**
	 * <p>方法描述：产生25个int类型随机数。对于每一个随机值，使用if-else语句来将其分类为大于、小于，或等于紧随它而随机生成的值 </p>
	 * YC.Yin-2016-6-26 下午6:08:52
	 */
	private static void forPrintln() {
		Random rand = new Random();
		
		List<Integer> greaterList = new  ArrayList<Integer>(); //大于上一个随机数集合
		List<Integer> lessList = new  ArrayList<Integer>(); //小于上一个随机数集合
		List<Integer> equalList = new  ArrayList<Integer>(); //等于上一个随机数集合
		
		int previous = 0;
		for(int i = 1; i <= 25; i++) {
			int randNumber = rand.nextInt();
			
			if(i != 1){
				if(randNumber > previous){
					greaterList.add(randNumber);
				} else if(randNumber < previous){
					lessList.add(randNumber);
				} else {
					equalList.add(randNumber);
				}
				
			} else {
				previous = randNumber;
			}
			
			println("【previous = "+ previous +"】【randNumber = "+ randNumber +"】【随机生成次数："+ i +"】");
			previous = randNumber;
			i++;
		}
		
		println("\n1、大于上一个随机数集合（"+ greaterList.size() +"）：");
		for(Integer temp : greaterList){
			print(temp +"、");
		}
		
		println("\n\n2、小于上一个随机数集合（"+ lessList.size() +"）：");
		for(Integer temp : lessList){
			print(temp +"、");
		}
		
		println("\n\n3、等于上一个随机数集合（"+ equalList.size() +"）：");
		for(Integer temp : equalList){
			print(temp +"、");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isEach = true;
		int i = 1;
		while(isEach){
			println("\n******************************* 第"+ i +"次while循环开始 *******************************");
			forPrintln();
			println("******************************* 第"+ i +"次while循环结束 *******************************\n");
			i++;
		}
	}
	
}
