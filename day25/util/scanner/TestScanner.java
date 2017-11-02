package cn.itsource.util.scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) throws IOException {
		
		// Scanner(File source) 从文件中扫描
		Scanner scanner = new Scanner(new File("AfterCopyByJava"));
		while (scanner.hasNext()) {
			System.out.println(scanner.next());//全部扫描
		}
//		注意，当文本中有空格时，默认一行结束。即，空格是默认的delimiter
		
		
//		从控制台扫描：Scanner(InputStream source).System.in本身返回的就是一个InputStream类型
		Scanner scanner2 = new Scanner(System.in);
//		System.out.println(scanner2.next());//因为默认空格为delimiter，所以空格之后内容不打印到控制台
//		使用循环
		while (scanner2.hasNext()) {
			String msg = scanner2.next();//2.定义一个结束的标志
			if (msg.equals("88")) {
				System.out.println("886");
				System.exit(0);//退出系统
			}else{
				System.out.println(msg);//1.光是这一句打印的话，将不会有终止
			}
		}
	}

}
