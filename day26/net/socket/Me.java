package cn.itsource.net.socket;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Me {
	// 接收King发出的消息
	public static void main(String[] args) throws IOException {
		
//		2.新建端口
		ServerSocket socket = new ServerSocket(6666);
//		3.接收来自King的消息serverSocket(int port) 存放到socket
		Socket mySocket = socket.accept();
		
//		6.使用bufferedReader(因为line比价方便)读取从mySocket里接收传来的数据
		BufferedReader br = new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
		String msgFromKing = br.readLine();
		System.out.println(msgFromKing);
//		注意：首先接收方需要一直运行监听，否则会出现connection refuse
	}

}
