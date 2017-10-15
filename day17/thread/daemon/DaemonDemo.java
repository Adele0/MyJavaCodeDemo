package cn.itsource.thread.daemon;

public class DaemonDemo {

	public static void main(String[] args) {
		/*Thread mThread = Thread.currentThread();
		System.out.println("主线程是否是后台线程： " + mThread.isDaemon());
//		活动的状态的线程不能修改为后台线程
		mThread.setDaemon(true);
		System.out.println("主线程是否是后台线程： " + mThread.isDaemon());*/
		
		/*Thread thread = new Thread();
		thread.setDaemon(true);//此处没有thread.start()启动，所以不是活动状态
		System.out.println("main新建的线程是否是后台线程： " + thread.isDaemon());*/
		
//		自定义线程
		DiyThread diyThread = new DiyThread();
		System.out.println("自定义线程启动前默认： "+diyThread.isDaemon());
		diyThread.setDaemon(true);
		System.out.println("自定义线程修改后： "+diyThread.isDaemon());
		diyThread.start();
	}

}
class DiyThread extends Thread{
	@Override
	public void run() {
		Thread tThread = new Thread();
		System.out.println("自定义线程是否是后台线程： "+tThread.isDaemon());
	}
}