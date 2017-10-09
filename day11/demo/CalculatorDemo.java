package cn.itsource.day11.demo;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame("最帅计算器");
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		frame.setLayout(new BorderLayout());
		
		TextField textField = new TextField();
		textField.setSize(300,60);
		frame.add(textField,BorderLayout.NORTH);
		
		Button buttonE = new Button("ENTER");
		buttonE.setPreferredSize(new Dimension(50,50));
		frame.add(buttonE,BorderLayout.EAST);
		
		
		Panel panel = new Panel();
		panel.setLayout(new GridLayout(5,3));
		panel.add(new Button("+"));
		panel.add(new Button("-"));
		panel.add(new Button("*"));
		panel.add(new Button("7"));
		panel.add(new Button("8"));
		panel.add(new Button("9"));
		panel.add(new Button("4"));
		panel.add(new Button("5"));
		panel.add(new Button("6"));
		panel.add(new Button("1"));
		panel.add(new Button("2"));
		panel.add(new Button("3"));
		panel.add(new Button("."));
		panel.add(new Button("0"));
		panel.add(new Button("/"));
		frame.add(panel,BorderLayout.CENTER);
	}

}
