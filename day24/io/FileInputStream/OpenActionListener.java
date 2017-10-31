package cn.itsource.io.FileInputStream;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OpenActionListener implements ActionListener {

	private Frame frame;
	private TextArea textArea;
	
	public OpenActionListener(Frame frame, TextArea textArea) {
		super();
		this.frame = frame;
		this.textArea = textArea;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		FileDialog fileDialog = new FileDialog(frame);
		fileDialog.setVisible(true);
		
//		打开文件后。获取文件的字节
		String filename = fileDialog.getFile();
		String dir = fileDialog.getDirectory();
		String path = dir + "" + filename;//获得路径及名称
		StringBuffer sBuffer = new StringBuffer();//用来拼接取到的字节
		
//		为了避免出现，没有选中任何文件或者没有找到文件名，出现报错，添加终止条件
		if (dir == null || filename == null) {
			return;
		}
		
		try {
			FileInputStream fis = new FileInputStream(path);
			byte[] b = new byte[1024];
			int len = 0;
			while ((len = fis.read(b)) != -1) {//IO异常大于filenotFind
				sBuffer.append(new String(b,0,len));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		textArea.setText(sBuffer.toString());
	}

}
