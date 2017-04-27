package com.thinker.common;

import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;

import com.project.common.BaseMainClass;
import com.thinker.util.ValidateUtils;

@SuppressWarnings({"unchecked", "rawtypes"})
public class CommonEnums {

	/************** TODO:枚举 **************/
	/**
	 * <p>功能描述：数据类型枚举 </p> 
	 * YC.Yin-2016-4-26 下午10:13:45
	 */
	public enum DataType {
		
		Object(-1), Boolean(0), Character(1), Byte(2), Short(3), 
		Integer(4), Long(5), Double(6), Float(7), 
		String(8), Date(9), BigInteger(10), BigDecimal(11), 
		List(12), ArrayList(13),  LinkedList(14), Vector(15),
		Map(16), HashMap(17), LinkedHashMap(18), 
		Set(19), HashSet(20), LinkedHashSet(21),
		/** 22_java.sql.Date(数据库日期数据类型) **/
		Date_SQL(22), Array(23);
		
		/** 枚举常量绑定值 **/
		public Integer _value;
		/** 枚举常量对象 **/
		public DataType _enums;
		
		DataType(Integer __value){
			this._value = __value;
			this._enums = this;
		}
	}
	
	

	/**
	 * <p>功能描述：将java.util.Calendar的日期静态资源对象转换成CalendarField枚举 </p> 
	 * YC.Yin-2016-4-26 下午8:33:49
	 */
	public enum CalendarField {
		/** 0_Calendar.ERA(纪元) **/
		ERA(Calendar.ERA),
		/** 1_Calendar.YEAR(年) **/
		YEAR(Calendar.YEAR), 
		/** 2_Calendar.MONTH(月份) **/
		MONTH(Calendar.MONTH), 
		/** 5_Calendar.DATE(每月第一天) **/
		DATE(Calendar.DATE),
		/** 6_Calendar.DAY_OF_YEAR(每年第一天) **/
		DAY_OF_YEAR(Calendar.DAY_OF_YEAR),
		/** 7_Calendar.DAY_OF_WEEK(每周第一天) **/
		DAY_OF_WEEK(Calendar.DAY_OF_WEEK),
		/** 10_Calendar.HOUR(小时) **/
		HOUR(Calendar.HOUR), 
		/** 12_Calendar.MINUTE(分钟)  **/
		MINUTE(Calendar.MINUTE), 
		/** 13_Calendar.SECOND(秒) **/
		SECOND(Calendar.SECOND),
		/** 14_Calendar.MILLISECOND(毫秒) **/
		MILLISECOND(Calendar.MILLISECOND);
		
		/** 枚举常量绑定值 **/
		public Integer _value;
		/** 枚举常量对象 **/
		public CalendarField _enums;
		
		CalendarField(Integer __value){
			this._value = __value;
			this._enums = this;
		}
	}
	
	/**
	 * <p>功能描述：进制枚举</p> 
	 * YC.Yin-2016-6-16 下午10:56:30
	 */
	public enum Scale {
		/** 常用进制：二进制、八进制、十进制、十六进制、三十二进制、六十四进制**/
		Binary(2), Octal(8), Decimal(10), Hex(16), Base32(32), Base64(64);
		
		/** 枚举常量绑定值 **/
		public Integer _value;
		/** 枚举常量对象 **/
		public Scale _enums;
		
		Scale(Integer __value){
			this._value = __value;
			this._enums = this;
		}
	}
	
	/**
	 * <p>功能描述：日期格式化枚举 </p> 
	 * YC.Yin-2016-6-21 上午12:04:05
	 */
	public enum DateFromat {	
		//默认格式、带毫秒默认(-)格式
		DEFAULT("yyyy-MM-dd HH:mm:ss"), DEFAULT_DATE("yyyy-MM-dd HH:mm:ss.SSSS"), 
		//简单格式、时间格式、日期格式、毫秒格式
		SIMPLE("yyyy-MM-dd"), DATE("yyyy/MM/dd"), TIME("HH:mm:ss"), MILLI_SECOND("HH:mm:ss.SSSS"),
		//日期格式、带毫秒日期(/)格式
		SLASH("yyyy/MM/dd HH:mm:ss"), SLASH_DATE("yyyy/MM/dd HH:mm:ss.SSSS"),
		//无符号格式、带毫秒无符号格式
		UNSIGNED("yyyyMMddHHmmss"), UNSIGNED_DATE("yyyyMMddHHmmssSSSS");
		
		/** 枚举常量绑定值 **/
		public String _value;
		/** 枚举常量对象 **/
		public DateFromat _enums;
		
		DateFromat(String __value){
			this._value = __value;
			this._enums = this;
		}
	}
	
	/************** TODO:枚举相关操作 **************/
	/**
	 * <p>方法描述：根据值和枚举字段名-获取枚举对象 </p>
	 * YC.Yin-2016-6-23 上午11:07:02 
	 * @param _enumClass 枚举.class
	 * @param _value 值 (枚举变量绑定值/枚举变量名称)
	 * @param _fieldName 字段名(default:[_enums:枚举变量类型][_value:枚举变量绑定值])
	 * @return 枚举常量对象
	 * @throws Exception
	 */
	public static <T> Object getEnumByField(Class<T> _enumClass, Object _value, String _fieldName) throws Exception {
		Map map = converEnumToMap(_enumClass, _fieldName); 
		if(ValidateUtils.isEmpty(map)) return null;
		
		for(Object temp : map.keySet()){
			if(map.get(temp).toString().equals(_value.toString()))  
				return temp; 
			
		}
		return null;
		
//		获取枚举对象思想：
//		1、先将枚举类型通过字段名转换成相对应的Map集合 key为枚举常量对象，_value为枚举常量绑定值（eg:_fieldName = _value） 、 或枚举常量名称(eg:_fieldName = _enums)。
//		2、通过 java.util.Map集合的 keySet() 集合获取 Map中的 key集合，然后通过 equlas(Object) 判断其 toString()结果是否相等，相等则返回key枚举对象。
//		3、则方法可以验证： 枚举常量绑定值_value是否存在，枚举常量名称_value是否存在，枚举中是否声明 _fieldName字段、枚举中是否声明了常量。
	}
	
	/**
	 * <p>方法描述：将枚举转换成Map集合 </p>
	 * YC.Yin-2016-6-23 上午11:14:20 
	 * @param _enumClass 枚举.class
	 * @param _fieldName 字段名(default:[_enums:枚举变量类型(map-key)][_value:枚举变量绑定值(map-value)])
	 * @return 枚举常量LinkedHashMap集合([key:枚举变量对象][value:枚举绑定值/枚举常量名称])
	 * @throws Exception
	 */
	public static <T> Map converEnumToMap(Class<T> _enumClass, String _fieldName) throws Exception {
		//判断参数类型属否是枚举类型
		if(!_enumClass.isEnum() || _enumClass.getEnumConstants() == null) return null; 
		
		Map enumMap = new LinkedHashMap();
		try {
			T isTemp = _enumClass.getEnumConstants()[0];
			boolean isEnum = isTemp.getClass().getField(_fieldName).get(isTemp).getClass().isEnum();

			//Class.getEnumConstants() 获取枚举类的元素数组
			for(T temp : _enumClass.getEnumConstants()){
				Class constantsClass = temp.getClass();
				
				Object name = temp.toString();
					//Class.getDeclaredField(String) 获取类中已声明字段，Class.getDeclaredFields() 获取类中字段数组，Field.get(Object) 获得类中对应字段的值
					Object field =  constantsClass.getField(_fieldName).get(temp);
					if(isEnum) 
						enumMap.put(field, name);
					else 
						enumMap.put(constantsClass.getField("_enums").get(temp), field);  
			}
		} catch (NoSuchFieldException e) {  
			BaseMainClass.printlnMessage(_fieldName+"字段不存在", e); //字段不存在打印异常
			throw new NoSuchFieldException(_fieldName); //字段不存在抛出异常
		} 
		return enumMap;
		
//		转换思想：
//		1、针对枚举类采用的基本思想是通过Class的 java.lang.reflect.Field字段反射机制来，获取枚举类类型，以及枚举常量绑定值或者枚举常量名称。通常反射的效率是不怎么高的。
//		2、_enumClass 为枚举的具体class属性值（等同于 getClass()）。_fieldName 为枚举中声明的字段名，如_value,_enums（由于开发习惯导致声明的字段名称是多样性）。
//		3、可以使用 java.lang.Class<T> 类中的 getType()判断具体数据类型。由于枚举类的特殊性可以用 isEnum() 方法验证是否是枚举类。则 getEnumConstants() 方法则可以获取 java.lang.Class(枚举常量对象)数组。
//		4、枚举常量对象的Class类的 getDeclaredField(String)、getField(String)都可以获取具体字段对象。getDeclaredFields()、getFields()可以获取枚举常量对象中所有的 java.lang.reflect.Field(字段对象)数组。
//			getDeclaredField能够获取所有已声明的字段成员（包括继承和私有） getField只能获取公共字段成员。其中枚举中的字段都有公共的。
//		5、Field(字段对象)的 get(Object) 则可以获取指定对象上此 Field 表示的字段的值。
//		6、Map中的key建议是枚举常量对象，value值可以是枚举常量绑定值(枚举字段：_value)，或枚举常量名称(枚举方法：name()或 toString())； 其中枚举常量对象或枚举常量名称具有唯一性，枚举常量绑定值不具有唯一性。
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
//		Map m = converEnumToMap(DataType.class,"_enums");
//		for(Object t : m.keySet()){
//			System.out.println("【"+ t +"-"+ t.getClass() +"】【"+ m.get(t) +"-"+ m.get(t).getClass() +"】");
//		}
		
//		Object a = getEnumByValue(DataType.class, 2,"_value");
//		System.out.println(a+ "--"+ a.getClass());
		
//		Object b = getEnumBykey(DataType.class, 1, "_value");
//		System.out.println(b+ "--"+ b.getClass());
		
	}
}
