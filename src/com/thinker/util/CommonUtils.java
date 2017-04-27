package com.thinker.util;

import java.util.Arrays;
import java.util.List;

import com.thinker.common.CommonEnums.Scale;

/**
 * <p>功能描述：公共工具类 </p> 
 * YC.Yin-2016-6-15 下午12:50:19
 */
@SuppressWarnings({"rawtypes"})
public class CommonUtils {

	/************** TODO:集合数组转换方法 **************/
	/**
	 * <p>方法描述：将集合转换成字符串 </p>
	 * YC.Yin-2016-6-15 下午1:09:41 
	 * @param _strList 源集合
	 * @param _splitStr 追加字符串，[默认值：, ]
	 * @return 目标字符串
	 * @throws Exception
	 */
	public static String getStringByList(List _strList, String _splitStr)
	{
		if(_strList == null) {
			return null;
		}

		if(ValidateUtils.isEmpty(_splitStr)){
			_splitStr = ",";
		}

		StringBuffer strBuffer = new StringBuffer();
		for(Object objTemp : _strList){
			strBuffer.append(objTemp + _splitStr);
		}
		strBuffer.deleteCharAt(strBuffer.length() - 1);

		return strBuffer.toString();
	}

	/**
	 * <p>方法描述：将数组转换成ArraryList集合 </p>
	 * YC.Yin-2016-6-15 下午1:01:27 
	 * @param _objArray 源数组
	 * @return ArrayList目标集合
	 * @throws Exception
	 */
	public static Object[] getArrayByList(List _objArray) 
	{
		if(_objArray == null) {
			return null;
		}

		return _objArray.toArray();
	}

	/**
	 * <p>方法描述：将数组转换成ArraryList集合 </p>
	 * YC.Yin-2016-6-15 下午1:01:27 
	 * @param _objArray 源数组
	 * @return ArrayList目标集合
	 * @throws Exception
	 */
	public static List ArraysAsList(Object[] _objArray) 
	{
		if(_objArray == null) {
			return null;
		}

		return Arrays.asList(_objArray);
	}

	/**
	 * <p>方法描述：将集合转换成字符串 </p>
	 * YC.Yin-2016-6-15 下午1:09:41 
	 * @param _strArray 源数组
	 * @return 目标字符串-逗号, 隔开
	 * @throws Exception
	 */
	public static String ArraysToString(Object[] _strArray)
	{
		if(_strArray == null) {
			return null;
		}

		return Arrays.toString(_strArray);
	}

	/**
	 * <p>方法描述：将集合转换成字符串 </p>
	 * YC.Yin-2016-6-15 下午1:09:41 
	 * @param _strArray 源数组
	 * @param _isReplace 将[或]为替换空字符串
	 * @return 目标字符串-逗号, 隔开
	 * @throws Exception
	 */
	public static String ArraysToString(Object[] _strArray, boolean _isReplace)
	{
		if(_strArray == null) {
			return null;
		}

		String strObject = Arrays.toString(_strArray);
		// 将[或]为替换空字符串
		if(_isReplace){
			strObject = strObject.replace("[", "");
			strObject = strObject.replace("]", "");
		}
		return Arrays.toString(_strArray);
	}

	/************** TODO:进制转换方法 **************/
	/**
	 * <p>方法描述：输出常用进制转换后的字符串 </p>
	 * YC.Yin-2016-6-16 下午11:18:24 
	 * @param _number 源数值(支持int(short\byte)、long、double、float)
	 * @param _scale 转换进制位枚举(最多支持二进制_Scale.Binary、八进制_Scale.Octal、十进制_Scale.Decimal、十六进制_Scale.Hex)
	 * @return 目标字符串
	 * @throws Exception
	 */
	public static String getScaleString(Object _number, Scale _scale) throws Exception{
		if(_number == null || _scale == null) return null;

		if(_number.getClass() == Integer.class || _number.getClass() == Short.class ||
				_number.getClass() == Byte.class){
			/** int(short\byte 会先转换成int型)型数据 - 进制转换 **/
			int number = 0;

			if(_number.getClass() == Integer.class) number = (int)_number;
			else if(_number.getClass() == Short.class) number = (short)_number;
			else if(_number.getClass() == Byte.class) number = (byte)_number;
			else if(_number.getClass() == Character.class) number = (char)_number;

			if(_scale == Scale.Binary) return Integer.toBinaryString(number);
			if(_scale == Scale.Octal)  return Integer.toOctalString(number);
			if(_scale == Scale.Decimal) return Integer.toString(number);
			if(_scale == Scale.Hex) return Integer.toHexString(number);
		} else if(_number.getClass() == Long.class){
			/** long型数据 - 进制转换 **/
			long number = (long)_number;

			if(_scale == Scale.Binary) return Long.toBinaryString(number);
			if(_scale == Scale.Octal)  return Long.toOctalString(number);
			if(_scale == Scale.Decimal) return Long.toString(number);
			if(_scale == Scale.Hex) return Long.toHexString(number);
		} else if(_number.getClass() == Double.class){
			/** double型数据 - 进制转换 **/
			double number = (double)_number;

			if(_scale == Scale.Decimal) return Double.toString(number);
			if(_scale == Scale.Hex) return Double.toHexString(number);
		} else if(_number.getClass() == Float.class){
			/** float型数据 - 进制转换 **/
			float number = (float)_number;

			if(_scale == Scale.Decimal) return Float.toString(number);
			if(_scale == Scale.Hex) return Float.toHexString(number);
		}
		return null;
	}

	public static List getPageList(List _dataList, int _pageIndex, int _pageSize) throws Exception{
		if(ValidateUtils.isEmpty(_dataList)) return null;

		int fromIndex = (_pageIndex - 1) * _pageSize;  
		int toIndex = (_pageIndex * _pageSize >= _dataList.size()) ? _dataList.size() : (_pageIndex * _pageSize);

		/** subList: [fromIndex, toIndex)返回列表中指定的 fromIndex（包括 ）和 toIndex（不包括）之间的部分视图。（如果 fromIndex 和 toIndex 相等，则返回的列表为空） **/
		return _dataList.subList(fromIndex, toIndex); //范围[fromIndex, toIndex);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
