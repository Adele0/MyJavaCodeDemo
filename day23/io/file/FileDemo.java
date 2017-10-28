package cn.itsource.io.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// 新建File实例（File（String pathname）），用\\转义路径
		File file = new File("F:\\dazigou\\STUDY\\JAVA\\MyCode\\TestIO\\Parent.txt");
		File file1 = new File("F:\\dazigou\\STUDY\\JAVA\\MyCode\\TestIO\\","Parent.txt");
		File file2 = new File(new File("F:\\dazigou\\STUDY\\JAVA\\MyCode\\TestIO\\"),("Parent.txt"));
		System.out.println(file);
		System.out.println(file1);
		System.out.println(file2);
//		通过打印知道：三种方式都是新建文档的方式，但是打开文件夹，却没有此文件，是因为现在此文件还在推空间里还未存到磁盘
		
		file.createNewFile();//在磁盘中创建文件夹
		
		
		File file3 = new File("F:\\dazigou\\STUDY\\JAVA\\MyCode\\TestIO\\ParentFileCreateByJAVA");
//		file3.createNewFile();//没有文件后缀，自动新建一个文件类型的文！件！
		
//		创建文件夹的方法为：mkdir(make directory)
		file3.mkdir(); //同一个文件名只能单一选择create 或者 mkdir
		
		File file4 = new File("F:\\dazigou\\STUDY\\JAVA\\MyCode\\TestIO\\ParentFileCreateByJAVA\\ChildFileCreateByJAVA\\Subfile");
		file4.mkdirs();//mkdir只能新建单层文件夹。 mkdirs多层级文件夹
		
//		文件和文件夹需要单独创建 不能同时创建。
		
	}
}
