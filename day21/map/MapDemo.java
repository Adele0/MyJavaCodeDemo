package cn.itsource.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// 创建Map，Map作为接口，不能new出来只能通过实现类（目前学习HashMap和treeMap）实现
		Map hmap = new HashMap();
		hmap.put("98522475", "000000");//value（值）可以重复
		hmap.put("98522476", "000000");
		hmap.put("98522476", "000001");//key（键）不重复，当key相同时，后一个value取代前一个
		hmap.put("98522477", "000000");//打印没有顺序
		System.out.println("5个值其中2相等打印出来："+ hmap);
		System.out.println("-------------------------------");
		
		
		System.out.println("是否包含传入的key："+ hmap.containsKey("98522476"));//有此key返回true
		System.out.println("是否包含传入的value："+ hmap.containsValue("000000"));//由此value返回true
		System.out.println("通过传入的key打印其对应的value："+hmap.get("98522476"));//得到此key的value
//		一个Key键对应一个值，一个值value可能对应多个键key。所以没有get（value）这个方法
		System.out.println("-------------------------------");
		
		
		Map hmap1 = new HashMap();
		hmap.put("1654775", "007800");
		hmap.put("1654777", "000140");
		hmap.putAll(hmap1);//不能将整句打印，先将hmap1装到hmap里，打印hmap
		System.out.println("添加putAll后得到：" + hmap);
		System.out.println("-------------------------------");
		
		
		hmap.remove("98522476");
		System.out.println("remove特定key后得到：" + hmap);
		System.out.println("-------------------------------");
	}

}
