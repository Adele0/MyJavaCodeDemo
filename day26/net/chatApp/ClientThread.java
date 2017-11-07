package cn.itsource.net.chatApp;

import java.io.DataInputStream;
import java.io.IOException;

public class ClientThread extends Thread{
//	8.通过构造方法接收传过来的server内容		
	Client client;
	
	public ClientThread(Client client) {
		this.client = client;
	}
	
	@Override
	public void run() {//效果：运行以后一直监听
		
//	10.调用getTextArea()以及getDis()		
		 while (true) {
			DataInputStream dis = client.getDis();
			try {
				String message = dis.readUTF();//将读到的内容显示到textArea
				client.getTextArea().append(message);
			} catch (IOException e) {
				e.printStackTrace();
			}
//	11.启动线程
		}
	}

}
