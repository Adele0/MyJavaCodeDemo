package cn.itsource.io.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestBufferedInputStream {

	public static void main(String[] args) throws IOException {
		// 缓冲流将数据存到缓冲区，在刷新的时候提交到节点设备，减少操作次数.
//		BufferedInputStream是字节的缓存流，在读的时候，对应 用fileInputStream
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("BufferedInputStream"));
		byte[] b = new byte[1024];
		int len = 0;
		while((len = bis.read(b)) != -1){
			System.out.println(new String(b,0,len));
		}
		bis.close();
	}
}
