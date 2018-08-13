package com.project.chap04.exercise;

import static com.project.common.BaseMainClass.*;

/**
 * <p>功能描述：P69_演示return关键字 </p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第3章 操作符 </p>
 * <p>练习6：修改IfElse示例的test()方法，让其接受两个额外的参数begin和end，在测试testval时判断是否在[begin,end]范围内。</p>
 * YC.Yin-2016-6-28 下午2:57:35 
 */
public class E6_IfElse2 {
	private static int result = 0;

	/**
	 * <p>方法描述：</p>
	 * YC.Yin-2016-6-28 下午2:57:56 
	 * @param _testval
	 * @param _target
	 * @param _begin
	 * @param _end
	 * @return
	 */
	private static boolean test(int _testval, int _target, int _begin, int _end) {
		if(_testval > _target){
			result = +1;
		} else if(_testval < _target){
			result = -1;
		} else { // else (_testval == _target){ // Match
			result = 0;
		}

		if(_testval >= _begin && _testval <= _end) 
			return true;
		else  
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = test(10, 5, 1, 20);
		println("【_testval > _target : "+ result +"】【_begin <= _testval <= _end : "+ b +"】");

		b = test(5, 10, 1, 9);
		println("【_testval < _target : "+ result +"】【_begin <= _testval <= _end : "+ b +"】");

		b =  test(5, 5, 1, 9);
		println("【_testval = _target : "+ result +"】【_begin <= _testval <= _end : "+ b +"】");

	}
	
}