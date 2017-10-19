package cn.itsource.linkedList;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList countries = new LinkedList();
		countries.add("Japan");
		countries.add("America");
		countries.add("United Kindom");
		countries.add("Vietnam");
		countries.add("Nepal");
		
		countries.addFirst("插入第一位");
		
		Object element = countries.element();
		System.out.println(element);//获得第一位，但原列表不变
		
		System.out.println(countries.peek());
		//peek的作用和element一样，区别是，双端队列是空到时候，peek返回null，element报错
		
		System.out.println(countries);
		
		System.out.println(countries.poll());//取出第一位，原列表size减少，空为null
		System.out.println(countries.poll());
		System.out.println(countries);
		
		System.out.println(countries.pop());//弹出第一位，原列表size减少，空抛异常
		System.out.println(countries);
	}
}
