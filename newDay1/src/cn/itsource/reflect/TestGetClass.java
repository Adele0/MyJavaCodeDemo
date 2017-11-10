package cn.itsource.reflect;

import java.util.ArrayList;
import java.util.List;

public class TestGetClass {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		
	System.out.println("------------一、反射获得类型 实例的3种方式----------------");
	
//	1.forName（最常用）
	Class stringClazz = Class.forName("java.lang.String");//包名+类名
	System.out.println(stringClazz);
	
//	2.类型.Class（前两种都是static修饰，能直接调用）
	Class stringClazz1 = String.class;//需要导包，由于是基本类型，所以看不见
	System.out.println(stringClazz  == stringClazz1);//同一种类型不管通过什么方式获得Class的实例都是相等的，一个类型的字节码对象只有一份
	
//	3.getClasses()通过Object中方法来获取
	Class stringClazz2 = "Tamaki".getClass();//字符串对象
	System.out.println(stringClazz1  == stringClazz2);
	
	
	
	System.out.println("------------二、获得接口的Class实例----------------");
	
	Class listClazz = Class.forName("java.util.List");//同 类型的获取一样
	Class listClazz1 = List.class;//方法二需要导包,导包的时候注意区别util和awt
	System.out.println(listClazz  == listClazz1);
	
	List list = new ArrayList();
	Class listClazz2 = list.getClass();
	System.out.println(listClazz2);
	System.out.println(listClazz == listClazz2); //List 和ArrayList不相同
	
	
	
	System.out.println("------------三、获得数组的Class实例----------------");
	
	Class arrayClazz = int[].class;
	int[] array1 = new int[5];
	Class arrayClazz1 = array1.getClass();//一维数组的数据类型是int
	System.out.println(arrayClazz == arrayClazz1);//类型与长度无关
	
	int[][] array2 = new int[3][2];//二维数组数据类型是int[]
	Class arrayClazz2 = array2.getClass();
	System.out.println(arrayClazz1 == arrayClazz2);//int[] 和int[][]类型不同

	
	
	System.out.println("------------四、获得基本类型的Class实例----------------");
	
	Class intClazz = int.class;//基本数据类型（小写，有默认值）几乎都不会用
	Class intClazz1 = Integer.TYPE;//Integer是int的包装类型
	System.out.println(intClazz == intClazz1);//int和integer数据类型相同
	}
} 
