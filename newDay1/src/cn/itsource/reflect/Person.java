package cn.itsource.reflect;

public class Person {
	
	private String name;
	private int age;
	
	
//	使用多个构造方法来测试
	public Person(){}
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	private Person(String name){
		this.name = name;
	}
	
	
//	getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
//	自定义私有方法
	private void test() {
		System.out.println("私有test方法");
	}
//	自定义static方法	
	public static void testStatic() {
		System.out.println("static方法");
	}
}
