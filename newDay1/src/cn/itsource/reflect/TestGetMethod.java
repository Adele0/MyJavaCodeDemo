package cn.itsource.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TestGetMethod {

	public static void main(String[] args) throws Exception {
		
		System.out.println("-----------------4.获得反射Method-------------------");
		
		Class<Person> personClazz = Person.class;// 1.获得Class实例
		Constructor<Person> constructors4 = personClazz.getConstructor(String.class, int.class);//2.获取反射构造器
		Person person4 = constructors4.newInstance("Tamaki",18);//3.创建对象
		
//4.1获取反射Method
//		Method[] methods = personClazz.getMethods();//获取包括父类的方法
		/*
		Method[] methods = personClazz.getDeclaredMethods();//获取当前类的方法（效率更高）
		for (Method method : methods) {
			System.out.println(method);
		}
		*/
		
//4.2获取具体的反射Method		
	Method setNameMethod  =  personClazz.getDeclaredMethod("setName", String.class);//构造器一个，方法可多个，具体方法用方法名及类
	System.out.println(setNameMethod);
	
//4.3.1调用Method	
	System.out.println("反射调用前：" + person4.getName());
	setNameMethod.invoke(person4, "Me");
	System.out.println("反射调用后：" + person4.getName());
	
//4.3.2调用私有Method
	Method testMethod = personClazz.getDeclaredMethod("test");
	testMethod.setAccessible(true);
	testMethod.invoke(person4);
	
//4.3.3调用static成员Method	
	Method testStaticMethod = personClazz.getDeclaredMethod("testStatic");
	testStaticMethod.invoke(null);//静态调用不需要对象
	}

}
