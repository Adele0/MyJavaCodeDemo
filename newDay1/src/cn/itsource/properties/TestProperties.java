package cn.itsource.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws IOException {
		
		System.out.println("------------当properties文件在同一项！目！下--------------");
		
		// 1.新建Properties实例对象
		Properties properties = new Properties();
		
//		2.把文件加载到Properties实例对中
		FileInputStream fis = new FileInputStream("jdbc.properties");//2.1输入（读）文件
		properties.load(fis);//load()加载方法
		System.out.println(properties);//注意：properties的固定格式：username=XX无空格无引号

		
		System.out.println("------------当properties文件在同一包！下--------------");
		
//		方式1：类加载器加载资源
		ClassLoader classLoader = TestProperties.class.getClassLoader();
		InputStream is = classLoader.getResourceAsStream("cn/itsource/properties/jdbc1.properties");//使用转义\\也可以
		properties.load(is);
		System.out.println(properties);
		
//		方式2：Class实例获取getResourceAsStream()加载器加载资源
		InputStream is1 = TestProperties.class.getResourceAsStream("jdbc1.properties");
		properties.load(is1);
		System.out.println(properties);//以上两种方式并不常用
		
		
		System.out.println("------------单独建立source folder来统一保存--------------");

//		通过当前线程获得类的加载器
		ClassLoader classLoader2 = Thread.currentThread().getContextClassLoader();
		InputStream is2 = classLoader2.getResourceAsStream("jdbc2.properties");
		properties.load(is2);
		System.out.println(properties);
	}

}
