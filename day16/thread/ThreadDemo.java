package cn.itsource.thread;

public class ThreadDemo {
//	新建对象，调用启动线程
	public static void main(String[] args) {
		 new GameThread().start();
		 new MusicThread().start();
	}

}
