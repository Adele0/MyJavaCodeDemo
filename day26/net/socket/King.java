package cn.itsource.net.socket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class King {
	// king 发出信息
	public static void main(String[] args) throws UnknownHostException, IOException {

//		1.建立King和我之间的连接Socket(InetAddress add, int port)地址和端口
		Socket kSocket = new Socket(InetAddress.getLocalHost(),6666);
		
//		4.定义要发送的数据
		String msg = "I always know your feelings about me. I love you too~";
		
//		5.使用打印流，再通过socket的getOutputStream方法将得到的OutputStream
		PrintStream ps = new PrintStream(kSocket.getOutputStream());
		ps.print(msg);//输出数据数据
		ps.close();//关闭
	}

}
