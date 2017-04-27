package com.thinker.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.thinker.common.CommonEnums.CalendarField;
import com.thinker.common.CommonEnums.DateFromat;

/**
 * <p>功能描述：日期工具类</p> 
 * YC.Yin-2016-4-26 下午7:19:13
 */
public class DateUtils {
	
	/************** TODO:日期对象加减操作 **************/
	/**
	 * <p>方法描述：增加/减少后的时间(时间类型枚举)</p>
	 * YC.Yin-2016-4-26 下午8:39:39 
	 * @param _date 当前时间
	 * @param _calendar 时间类型枚举
	 * @param _number 正数_增加几个月,负数_减少几个月
	 * @return 操作后的时间
	 * @throws Exception
	 */
	public static Date handleDate(Date _date, CalendarField _calendar, int _number) throws Exception {
		if(_date == null || _calendar == null) return null;
		if(_number == 0) return _date;
		
		Calendar dateTime = Calendar.getInstance();
		dateTime.setTime(_date);
		dateTime.add(_calendar._value, _number);
		return dateTime.getTime();
	}
	
	/**
	 * <p>方法描述：增加/减少后的时间(月份) </p>
	 * YC.Yin-2016-4-26 下午7:20:36 
	 * @param _date 当前时间
	 * @param _month  正数_增加,负数_减少
	 * @return 操作后的时间
	 * @throws Exception
	 */
	public static Date handleMonth(Date _date, int _month) throws Exception {
		if(_date == null) return null;
		if(_month == 0) return _date;
		
		Calendar dateTime = Calendar.getInstance();
		dateTime.setTime(_date);
		dateTime.add(Calendar.MONTH, _month);
		return dateTime.getTime();
	}
	
	/**
	 * <p>方法描述：增加/减少后的时间(天)</p>
	 * YC.Yin-2016-4-26 下午7:29:44 
	 * @param _date 当前时间
	 * @param _day 正数_增加,负数_减少
	 * @return 操作后的时间
	 * @throws Exception
	 */
	public static Date handleDay(Date _date, int _day) throws Exception {
		if(_date == null) return null;
		if(_day == 0) return _date;
		
		Calendar dateTime = Calendar.getInstance();
		dateTime.setTime(_date);
		dateTime.add(Calendar.DATE, _day);
		return dateTime.getTime();
	}
	
	/**
	 * <p>方法描述：增加/减少后的时间(小时)</p>
	 * YC.Yin-2016-4-26 下午7:29:44 
	 * @param _date 当前时间
	 * @param _hour 正数_增加,负数_减少
	 * @return 操作后的时间
	 * @throws Exception
	 */
	public static Date handleHour(Date _date, int _hour) throws Exception {
		if(_date == null) return null;
		if(_hour == 0) return _date;
		
		Calendar dateTime = Calendar.getInstance();
		dateTime.setTime(_date);
		dateTime.add(Calendar.HOUR, _hour);
		return dateTime.getTime();
	}
	
	
	/************** TODO:字符串对象解析为为日期 **************/
	/**
	 * <p>方法描述：解析字符串 (yyyy-MM-dd HH:mm:ss)</p>
	 * YC.Yin-2016-4-26 下午9:17:21 
	 * @param _dateStr 日期字符串
	 * @return 格式化后的日期对象
	 * @throws Exception
	 */
	public static Date parse(String _dateStr) throws Exception {
		if(ValidateUtils.isEmpty(_dateStr)) return null;
		
		return new SimpleDateFormat(DateFromat.DEFAULT._value).parse(_dateStr);
	}
	
	/**
	 * <p>方法描述：解析字符串(format) </p>
	 * YC.Yin-2016-4-26 下午9:52:45 
	 * @param _dateStr 日期字符串
	 * @param _format 格式化模式
	 * @return 格式化后的日期对象
	 * @throws Exception
	 */
	public static Date parseDate(String _dateStr, String _format) throws Exception {
		if(ValidateUtils.isEmpty(_dateStr) || ValidateUtils.isEmpty(_format)) return null;
		
		return new SimpleDateFormat(_format).parse(_dateStr);
	}
	
	/**
	 * <p>方法描述：解析字符串 (yyyy-MM-dd)</p>
	 * YC.Yin-2016-4-26 下午9:17:21 
	 * @param _dateStr 日期字符串
	 * @return 格式化后的日期对象
	 * @throws Exception
	 */
	public static Date parseSimple(String _dateStr) throws Exception {
		if(ValidateUtils.isEmpty(_dateStr)) return null;
		
		return new SimpleDateFormat(DateFromat.SIMPLE._value).parse(_dateStr);
	}
	
	/**
	 * <p>方法描述：解析字符串 (HH:mm:ss)</p>
	 * YC.Yin-2016-4-26 下午9:17:21 
	 * @param _ts 日期字符串
	 * @return 格式化后的日期对象
	 * @throws Exception
	 */
	public static Date parseTime(String _ts) throws Exception {
		if(ValidateUtils.isEmpty(_ts)) return null;
		
		return new SimpleDateFormat(DateFromat.TIME._value).parse(_ts);
	}
	
	/**
	 * <p>方法描述：解析java.sql.Date数据</p>
	 * YC.Yin-2016-6-20 下午11:01:31 
	 * @param _sqlDate
	 * @return
	 * @throws Exception
	 */
	public static Date parseSqlDate(java.sql.Date _sqlDate) throws Exception {
		if(_sqlDate == null) return null;
		
		return new Date(_sqlDate.getTime()); 
	}
	
	
	/************** TODO:日期对象格式化为字符串 **************/
	/**
	 * <p>方法描述：格式化日期对象(yyyy-MM-dd HH:mm:ss)</p>
	 * YC.Yin-2016-4-26 下午8:48:28 
	 * @param _date
	 * @return 格式化后的字符串
	 * @throws Exception
	 */
	public static String format(Date _date) throws Exception {
		if(_date == null) return "";
		
		return new SimpleDateFormat(DateFromat.DEFAULT._value).format(_date);
	}
	
	/**
	 * <p>方法描述：格式化日期对象(format) </p>
	 * YC.Yin-2016-4-26 下午8:48:28 
	 * @param _date 当前时间
	 * @param _format 格式化模式
	 * @return 格式化后的字符串
	 * @throws Exception
	 */
	public static String formatDate(Date _date, String _format) throws Exception {
		if(_date == null || ValidateUtils.isEmpty(_format)) return "";
		
		return new SimpleDateFormat(_format).format(_date);
	}
	
	/**
	 * <p>方法描述：格式化日期对象(yyyy-MM-dd)</p>
	 * YC.Yin-2016-4-26 下午8:48:28 
	 * @param _date
	 * @return 简化格式化后的字符串
	 * @throws Exception
	 */
	public static String formatSimple(Date _date) throws Exception {
		if(_date == null) return "";
		
		return new SimpleDateFormat(DateFromat.SIMPLE._value).format(_date);
	}
	
	/**
	 * <p>方法描述：格式化时间(HH:mm:ss)</p>
	 * YC.Yin-2016-4-26 下午8:48:28 
	 * @param _date
	 * @return 格式化后的字符串
	 * @throws Exception
	 */
	public static String formatTime(Date _date) throws Exception {
		if(_date == null) return "";
		
		return new SimpleDateFormat(DateFromat.TIME._value).format(_date);
	}

	/**
	 * <p>方法描述：格式化日期对象(HH:mm:ss.SSSS</p>
	 * YC.Yin-2016-5-4 下午8:25:29 
	 * @return 目标字符串
	 * @throws Exception
	 */
	public static String formatMilliSecond(Date _date) throws Exception {
		if(_date == null) return "";
		
		return new SimpleDateFormat(DateFromat.MILLI_SECOND._value).format(_date);
	}
	
	
	/************** TODO:组合日期 **************/
	/**
	 * <p>方法描述：拼接日期/时间-组合成为新的日期对象 </p>
	 * YC.Yin-2016-6-20 下午11:13:53 
	 * @param _data 源日期
	 * @param _join 拼接日期
	 * @param _joinType 拼接类型
	 * @return
	 * @throws Exception  
	 */
	public static Date join(Object _data, Object _join, int _joinType) throws Exception {
		/** 日期字符串 **/
		String dateString = null; 
		/** 时间字符串 **/
		String timeString = null;
		
		if(_joinType == 1){
			//拼接时间
			dateString = getDateString(_data, true);
			timeString = getDateString(_join, false);
		} else if(_joinType == 2){
			//拼接日期
			dateString = getDateString(_join, true);
			timeString = getDateString(_data, false);
		}
		
		if(ValidateUtils.isEmpty(dateString) || ValidateUtils.isEmpty(timeString)){
			return null;
		} else {
			return parse(dateString + " " + timeString);
		}
	}
	
	/**
	 * <p>方法描述：拼接时间(HH:mm:ss)</p>
	 * YC.Yin-2016-4-26 下午9:50:32 
	 * @param _date 日期对象
	 * @param _time 时间对象（暂支持java.util.Date、java.sql.Date、String类型数据）
	 * @return 组合后的日期对象
	 * @throws Exception
	 */
	public static Date joinTime(Date _date, Object _time) throws Exception {
		if(_date == null) return null;
		
		String joinDate =  formatSimple(_date) + " " + getDateString(_time, false);
		if(ValidateUtils.isEmpty(joinDate)) {
			 return null;
		} else {
			return parseTime(joinDate);
		}
	}
	
	/**
	 * <p>方法描述：拼接日期(yyyy-MM-dd)</p>
	 * YC.Yin-2016-4-26 下午9:50:32 
	 * @param _time 时间对象
	 * @param _date 日期对象（暂支持java.util.Date、java.sql.Date、String类型数据）
	 * @return 组合后的日期对象
	 * @throws Exception
	 */
	public static Date joinDate(Date _time, Object _date) throws Exception {
		if(_time == null) return null;
		
		String joinDate =  getDateString(_date, true) + " " +formatSimple(_time);
		if(ValidateUtils.isEmpty(joinDate)) {
			 return null;
		} else {
			return parseTime(joinDate);
		}
	}
	
	/**
	 * <p>方法描述：获取简化后的 日期/时间 字符串</p>
	 * YC.Yin-2016-6-20 下午11:44:38 
	 * @param _data 源数据
	 * @param _isFormatDate 标识_是否格式化日期(true_yyyy-MM-dd, false_HH:mm:ss)
	 * @return 简化后的字符串
	 * @throws Exception
	 */
	public static String getDateString(Object _data, boolean _isFormatDate) throws Exception {
		if(_data == null) return null;
		
		String dateString = null;
		if(_data.getClass() == Date.class){
			dateString = _isFormatDate ? formatSimple((Date)_data) : formatTime((Date)_data);
		} else if(_data.getClass() == java.sql.Date.class){
			
			Date date = parseSqlDate((java.sql.Date)_data);
			dateString = _isFormatDate ? formatSimple(date) : formatTime(date);
		} else if(_data.getClass() == String.class){
			
			//字符串支持 yyyy-MM-dd 、 HH:mm:ss 、yyyy-MM-dd HH:mm:ss
			dateString = (String) _data;
			if(dateString.length() == 19){
				dateString = _isFormatDate ? dateString.split(" ")[0] : dateString.split(" ")[1];
			} else if(dateString.length() != 8 || dateString.length() != 10){
				dateString = null;
			}
		}
		return dateString;
	}
	
	/************** TODO:获取时间差 **************/
	/**
	 * <p>方法描述：计算时间差(Calendar_支持天、小时、秒)</p>
	 * YC.Yin-2016-6-21 上午9:53:25 
	 * @param _date1  被减数
	 * @param _date2 减数 
	 * @return 相差值（保留小数位）
	 */
	public static double interval(Date _date1, Date _date2, CalendarField _calendar) {
		if (null == _date1 || null == _date2) return -1;
		
		long intevalMilli = _date2.getTime() - _date1.getTime();
		if(_calendar == CalendarField.DATE){
			//计算相差天数 
			return intevalMilli / (24 * 60 * 60 * 1000);
		} else if(_calendar == CalendarField.HOUR){
			//计算相差小时数 
			return intevalMilli / (60 * 60 * 1000);
		} else if(_calendar == CalendarField.SECOND){
			//计算相差秒数 
			return intevalMilli / 1000;
		}
		
		return -1;
	}
	 
	/**
	 * <p>方法描述：计算时间差(天)</p>
	 * YC.Yin-2016-6-21 上午9:53:25 
	 * @param _date1  被减数
	 * @param _date2 减数
	 * @return 相差天数
	 */
	public static int intervalDays(Date _date1, Date _date2) {
		if (null == _date1 || null == _date2) return -1;
		
		return (int) intervalMilliSeconds(_date1, _date2) / (24 * 60 * 60 * 1000);
	}
	
	/**
	 * <p>方法描述：计算时间差(毫秒)</p>
	 * YC.Yin-2016-6-21 上午9:53:25 
	 * @param _date1  被减数
	 * @param _date2 减数
	 * @return 相差毫秒数
	 */
	public static long intervalMilliSeconds(Date date1, Date date2) {
		if (null == date1 || null == date2) return -1;
		
		return date2.getTime() - date1.getTime();
	}
	

}
