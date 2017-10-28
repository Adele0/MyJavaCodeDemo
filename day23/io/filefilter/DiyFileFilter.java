package cn.itsource.io.filefilter;

import java.io.File;
import java.util.ArrayList;

public class DiyFileFilter {

	public static void main(String[] args) {
// 过滤此路径 F:\dazigou\STUDY\JAVA\MyCode\TestIO\TestFileFilter的txt
		File[]	txtFiles = getFileBySuffix(new File("F:\\dazigou\\STUDY\\JAVA\\MyCode\\TestIO\\TestFileFilter"), "txt");
//		直接打印会出现地址
		for (File file : txtFiles) {//将得到的数组存起来，循环的打印每一个人元素
			System.out.println(file);
		}
	}
	
	
//	通过传入的文件\文件夹，和文件的后缀名，返回一个File数组
	public static File[] getFileBySuffix(File f, String suffix) {
//			4.用集合将遍历的文件存起来
			ArrayList<File> al = new ArrayList<File>();
			if (f.isDirectory()) {//1.判断是否是文件夹（目录）
				File[] files = f.listFiles();//2.是，将文件夹下面文件罗列
				for (File file : files) {//3.遍历，文件夹下面的文件，若是文件且以指定后缀结尾
					if (file.isFile() && file.getName().endsWith(suffix)) {
						al.add(file);//5.将满足条件的file添加到到数组中
					}
				}
			}
			return al.toArray(new File[al.size()]);
	}
}
