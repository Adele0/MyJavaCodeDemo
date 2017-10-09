package cn.itsource.day12.listener;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonActionListener implements ActionListener{
	private Button button;
	private TextField textField;
	public ButtonActionListener(Button button,TextField textField){
		super();
		this.button = button;
		this.textField = textField;		
	}

	@Override
	public void actionPerformed(ActionEvent event){
	Object source = event.getSource();
	System.out.println("Clicked");
	//获得按钮文本值
	String value = button.getLabel();
	//设置文本值到文本框
	textField.setText(textField.getText() + value);
	}
}