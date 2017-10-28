package cn.itsource.io.filefilter;

import java.io.File;
import java.io.FilenameFilter;

public class TestFileFilter {

	public static void main(String[] args) {
		// 调用filefilter方法
		File f = new File("F:\\dazigou\\STUDY\\JAVA\\MyCode\\TestIO\\TestFileFilter");
//		File有自己的Filenamefilter方法
		
		String suffix = "txt";//需要过滤出来的文件后缀
		
		FilenameFilter filter = new FileFilterDemo(suffix);//将suffix传到覆写后的FilenameFilter中
//			一旦调用需要覆写accept方法
			
		String[] name = f.list(filter);//使用list将过滤后得到的文件装到字符串数组中
		for (String string : name) {
			System.out.println(string);//循环打印每个元素
		}
	}	
}
