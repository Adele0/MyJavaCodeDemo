package cn.itsource.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;
import java.util.jar.Pack200;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		// 把账号密码存到properties了
		Properties p = new Properties();
		p.setProperty("jiji0", "mima1");
		p.setProperty("jiji1", "mima2");
		p.setProperty("jiji2", "mima3");
		
//		把properties放到磁盘，void list（PrintStream out）将属性列表输出到指定
//		PrintStream(String fileName)用构造方法创建文件名且不带自动行刷新的新打印流
		p.list(new PrintStream("username.txt"));//抛出文件找不到异常
//		该文件最终保存到了Day21项目里了
		
//		读取properties的数据--》使用void load（inputStream）
		Properties p1 = new Properties();
		p1.load(new FileInputStream(""));//文件地址，双斜杠，进行转义
//		System.out.println(p1.getProperty("")); 通过key 取出值
	}

}
