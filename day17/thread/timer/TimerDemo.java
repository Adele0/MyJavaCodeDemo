package cn.itsource.thread.timer;

import java.util.Timer;

public class TimerDemo {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new MyTimerTask(),5000,2000);
//		5000毫秒指，5秒之后执行某个操作。2000毫秒指，2秒后反复执行前面的动作
	}

}
