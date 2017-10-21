package cn.itsource.hash;
/*
hashSet只有add和addAll，少了index有关的方法（因为hasSet是无序的）

*/
public class Student {
	private String name;
	private int age;
	
//	提供构造方法
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
//	提供set get方法
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
	
	@Override
	public String toString() {
		return this.name + ": " + this.age;
	}
}
