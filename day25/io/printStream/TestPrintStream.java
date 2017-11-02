package cn.itsource.io.printStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class TestPrintStream {

	public static void main(String[] args) throws IOException {
		// 打印流
		PrintStream ps = new PrintStream ("PrintStream");
		ps.println("a打印流的print（）方法或者println方法（）可以添加任何类型，输出到文件");
		ps.println(true);
		ps.println('Z');
		ps.println(new Object());
		ps.println(96);
		
		ps.close();
		
		System.out.println("System.out.就是标准的输出流到控制台");
		
		InputStream inputStream = System.in;//标准的输入流，从控制台输入，
		System.out.println((char)inputStream.read());//在控制台输入什么就打印什么,转化成char
		
		System.err.println("标准的错误流打印的颜色默认红色");//要执行到这一步需要先执行标准输入流
		
//		重定向---将标准输出  输出到文件而非控制台
		System.setOut(new PrintStream("PrintStream1"));
		System.out.println("先新建打印流位置，使用setOut重定向，之后再输出到文件的内容");
		System.out.println("这就是想要输入的内容");
		
//		重定向---将标准输入  从文件读取而非控制台
		System.setIn(new FileInputStream("PrintStream1"));
		InputStream iStream = System.in;
		System.out.println((char)iStream.read());
	}

}
