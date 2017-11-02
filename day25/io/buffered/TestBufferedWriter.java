package cn.itsource.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferedWriter {

	public static void main(String[] args) throws IOException {
//		BufferedWriter是字符的缓存流，在读的时候，对应 用fileWriter
		BufferedWriter bw = new BufferedWriter(new FileWriter("BufferedWriter",true));
		bw.write("新内容加到哪儿了？\r\n");//原来文档中的内容被覆盖掉了！！！应该使用 true
		bw.write("我来找找\r\n");
		bw.write("希望不要覆盖！");
		bw.newLine();
		bw.write("不希望在文字中写换行字符的话，使用newLine（）方法");
		bw.close();
	}
}
