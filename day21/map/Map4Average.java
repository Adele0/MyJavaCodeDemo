package cn.itsource.map;

import java.util.Collection;
import java.util.HashMap;

public class Map4Average {

	public static void main(String[] args) {
		// 利用map创建姓名 年龄，并计算平均年龄
		HashMap hm = new HashMap();
		hm.put("Bai", 17);
		hm.put("BLinai", 20);
		hm.put("Lin", 27);
		hm.put("Adele", 19);
		hm.put("Jiji", 21);
		
		Collection values = hm.values();//调用values取出所有的值
		int sum = 0;//定义变量装值之和
		for (Object object : values) {
			sum += (int)object;
		}
		
		System.out.println(sum/hm.size());
	}

}
