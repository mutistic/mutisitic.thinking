package com.project.study.page_algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>功能描述：List集合分页算法演示</p> 
 * <p>集合分页算法 </p>
 * YC.Yin-2016-6-27 下午4:43:04
 */
@SuppressWarnings("rawtypes")
public class ListPageAlgorithm {

	/**
	 * <p>方法描述：获取分页后的List集合 </p>
	 * YC.Yin-2016-6-27 下午5:03:19 
	 * @param _list 源集合
	 * @param _pageIndex 当前页数
	 * @param _pageSize 每页显示内容数
	 * @return 分页后的List集合
	 * @throws Exception
	 */
	private static List<Integer> getPageList(List<Integer> _list, int _pageIndex, int _pageSize) 
	{
		if(_list == null || _list.size() == 0 || _pageIndex < 1) return null;

		int fromIndex = (_pageIndex - 1) * _pageSize;  
		int toIndex = (_pageIndex * _pageSize >= _list.size()) ? _list.size() : (_pageIndex * _pageSize);
		
		/** subList(): 返回列表中指定的 fromIndex（包括 ）和 toIndex（不包括）之间[formIndex, toIndex)的部分视图。（如果 fromIndex 和 toIndex 相等，则返回的列表为空） **/
		return _list.subList(fromIndex, toIndex); //范围[fromIndex, toIndex);
	}
	
	@SuppressWarnings("unused")
	private static List getPageObjList(List _list, int _pageIndex, int _pageSize)
	{
		List subList = new ArrayList();
		if(_list == null || _list.size() == 0 || _pageSize <= 0) 
			return subList;
		for(int i = 0, s = _list.size();  i < s; i += _pageSize)
		{
			int toIndex = i + 900 > s ? i+900 : s; 
			List subjList = _list.subList(i, toIndex);
		}
		return subList;
	}
	
	/**
	 * <p>方法描述：创建一个List集合 </p>
	 * YC.Yin-2016-6-27 下午4:45:49 
	 * @param _size 集合个数
	 * @return Integer型数据的ArrayList集合
	 */
	private static List<Integer> getAllList(int _size) 
	{
		List<Integer> allList = new ArrayList<Integer>();
		for(int i = 0; i <= _size; i++)
			allList.add(i);
		return allList;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try {
			List<Integer> intList = getAllList(100);
			
			int pageSize = 2;
			int pageCountIndex = (intList.size() % pageSize == 0) ? (intList.size() / pageSize) : (intList.size() / pageSize + 1); 
			for(int i = 1; i <= pageCountIndex; i++){
				List<Integer> pageList = getPageList(intList, i, pageSize); //CommonUtil.getPageList(intList, i, pageSize); 
				
				for(Integer temp : pageList){
					System.out.print(temp +"、");
				}
				System.out.println("\n【 第"+ i +"页数据结束(size = "+ pageList.size() +")】\n");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}