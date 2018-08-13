package com.project.common;


import java.util.Date;

import com.mutistic.common.enums.DateFromatEnum;
import com.mutistic.common.enums.ScaleEnum;
import com.mutistic.common.utils.DateUtil;
import com.mutistic.common.utils.ValidateUtil;

/**
 * <p>功能描述：Main()可执行类的公共继承类-用于提供部分公共方法 </p> 
 * <p>图书：《Thinking in Java》</p> 
 * <p>章节：第2章 一切都是对象</p>
 * YC.Yin-2016-5-4 下午8:38:30
 */
public class BaseMainClass {
	
	/*********** TODO:print方法  *******************************/
	/** 标识-在控制台打印输出信息是否换行：false_不换行，true_换行**/
	public static boolean IS_NEW_LINE = true;
	
	/**
	 * <p>方法描述：在控制台打印输出信息(换行) </p>
	 * YC.Yin-2016-5-3 上午9:56:42 
	 * @param _msg 需要打印的信息
	 */
	public static void print(Object _msg) {
		System.out.print(_msg);
	}
	
	/**
	 * <p>方法描述：在控制台打印输出信息(不换行)</p>
	 * YC.Yin-2016-5-3 上午9:56:42 
	 * @param _msg 需要打印的信息
	 */
	public static void println(Object _msg) {
		System.out.println(_msg);
	}
	
	/**
	 * <p>方法描述：在控制台打印输入数组信息（不换行）</p> 
	 * @author YC.Yin
	 * @version v1.0 2016-11-15 下午2:59:57
	 * @param _msg
	 */
	public static void println(Object... _msg) {
		if(ValidateUtil.isEmpty(_msg)){
			return;
		}
		
		for(int i = 0, s = _msg.length; i < s; i++) {
			System.out.println((i+1) +"、"+ _msg[i]);
		}
	}
	
	/**
	 * <p>方法描述：输出常用进制转换后的字符串 </p>
	 * YC.Yin-2016-6-16 下午11:18:24 
	 * @param _msg 打印信息
	 * @param _number 源数值(支持int(short\byte)、long、double、float)
	 * @param _scale 转换进制位ID(最多支持二进制_2、八进制_8、十进制_10、十六进制_16)
	 * @return 目标字符串
	 */
	public static void printlnScale(String _msg, Object _number, int _scale) throws Exception {
		
		String printMsg = "【"+ _msg +" = "+ _number +"】";
		
		if(_number != null) {
			if(_number.getClass() == Integer.class || _number.getClass() == Short.class 
					|| _number.getClass() == Byte.class || _number.getClass() == Character.class){
				/** int(short\byte 会先转换成int型)型数据 - 进制转换 **/
				int number = 0;
				String conver = "";
				
				if(_number.getClass() == Integer.class) {
					number = (int)_number;
				} else if(_number.getClass() == Short.class) {
					number = (short)_number;
					conver = "(short)";
				} else if(_number.getClass() == Byte.class) {
					number = (byte)_number;
					conver = "(byte)";
				} else if(_number.getClass() == Character.class) {
					number = (char)_number;
					conver = "(char)";
				}
	
				
				if(_scale == ScaleEnum.Binary.getKey()) 
					printMsg += "【toBinaryString("+conver + _msg +") = "+ Integer.toBinaryString(number) +"】";
				else if(_scale == ScaleEnum.Octal.getKey())   
					printMsg += "【toOctalString("+conver + _msg +") = "+ Integer.toOctalString(number) +"】";
				else if(_scale == ScaleEnum.Decimal.getKey()) 
					printMsg += "【toString("+conver + _msg +") = "+ Integer.toString(number) +"】";
				else if(_scale == ScaleEnum.Hex.getKey()) 
					printMsg += "【toHexString("+conver + _msg +") = "+ Integer.toHexString(number) +"】";
				
			} else if(_number.getClass() == Long.class){
				/** long型数据 - 进制转换 **/
				long number = (long)_number;
	
				if(_scale == ScaleEnum.Binary.getKey()) 
					printMsg += "【toBinaryString("+ _msg +") = "+ Long.toBinaryString(number) +"】";
				else if(_scale == ScaleEnum.Octal.getKey())   
					printMsg += "【toOctalString("+ _msg +") = "+ Long.toOctalString(number) +"】";
				else if(_scale == ScaleEnum.Decimal.getKey()) 
					printMsg += "【toString("+ _msg +") = "+ Long.toString(number) +"】";
				else if(_scale == ScaleEnum.Hex.getKey()) 
					printMsg += "【toHexString("+ _msg +") = "+ Long.toHexString(number) +"】";
				
			} else if(_number.getClass() == Double.class){
				/** double型数据 - 进制转换 **/
				double number = (double)_number;
	
				if(_scale == ScaleEnum.Decimal.getKey()) 
					printMsg += "【toString("+ _msg +") = "+ Double.toString(number) +"】";
				else if(_scale == ScaleEnum.Hex.getKey()) 
					printMsg += "【toHexString("+ _msg +") = "+ Double.toHexString(number) +"】";
				
			} else if(_number.getClass() == Float.class){
				/** float型数据 - 进制转换 **/
				float number = (float)_number;
	
				if(_scale == ScaleEnum.Decimal.getKey()) 
					printMsg += "【toString("+ _msg +") = "+ Float.toString(number) +"】";
				else if(_scale == ScaleEnum.Hex.getKey()) 
					printMsg += "【toHexString("+ _msg +") = "+ Float.toHexString(number) +"】";
				
			}
		}	
	
		if(IS_NEW_LINE) {
			println(printMsg);
		} else {
			print(printMsg);
		}
	}
	
	/**
	 * <p>方法描述：输出二进制转换后的字符串 </p>
	 * YC.Yin-2016-6-16 下午11:18:24 
	 * @param _msg 打印信息
	 * @param _number 源数值(支持int(short\byte)、long、double、float)
	 * @return 目标字符串
	 */
	public static void printlnSacleBinary(String _msg, Object _number) throws Exception {
		printlnScale(_msg, _number, 2);
	}
	
	/**
	 * <p>方法描述：在控制台打印输出异常信息(换行) </p>
	 * YC.Yin-2016-6-20 下午9:00:55 
	 * @param _msg 异常提示信息
	 * @param e 异常父类
	 */
	public static void printlnMessage(Object _msg, Exception e) {
		if(e == null) return;
		
		if(IS_NEW_LINE) {
			println("[ERROR:"+ _msg +"]："+ e.getMessage());
		} else {
			print("[ERROR:"+ _msg +"]："+ e.getMessage());
		}
	}
	
	/*********** TODO:get方法  *******************************/
	/**
	 * <p>方法描述：获取当前时间的毫秒字符串（HH:mm:ss.SSSS</p>
	 * YC.Yin-2016-5-4 下午8:25:29 
	 * @return 目标字符串
	 * @throws Exception
	 */
	public static String getMilliSecond() throws Exception {
		return DateUtil.formatDate(new Date(), DateFromatEnum.MILLI_SECOND);
	}
	
	
	/**
	 * <p>方法描述：验证一个数是否是素数 
	 * 素数[质数]定义: 在一个大于1的自然数中，除了1和此整数自身外，不能被其他自然数整除的数 </p>
	 * YC.Yin-2016-6-27 上午11:07:30 
	 * @param _number 待验证数
	 * @return true_是素数，false_不是素数
	 */
	public static boolean validateIsPrimeNumber(long _number) throws Exception {
		//1不是素数，2是最小的素数，3是第二小的素数
		if(_number <= 3) return _number > 1; 
		
		//是否能被素数2、3整除
		if((_number % 2 == 0) || (_number % 3 == 0)) return false;
		
		//是否能被素数(5n、5n+2)整除，每次循环开始为 (5n)，循环结果为(5n+6) (n >= 1)
		for (int i = 5; i * i <= _number; i += 6) {
	        if (_number % i == 0 || _number % (i + 2) == 0) 
	            return false;
	    }
		
//		验证是否是素数基本思想：
//		1、当 1 < n <= 3的自然数中，2是最小的素数，3是第二小的素数，小于等于1的数则不符合素数的定义，故验证逻辑可为：if(_number <= 3) return _number > 1; 
//		2、对于被除数：其中数值能被素数整除的，则该数值也不是素数。除素数2、3外，其他素数循环规律：该循环以5n开始，每次循环结果为5n+6，被除数为5n、5n+2 (n >= 1)
//		   (例如：5、7、11、13、17、19、23、29、31、37、41、43、47、53、59、61、67、71、73、79、83、89、97)。
		
		return true;
	}
	
	/**
	 * <p>方法描述：生成一个正随机数(根据Math.random)</p>
	 * YC.Yin-2016-6-27 下午1:14:52 
	 * @return 
	 */
	public static long getPositiveRandom() throws Exception {
		//生成一个随机双精度浮点数，范围：[0, 1) 包括0，不包括1 
		double randNumber = Math.random();
		if(randNumber == 0) return 0l;
		
		int length = new String(randNumber+"").length() - 2; //去掉0和.位数
		long longNumber = (long) (randNumber * Math.pow(10, length)); //randNumber乘于10的length次方
		return longNumber;
		
//		生成一个正随机数思想：
//		1、Math.random()用于生成一个范围在[0, 1)的正随机小数。Math.pow(10, length);用于将double转换成相对应长度的long型。该点需考虑Long.MAXgetKey() = 0x7fffffffffffffffL
//		2、可以采用java.util.Random 类的 nextLong(); 方法生成一个随机数，然后使用 Math.abs(long); 取绝对值。 nextInt() 对应 Matb.abs(int);
//		3、可以采用java.util.Random 类的  nextInt(int); 方法生成一个范围在[0, int)的正随机数。
//		4、可以直接使用java.util.Random 的 Random(long); 构造函数，next方法将会生成一个正随机数，此构造函数内部调用 setSeed(long); 方法 。该点多个相同随机种子的Random对象的 next 方法生成的规律是固定的。
//		 eg: Random r1 = new Random(47), r2 = new Random(47); r1.nextInt().intValue() = r2.nextInt().intValue(); is true;
//			 Random r1 = new Random(), r2 = new Random(); r1.nextInt().intValue() = r2.nextInt().intValue(); 99.9% is false;
	}
	
	/**
	 * <p>方法描述：创建一个int数组</p>
	 * YC.Yin-2016-6-28 上午10:44:14 
	 * @param _fromNum 数组循环开始-1
	 * @param _toNum 数组循环结束-1
	 * @param _step 步长（不为0）
	 * @return int数组
	 * @throws Exception
	 */
	public static Integer[] range(int _fromNum, int _toNum, int _step) throws Exception {
		if(_step == 0) return null;
		
		_fromNum--;
		int length = (_toNum-_fromNum)%_step == 0 ? (_toNum-_fromNum)/_step : (_toNum-_fromNum)/_step+1;
		Integer[] is = new Integer[length];
		int index = 0;
		for(int i = _fromNum; i < _toNum; i += _step){
			is[index] = i;
			index++;
		}
		
		return is;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			for(int temp : range(11, 22, -1)){
				println(temp);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
