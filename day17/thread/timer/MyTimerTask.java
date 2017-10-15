package cn.itsource.thread.timer;

import java.util.TimerTask;

public class MyTimerTask extends TimerTask{
	@Override
	public void run() {
		System.out.println("BOOM!!!");
	}
}
