package cn.itsource.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class TestGetField {

	public static void main(String[] args) throws Exception {
		
		System.out.println("-----------------5.调用字段-------------------");

		Class<Person> personClazz5 = Person.class;
		Constructor< Person> constructor5 = personClazz5.getConstructor();
		Person person5 = constructor5.newInstance();
		
		System.out.println("反射字段前：" + person5.getName() );
		Field nameField = personClazz5.getDeclaredField("name");//获得字段实例(name是私有的需要declared)
		nameField.setAccessible(true);//访问私有
		nameField.set(person5, "Ouran");//设置新值
		System.out.println("反射字段后：" + person5.getName() );
	}

}
