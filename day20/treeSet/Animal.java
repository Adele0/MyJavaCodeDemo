package cn.itsource.treeSet;
//比较器
public class Animal {
/*1.创建类
 *2.提供AnimalComparator实现Comparator接口，覆写compare方法
 *3.通过treeSet构造方法，把animalComparator传到comparator  */
	
	private String type; 
	private int age; 
	
	public Animal(String type, int age) {
		super();
		this.type = type;
		this.age = age;
	}

	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
		public String toString() {
			return this.type + "已经"+ this.age +"岁了";
		}
}
