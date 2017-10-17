package cn.itsource.linkedlist;

public class LinkedListDemo {

	public static void main(String[] args) {
//		创建linkedlist对象。分别测试有赋值，和没有赋值的情况（即，注释掉赋值）
		LinkedList linkedList = new LinkedList();
	/*	linkedList.add("动画片");
		linkedList.add("好好");
		linkedList.add('看');
		linkedList.add(0);*/ 
	
		
		System.out.println(linkedList.getSize());
		System.out.println(linkedList);//没有使用toString的话打印地址
	}

}
