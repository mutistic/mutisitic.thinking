package com.project.chap04.exercise;

import static com.project.common.BaseMainClass.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * <p>功能描述：P66_演示for循环 + if-else逻辑 </p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>练习2：写一个程序，产生25个int类型随机数。对于每一个随机值，使用if-else语句来将其分类为大于、小于，或等于紧随它而随机生成的值 </p>
 * YC.Yin-2016-6-26 下午5:42:51
 */
public class E2_ForRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

}
