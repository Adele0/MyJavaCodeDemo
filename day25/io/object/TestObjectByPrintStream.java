package cn.itsource.io.object;

import java.io.IOException;
import java.io.PrintStream;

public class TestObjectByPrintStream {

	public static void main(String[] args) throws IOException {
		
//		以其他的为例Stream类型为例
		PrintStream ps = new PrintStream("ObjectStream");//新建地址
		
		StudentObject s1 = new StudentObject("甲", 56);//新建实例化学生类
		StudentObject s2 = new StudentObject("亿", 92);
		
		ps.print(s1);//将实例后的学生类的内容 写到指定地址
		ps.print(s2);
		ps.close();
	}

}
