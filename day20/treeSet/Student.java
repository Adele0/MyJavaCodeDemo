package cn.itsource.treeSet;
// 自然排序
public class Student implements Comparable{
	private String name;
	private int age;
	
//	提供构造方法
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
//	提供setter getter方法
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

//	类 implements comparable接口，覆写compareTo方法，就能具有比较能力
//	如果返回，则相等
	@Override
	public int compareTo(Object o) {
		Student student = (Student)o;//强制转换object类型
//		比较age
		if (this.age == student.age) {
//			return 0; 
//			仅有这一句代码，Student类的比较仅仅通过age这一项进行的
//			引入String的打印比较。年龄相等时比较年龄才有排序的意义
//			String本身是comparable的实现类，直接调用compareTo，有自己的比较规则
			return this.name.compareTo(student.name);
			
		}else if(this.age > student.age){
			return 1;//仅仅比较age时打印：将数字大的放在右侧
		}else {
			return -1;//仅仅比较age时打印：小的数放左侧
		}
	}
	
//	覆写toString方法
	@Override
	public String toString() {
		return this.name + "要"+ this.age + "块钱的";
	}
	

}
