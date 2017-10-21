package cn.itsource.hash;

public class OverrideStudent {
	private String name;
	private int age;
	
//	提供构造方法
	public OverrideStudent(String name, int age) {
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
	
//	覆写hashCode和equals，这两个都object类中通用的
	
//	如果2个name和age都分别相同，则为同一个，返回true 
	@Override
	public boolean equals(Object obj) {
		// 传入类型为object，强转为OverrideStudent类型
		OverrideStudent os = (OverrideStudent)obj;
		if (os.name.equals(this.name)&& os.age == this.age) {
			return true;
		}else{
			return false;		
		}
	}
	
//	name事string类型，age是int类型；hashCode返回的是int类型。
	@Override
	public int hashCode() {//String类型调用hashCode，本来就是int类型不需要调用
		return age + name.hashCode();//这也有问题，如果name和age两个值相互调换，相加相等会出错
	}
	
	
//	覆写toString
	@Override
	public String toString() {
		return this.name + ": " + this.age;
	}
}