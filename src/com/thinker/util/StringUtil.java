package com.thinker.util;

/**
 * <p>功能描述：String工具类 </p> 
 * YC.Yin-2016-10-27 下午11:05:35
 */
public class StringUtil {

	/**
	 * <p>方法描述：验证字符串是否是空或空串 </p>
	 * YC.Yin-2016-4-26 下午8:56:48 
	 * @param _value 待验证字符串
	 * @return true_空或空串,false_非空且非空串
	 * @version v1.0
	 */
	public static boolean isEmpty(String _value)
	{
		return _value == null || _value.trim().isEmpty();
	}
	
}
