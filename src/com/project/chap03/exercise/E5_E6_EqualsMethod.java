package com.project.chap03.exercise;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P45_演示  == 和 equals() 测试对象、对象引用的等价性  </p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>练习5: 创建一个名为Dog的类，它包含两个String域：name和says。在 mian()方法中，创建两个 Dog对象，一个名为 spot(它的叫声为 Ruff)，另一个名为 scruffy(它的叫声为 Wurf)。然后显示他们的名字</p>
 * <p>练习6: 在练习5的基础上，创建一个新的Dog索引，并为其赋值为 spot对象。测试用 == 和 equals() 方法来比较所有引用的结果</p>
 * YC.Yin-2016-6-6 下午10:48:48
 */
public class E5_E6_EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog spotDog = new Dog();
		spotDog.name = "spot";
		spotDog.says = "Ruff";
		
		Dog scruffyDog = new Dog();
		scruffyDog.name = "scruffy";
		scruffyDog.says = "Wurf";
		
		println("练习5：显示spotDog 和 scruffyDog 的名字：");
		println("spot-dog：name = "+ spotDog.name +"\tsays ="+ spotDog.says);
		println("scruffyDog-dog：name = "+ scruffyDog.name +"\tsays ="+ scruffyDog.says);
		
		
		println("\n练习6：测试用 == 和 equals() 方法来比较所有引用的结果：");
		Dog newDog = spotDog;
		println("newDog == spotDog : "+ (newDog == spotDog));
		println("newDog.equals(spotDog) : "+ newDog.equals(spotDog));
		println("newDog.name == spotDog.name : "+ (newDog.name == spotDog.name));
		println("newDog.says.equals(spotDog.says) : "+ newDog.says.equals(spotDog.says));
		
	}

}

class Dog {
	String name;
	String says;
}