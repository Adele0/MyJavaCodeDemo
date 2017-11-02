package cn.itsource.io.byteArray;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class TestByteArray {
	/*内存流的方法
	ByteArrayInputStream
	ByteArrayOutputStream
	CharArrayReader
	CharArrayWriter
	*/
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();//新建内存字节输出流
		baos.write("写到内存的内容".getBytes());//将得到要输出的内容的byte数组
		byte[] b = baos.toByteArray();//转化成toByteArray()数组并储存
//		在内存的输入输出不必关闭
//		System.out.println(new String(b));
		
		ByteArrayInputStream bais = new ByteArrayInputStream(b);//读取内存字节
		byte[] bb = new byte[1024];//新建新数组保存原内存字节的内容
		int len = 0;
		while ((len = bais.read(bb)) != -1) {
			System.out.println(new String(bb, 0, len));
		}
	}
}
