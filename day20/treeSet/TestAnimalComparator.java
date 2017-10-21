package cn.itsource.treeSet;

import java.util.TreeSet;

public class TestAnimalComparator {

	public static void main(String[] args) {
//		创建treeSet的同时将比较器传入其中
		TreeSet treeSet = new TreeSet(new AnimalComparator());
//		创建动物对象
		Animal a = new Animal("Cock", 1);
		Animal a1 = new Animal("Snake", 2);
		Animal a2 = new Animal("Elephant", 8);
		Animal a3 = new Animal("whale", 40);
		Animal a4 = new Animal("penguin", 5);	
//		将动物对象传入比较器
		treeSet.add(a);//如果只比较年龄，有相同2个时，只返回一个
		treeSet.add(a1);
		treeSet.add(a2);
		treeSet.add(a3);
		treeSet.add(a4);
		
		System.out.println(treeSet.size());
		System.out.println(treeSet);
	}

}
