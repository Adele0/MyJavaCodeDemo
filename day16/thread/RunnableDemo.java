package cn.itsource.thread;

public class RunnableDemo {
//	新建对象，调用启动线程
	public static void main(String[] args) {
		new Thread(new GameRunnable()).start();
		new Thread(new MusicRunnable()).start();
	}

}
