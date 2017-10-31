package cn.itsource.io.FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutputStream2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fops = new FileOutputStream("TestOutputStream2");
		fops.write(65);//A
		fops.write(66);//B 会添加到该文件内容后面
		FileOutputStream fops1 = new FileOutputStream("TestOutputStream2",false);
		fops1.write(67);//C 会覆盖原来的AB；
		FileOutputStream fops2 = new FileOutputStream("TestOutputStream2",true);
		fops1.write(68);//D 会添加到原文件内容之后；
	}
}
