package cn.itsource.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

	public static void main(String[] args) {
//		执行单线程池，new多个，先执行完单线程池，再重复执行
		/*ExecutorService singleThread = Executors.newSingleThreadExecutor();
		singleThread.execute(new DiyRunnable());
		singleThread.execute(new DiyRunnable());*/
		
//		执行多线程池，先同时执行自己fixed的线程数，再剩下的
	/*	ExecutorService fixThread = Executors.newFixedThreadPool(2);
		fixThread.execute(new DiyRunnable());
		fixThread.execute(new DiyRunnable());
		fixThread.execute(new DiyRunnable());*///如果是四个线程，那先两两执行完，再两两执行
		
//		cached线程池根据有多少个任务，分配大小
		ExecutorService cachedThread = Executors.newCachedThreadPool();
		cachedThread.execute(new DiyRunnable());
		cachedThread.execute(new DiyRunnable());
		cachedThread.execute(new DiyRunnable());
		cachedThread.execute(new DiyRunnable());
	}
}
class DiyRunnable implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(800);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Diy Runnable: " + i);			
		}
	}
}