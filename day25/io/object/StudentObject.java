package cn.itsource.io.object;

import java.io.Serializable;

public class StudentObject implements Serializable{
	
	private String name;
	private int age;
	
//	构造方法
	public StudentObject(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	

//	getter setter
	public String getName() {return name;}

	public void setName(String name) {this.name = name;}

	public int getAge() {return age;}

	public void setAge(int age) {this.age = age;}

	
	@Override//覆写toString
	public String toString() {
		return "StudentObject [name=" + name + ", age=" + age + "]";
	}
}
