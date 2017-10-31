package cn.itsource.io.FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("TestOutputStream");// 新建输出
		String ms = "This message is from JAVA Output Stream.";//要输出的内容
		byte[] bs = ms.getBytes();//将输出内容转换成字节getBytes
		fos.write(bs);//调用write方法，传入字节【】
		fos.write(65);//传入单个byte，直接转换65=A
		fos.close();//最后关闭资源
	}

}
