package cn.itsource.thread;

public class SleepDemo {
//	在指定的毫秒内让当前正在执行的线程休眠
	public static void main(String[] args) {
		new DiyThread().start();//放在前面的时候可以交替出现。
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
//		new DiyThread().start();放在后面不会交替出现，for循环完毕再执行
	}
class DiyThread extends Thread{
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println("自定义线程" + i);
		}
	}
}
}
