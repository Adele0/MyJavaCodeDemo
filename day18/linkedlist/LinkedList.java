package cn.itsource.linkedlist;

public class LinkedList {
//		基于链表结构
	Node first;//存放第一个对象

	int size;//定义一个size来保存数量
	
//	提供add方法
	public void add(Object object) {
		Node node = new Node(object);//将object封装到Node类
//		把node放到具体的位置
		if (first == null) {
			first = node;//如果是第一位，就放到first，
		}else {
//			不是第一个就放到最后一个节点的next-最后一个next应该为null
			Node temp = first;//循环查找最后next是否为空前。先定义temp
			while (temp.next != null) {
				temp = temp.next;//如果第一个值的next不为空，移动到下一个
			}
			temp.next = node;//找到最后一个next为空，将node放进去
		}
		size++;//每次添加后数量增大
	}
	
	
//	提供一个提供size的方法
	public int getSize() {
		return size;
	}
	
	
//	覆写toString方法，因为不是数组，只能用拼接的方法
	@Override
		public String toString() {
			//定义stringbuffer
			StringBuffer sBuffer = new StringBuffer();
			sBuffer.append("[");
			Node temp = first;//定义temp取第一个内容
			
			if (first == null) {
				sBuffer.append("]");
				return sBuffer.toString();
			}
			
			if (first != null) {
				if (first.next == null) {
					sBuffer.append(first.object);//只有一个值
				}else {
					sBuffer.append(first.object).append(",");
				}
			}
	
			while (temp.next != null) {
				temp = temp.next;
				if (temp.next == null) {
					sBuffer.append(temp.object);
				}else {
					sBuffer.append(temp.object).append(",");
				}
			}
			sBuffer.append("]");
			
			return sBuffer.toString();
		}
	
	
//	定义一个Node内部类，将数据封装起来
	private class Node{
		Object object;//存放值
		Node next;//存放下一个对象地址
		//提供构造方法，使得object能放到node里进行封装
		public Node(Object object){
			this.object = object;
		}
	}
}
