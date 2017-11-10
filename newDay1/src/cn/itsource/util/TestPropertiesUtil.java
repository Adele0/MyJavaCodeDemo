package cn.itsource.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestPropertiesUtil {

	private static Properties properties;
	
	static{
		properties = new Properties();//用静态代码块新建Properties
		InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream("jdbc2.properties");
		try {
			properties.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	提供一个get方法来获取静态代码块的内容
	
	public static String getProperties(String key) {//property的内容都是String类型
		return properties.getProperty(key);//通过给定的Key获取对应的值
	}
	
	
	public static void main(String[] args) {
		System.out.println(TestPropertiesUtil.getProperties("username"));
		System.out.println("将获取properties做成一个工具类的作用是，在多个类中调用不用在加载，共用一个");
	}

}
