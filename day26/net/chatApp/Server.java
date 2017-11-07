package cn.itsource.net.chatApp;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Server extends Frame{

	public TextArea textArea = null;
	public TextField textField = null;
	public Button button  = null;
	public DataInputStream dis = null;
	public DataOutputStream dos = null;
	

	public static void main(String[] args) {
		new Server();
	}
	

	public Server() {
		initUI();
		initConn();
		new ServerThread(this).start();
	}
	
	
//	自动生成 get 方法
	public DataInputStream getDis() {
		return dis;
	}
	public TextArea getTextArea() {//返回类型是：TextArea而不是Object
		return textArea;
	}
	
	
	public void initUI(){
		textArea = new TextArea();
		textField = new TextField();
		button = new Button("send");
		
		this.setTitle("Tamaki");//7.接收者名字
		this.setSize(400,400);
		this.setLocationRelativeTo(null);
		
		Panel panel  = new Panel();
		panel.setLayout(new BorderLayout());
		panel.add(textField,BorderLayout.CENTER);
		panel.add(button,BorderLayout.EAST);
		this.add(textArea,BorderLayout.CENTER);
		this.add(panel,BorderLayout.SOUTH);
		
		this.buttonListener();
		
		this.setVisible(true);
	}
	
//	7.创建Tamaki--ServerSocket
	public void initConn() {
		
		try {
			ServerSocket serverSocket  = new ServerSocket(10086);
			Socket socket = serverSocket.accept();//得到socket
			dos = new DataOutputStream(socket.getOutputStream());//输出
			dis = new DataInputStream(socket.getInputStream());//输入
		} catch (IOException e) {
			e.printStackTrace();
		}//8.监听输入输出内容---线程
	}
	

	public void buttonListener() {
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String messge = textField.getText();
				
				String MyTitle = Server.this.getTitle();
				SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
				String time = timeFormat.format(new Date());
				String nameNdate = MyTitle +" "+time+"\r\n\t"+messge+"\r\n";
				
				textArea.append(nameNdate);
				
				try {
					dos.writeUTF(nameNdate);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				textField.setText("");
			}
		});
	}
}
