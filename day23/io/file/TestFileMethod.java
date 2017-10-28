package cn.itsource.io.file;

import java.io.File;

public class TestFileMethod {

	public static void main(String[] args) {
		// Delete方法
		File f1 = new File("F:\\dazigou\\STUDY\\JAVA\\MyCode\\TestIO\\ParentFileCreateByJAVA\\DeleteMethod1");
		f1.delete();//文件、或空文件夹被删除了
		File f2 = new File("F:\\dazigou\\STUDY\\JAVA\\MyCode\\TestIO\\ParentFileCreateByJAVA\\DeleteMethod2");
		f2.delete();//此文件夹下面有内容，所以没有被删除
		
//		
		File f3 = new File("F:\\dazigou\\STUDY\\JAVA\\Day2\\day2");
		System.out.println(f3.exists());//判断是否存在
		
		
		System.out.println(f2.getName());//文件或文件夹名称
		
		System.out.println(f3.getParent());//父目录路径名称字符串。没有的话返回Null
		
		System.out.println(f2.isFile());//是否是文件
		System.out.println(f2.isDirectory());//是否是文件夹
		
		System.out.println(f3.getAbsolutePath());//绝对路径
	}

}
