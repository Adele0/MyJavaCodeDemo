package cn.itsource.thread.join;

public class JoinThread {

	public static void main(String[] args) throws InterruptedException {
		JoinThreadTest jtJoinThreadTest = new JoinThreadTest();
		jtJoinThreadTest.start();
		for (int i = 0; i < 50; i++) {
			System.out.println("主线程: " + i);
			if (i == 10) {
				jtJoinThreadTest.join();//当线程运行到10的时候，运行完join，再运行剩下的
			}
		}
	}
}
//自定义线程
class JoinThreadTest extends Thread{
	public void run(){
		for (int i = 0; i < 50; i++) {
			System.out.println("JoinThread: " + i);
		}
	}
}