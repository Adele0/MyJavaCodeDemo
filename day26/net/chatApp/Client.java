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
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client extends Frame{

//	1.定义全局性的组件，每一个方法都能访问得到
	public TextArea textArea = null;//多行文本
	public TextField textField = null;//单行文本
	public Button button  = null;
	public DataInputStream dis = null;//定义发送接收消息需要输出输入
	public DataOutputStream dos = null;
	

	public static void main(String[] args) {
		new Client();//主方法调用构造方法
	}
	
//	//	2.新建构造方法
	public Client() {// 构造器设计User Interface
		initUI();//4.构造方法调用界面
		initConn();//11.调用连接
		new ClientThread(this).start();//12启动线程
	}
	
	
//	9.getter方法获取文本域内容及输入流内容，以便时时监听
	public TextArea getTextArea() {return textArea;}
	public DataInputStream getDis() {return dis;}
	
	
//	3.设计一个initUI方法来设置界面	
	public void initUI(){
		textArea = new TextArea();
		textField = new TextField();
		button = new Button("send");
		
		this.setTitle("Me");
		this.setSize(400,400);
		this.setLocationRelativeTo(null);
		
		Panel panel  = new Panel();//定义一个边框布局的面板，将单行文本和按钮放入其中
		panel.setLayout(new BorderLayout());
		panel.add(textField,BorderLayout.CENTER);
		panel.add(button,BorderLayout.EAST);
		this.add(textArea,BorderLayout.CENTER);//this是调用initUI的Client,borderLayout是默认布局
		this.add(panel,BorderLayout.SOUTH);
		
		this.buttonListener();//调用buttonListener
		
		this.setVisible(true);
	}
	

	//	6.创建连接	
	public void initConn() {
		
		try {
			Socket socket  = new Socket(InetAddress.getLocalHost(), 10086);
			dos = new DataOutputStream(socket.getOutputStream());//用socket获取输出流
			dis = new DataInputStream(socket.getInputStream());//用socket获取输入流
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	5.给button添加事件监听
	public void buttonListener() {
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String messge = textField.getText();// 获取单行文本中textField的内容
				
				String MyTitle = Client.this.getTitle();//获取当前名称
				SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");//设置时间显示格式
				String time = timeFormat.format(new Date());
				String nameNdate = MyTitle +" "+time+"\r\n\t"+messge+"\r\n";//确定名称，时间和消息内容的格式
				
				textArea.append(nameNdate);//将获取内容set到多行文本testArea，并且不能覆盖（append）
				
				try {
					dos.writeUTF(nameNdate);//将对话内容写到dos输出
				} catch (IOException e1) {
					e1.printStackTrace();
				}//7.输出完成，需要接收。创建Tamaki--ServerSocket
				
				textField.setText("");//发送消息后 文本框清空
			}
		});
	}
	

}
