package cn.itsource.day12.listener;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpenActionListener implements ActionListener {

	private Frame frame;
	public OpenActionListener(Frame frame) {
		super();
		this.frame = frame;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		FileDialog fileDialog = new FileDialog(frame);
		fileDialog.setVisible(true);
	}

}
