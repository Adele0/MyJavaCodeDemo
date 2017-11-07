package cn.itsource.regularExpression;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestRegexOnRegi {

	public static void main(String[] args) {
		
//		 1.注册页面，验证用户名是否合法：不能以数字开头，6-18位
		Frame frame = new Frame("注册页面");
		frame.setSize(600, 400);
//		frame.setLocation(200, 200);
		frame.setLayout(null);
		
//		2.新建组件
		Label label = new Label("UserName :");
		Label warning = new Label();
		Label rule = new Label("Noice: UserName shall not strat with number, meanwhile, at least 6 but no more than 18 characters");
		TextField tField = new TextField();//单行textfield
		Button button  = new Button("Registration");
		
//		3.设置组件大小坐标
		label.setBounds(30, 50, 100, 30);
		tField.setBounds(130, 50, 100, 30);
		warning.setBounds(250, 50, 300, 30);
		button.setBounds(130, 100, 100, 30);
		rule.setBounds(10, 350, 560, 30);
		rule.setBackground(Color.lightGray);
		
//		5.给button添加事件监听.使用内部类
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 获取单行文本中的内容
				String msg = tField.getText();
				//设置regular expression 正则表达式
				String regex = "[^0-9][0-9a-zA-Z]{5,17}";//第一位不为数字，其他位任意，长度左闭右开，6-18位
				//判断文本内容是否合规
				if (msg.matches(regex)) {
					warning.setText("Congratulation！");
					warning.setForeground(Color.green);
				}else {
					warning.setText("Erro! Please check the Notice for UserName below!");
					warning.setForeground(Color.red);
				}
			}
		});
		
		
//		4.添加组件到窗体
		frame.add(label);
		frame.add(warning);
		frame.add(rule);
		frame.add(tField);
		frame.add(button);
		frame.setVisible(true);
	}

}
