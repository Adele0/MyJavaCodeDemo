package cn.itsource.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionDemo {

	public static void main(String[] args) {
		// Collections的方法为static，直接调用
		
		ArrayList arrayList = new ArrayList();
		Collections.addAll(arrayList, "吃饭", true,'a',12);//多个元素加到数组里
		System.out.println(arrayList);
		System.out.println("-----------------");
		
		
		ArrayList arrayList1 = new ArrayList();
		Collections.addAll(arrayList1,0,1,2);
//将源数组复制到目标数组，从【0】开始放，目标数组的值被代替。一旦源数组个数大于目标数组，报错
//Collections.addAll(arrayList1,0,1,2,3,4);Source does not fit in dest
		Collections.copy(arrayList, arrayList1);
		System.out.println(arrayList);
		System.out.println("-----------------");
		
		
		ArrayList arrayList2 = new ArrayList();
		for (int i = 0; i < 10; i++) {
			arrayList2.add(i);//循环的将i的值放进数组
		}
		Collections.shuffle(arrayList2);//shuffle方法能在此数组顺序随机
		System.out.println(arrayList2);
	}

}
