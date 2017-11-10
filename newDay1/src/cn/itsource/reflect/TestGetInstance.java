package cn.itsource.reflect;

import java.lang.reflect.Constructor;

public class TestGetInstance {

	public static void main(String[] args) throws Exception {
		
		System.out.println("-----------------1.获得构造器-------------------");
		
		Class<Person> personClazz = Person.class;// 获得Class实例
		
		/*	
	 	Constructor[] constructors = personClazz.getConstructors();//获得反射构造器实例得到的是public
		for (Constructor constructor : constructors) {//去掉Person类的public
			System.out.println(constructor);//所以打印不出来非public
		}
		*/
		
		/*
		Constructor[] constructors1 = personClazz.getDeclaredConstructors();
		for (Constructor constructor1 : constructors1) {
			System.out.println(constructor1);//getDeclared（）即使去掉Person类的public也能得到
		}
		*/
		
//		person 有多个构造方法，拿到指定的构造方法
		Constructor<Person> constructors2 = personClazz.getConstructor(String.class, int.class);
		System.out.println(constructors2);
		
		Constructor<Person>  constructors3 = personClazz.getDeclaredConstructor(String.class);
		System.out.println(constructors3);//私有的只能通过getDeclaredConstrutor
		
		
		
		System.out.println("-----------------2.创建对象的方法-------------------");
		
//		1.通过Class实例方法newInstance 创建对象
		Person person = (Person) personClazz.newInstance();
		System.out.println(person);
		
//		2.通过反射构造器，创建对象（用的最多的方式）
		Person person2 = constructors2.newInstance("Tamaki", 18);//调用有参数的构造器，需要传参
		System.out.println(person2);
//		person.getAge() getName setAge() 都是可以用的
		
		System.out.println("-----------------3.创建对象让权限失效-------------------");
		
//		constructors3.newInstance("Tamaki"); 报错“can not access a member of class with modifiers "private"”
		constructors3.setAccessible(true);
		Person person3 = constructors3.newInstance("Tamaki"); 
		System.out.println(person3);
	}
}
