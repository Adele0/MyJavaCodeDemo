package cn.itsource.io.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class TestFileInputStream {
	
	public static void main(String[] args) throws IOException {
		// 从指定文件中获得字节
		FileInputStream fis = new FileInputStream("F:\\dazigou\\STUDY\\EclipseWorkspace\\Day23\\TestInputStream");
//		read()方法调用一次只读取一个数字，达到末尾返回-1
		/*System.out.print((char)fis.read());//强制转化char，一次一个
		System.out.print((char)fis.read());一个一个的取太麻烦，使用循环
		System.out.print((char)fis.read());
		System.out.print((char)fis.read());
		System.out.print((char)fis.read());
		System.out.print((char)fis.read());
		System.out.print((char)fis.read());*/
		
		
//		方法1：read(int)
		int len = 0;//2.定义变量存储所有的字节
		while ((len = fis.read()) != -1) {
//			System.out.print((char)fis.read());//1.调用一次来判断再条用再打印，缺少奇数位的字节
			System.out.print((char)len);
		}
		System.out.println("");
		System.out.println("--------------------");
		
		
//		方法2:read(byte[]) 定义了多少byte长度，打印多少次以长度为单位的字节，直到-1 
		FileInputStream fis2 = new FileInputStream("F:\\dazigou\\STUDY\\EclipseWorkspace\\Day23\\TestInputStream2");
		byte[] b = new byte[5];
	/*	fis2.read(b);
		for (byte c : b) {
			System.out.print((char)c);//先转化，再打印，但是一次只能打印5个字节
		}*/
		int len2 = 0;
		while ((len2 = fis2.read(b)) != -1) {
			for (byte c : b) {
				System.out.print((char)c);//123456asdfgasdf 多处四位，因为每次取5个字节，最后不是5的整数，剩余的是前一次的值未覆盖
			}
		}
		System.out.println("");
		System.out.println("--------------------");
		
		
//		通过String构造方法  解决多于字节问题
		FileInputStream fis3 = new FileInputStream("F:\\dazigou\\STUDY\\EclipseWorkspace\\Day23\\TestInputStream3");
		byte[] b2 = new byte[5];
		int len3 = 0;
		while((len3 = fis3.read(b2)) != -1){
			System.out.print(new String(b2,0,len3));
		}
		
		System.out.println("");
		System.out.println("--------------------");
		
//		fis3.read(b2, off, len3)相当于上面的改造方法
		fis3.close();//结束流，如果放在中间，后面的流就不执行。关闭以免占用资源
//		如果有汉字的话，注意：一个汉字占2个字节，如果b每次只取5个字符，最后放的是乱码就会出现乱码
//			解决方案是：1.取值取大些byte【1024】  2.字符流
	}
}
