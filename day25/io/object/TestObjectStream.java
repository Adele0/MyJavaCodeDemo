package cn.itsource.io.object;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class TestObjectStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		对象流：ObjectOutputStream---writeObeject(object)输出
//		       		 ObjectInputStream---readObeject(object)输入
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ObjectStream1"));//新建地址
		
		StudentObject s1 = new StudentObject("甲", 56);//新建实例化学生类
		StudentObject s2 = new StudentObject("亿", 92);
		
		oos.writeObject(s1);//将实例化后的对象 输出写到指定地址
		oos.writeObject(s2);//需要对象类实现serializable接口先
		oos.close();
		
//		读取
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ObjectStream1"));
		Object obj = ois.readObject();//读取对象 并 保存
		if (obj instanceof StudentObject) {//若读取的对象是Student对象
			System.out.println( ((StudentObject) obj).getName() + " "+ ((StudentObject) obj).getAge());
		}
		ois.close();
	}
	
}
