package cn.itsource.arrayList;

import java.util.ArrayList;

public class ArrayListMethodDemo {
/*		最常用的方法：
		add(Object o)
		get(int index)
		indexOf(Object o)元素第一次出现的位置*/
	public static void main(String[] args) {
		ArrayList hotpot =new ArrayList();
		hotpot.add("金针菇");
		hotpot.add("麻辣牛肉");
		hotpot.add("黄喉");
		hotpot.add("羊肉卷");
		hotpot.add("藕");
		hotpot.add("脑花");
		hotpot.add("毛肚");
		hotpot.add("苕粉");
		hotpot.add("麻辣牛肉");
		System.out.println("吃火锅一定要点： " + hotpot);
		
//		void add(int index, E element)将指定元素插入列表的指定位置
		hotpot.add(3, "肥牛");
		System.out.println("吃羊肉卷之前要加上肥牛： " +hotpot);
		
		ArrayList snack = new ArrayList();
		snack.add("锅盔");
		snack.add("冰粉");
		snack.add(2);
		snack.add('份');
		hotpot.addAll(snack);
		System.out.println("2人火锅套餐有： "+ hotpot);
		
		ArrayList others = new ArrayList();
		others.add("可乐");
		others.add("豆奶");
		hotpot.addAll(2, others);
		System.out.println("太辣了不要忘了喝水： "+ hotpot);
		
//		hotpot.clear（）清除所有内容
		System.out.println("麻辣牛肉我点没点？点了true，没点false!!!答案是： "+hotpot.contains("麻辣牛肉"));
		System.out.println("第一个位置放的是什么： "+hotpot.get(1));
		System.out.println("找到第一次麻辣牛肉出现的位置： "+ hotpot.indexOf("麻辣牛肉"));
		System.out.println("找到最后一次麻辣牛肉出现的位置： "+ hotpot.lastIndexOf("麻辣牛肉"));
//		hotpot.remove(int index)   hotpot.remove(Object o)删除某值首次出现（若有，Boolean）
		hotpot.remove(new Integer(2));//当遇到删除数字时，为了不被当做是索引，放到new Integer()
		System.out.println("点多了，去掉2份，保留份："+hotpot);
//		hotpot.remove(Collection c)删除整个列表如snack或者others
		hotpot.set(3,"麻辣牛肉");
		System.out.println("退掉豆奶换成麻辣牛肉" + hotpot);
	}

}
