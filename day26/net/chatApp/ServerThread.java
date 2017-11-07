package cn.itsource.net.chatApp;

import java.io.DataInputStream;
import java.io.IOException;

public class ServerThread extends Thread{
	
//8.接收传过来的server内容	
	Server server;
	
	public ServerThread(Server server) {
		this.server = server;
	}
	@Override
	public void run() {
		
//10.调用getTextArea()以及getDis()		
		 while (true) {
			DataInputStream dis = server.getDis();
			try {
				String message = dis.readUTF();
				server.getTextArea().append(message);
			} catch (IOException e) {
				e.printStackTrace();
			}
//	11.12 调用连接，启动线程
		}
	}

}
