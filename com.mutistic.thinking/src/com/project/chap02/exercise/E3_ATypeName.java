package com.project.chap02.exercise;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P37_创建新的数据类型-类类型 </p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第2章 一切都是对象</p> 
 * <p>练习3：找出含有ATypeName的代码段，将其改写成完成的程序，然后编译、运行（代码段位置：P25）</p> 
 * YC.Yin-2016-4-27 下午11:11:45
 */
public class E3_ATypeName {

	/** 题目页码 **/
	private String topicPage;
	/** 题目标题 **/
	private String topicTitle;
	
	public String getTopicPage() {
		return topicPage;
	}
	public void setTopicPage(String topicPage) {
		this.topicPage = topicPage;
	}
	public String getTopicTitle() {
		return topicTitle;
	}
	public void setTopicTitle(String topicTitle) {
		this.topicTitle = topicTitle;
	}
	
	/** 创建新的数据类型-类类型 - main()方法入口 **/
	public static void main(String[] args){
		E3_ATypeName topic = new E3_ATypeName();
		topic.setTopicPage("代码页码:第25页。题目页码:第37页");
		topic.setTopicTitle("创建新的数据类型-类。类名称为：ATypeName");
		
		println("topicPage = "+ topic.getTopicPage());
		println("topicTitle = "+ topic.getTopicTitle());
		println("class = "+ topic.getClass());
		
		println("\n\n【小结："); 
		println("1、使用关键字class来创建一个类，即类类型。");
		println("2、topicPage和topicTitle则是声明的字段，也叫成员变量。字段可以是任何类型的对象");
		println("3、getTopicPage()和setTopicTit()则是声明的方法，也叫成员函数。通常get/set方法是字段的get/set构造器。");
	}
	
}
