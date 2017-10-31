package cn.itsource.io.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("FileWriter");// 新建filewriter
//		String msg = "这是由FileWriter书写的段落。";字符不需要字节的getBytes方法
		fw.write("没有买买买，人生还有什么意义呢？\r\n");
		fw.write("9494!!\r\n");
		fw.write("dei dei dei \r\n");//  \r\n 换行
		fw.flush();//将缓冲区的内容写到磁盘
		fw.close();//跟fileoutputstream不同，writer先写到缓存，只有flush()或close()【close会调用flush】后才写到磁盘
	}

}
