//: com.project.chap02.exercise/HelloDate.java
package com.project.chap02.exercise;

import static com.project.common.BaseMainClass.*;

import java.util.Date;

import com.thinker.util.DateUtils;


/**
 * <p>功能描述：P37_演示JavaDoc文档 </p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第2章 一切都是对象</p> 
 * <p>练习12：找出带有简单注释文档的HelloDate.java示例。对该文件执行javadoc，然后通过Web浏览器观看运行结果</p> 
 * YC.Yin-2016-4-26 下午7:00:57
 */
public class E12_HelloDateJavaDoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.print("Hello，当前时间是：");
			System.out.print(DateUtils.format(new Date()));
			
			println("\n\n【小结：" +
					"\n生成JavaDoc文档步骤：" +
					"\n1、选中项目或文件。右键选择Export。选择 Java - javadoc。" +
					"\n2、Javadoc相关先择项：" +
					"\nJavadoc command: 选择javadoc.exe执行文件的所在位置。" +
					"\nSelet types for which Javadoc will be generated: 选择需要生成javadoc的项目。" +
					"\nCreated Javadoc for members with visibility: 选择创建Javadoc的成员可见性，privarte表示生成全部类和成员。建议选择private。" +
					"\nUse standard doclet：选择创建Javadoc的位置。" +
					"\n3、选择Finish即可生成对应的Javadoc，默认查看界面是 index.html。】");
		} catch (Exception e) {
			println("[ERROR:打印本机当前时间出现 未知异常]");
			e.printStackTrace();//输出错误日志到控制台
		}
	}

} /* Output: (55% match)
Hello.it's 2016-05-04 20:23:00
*///:~
