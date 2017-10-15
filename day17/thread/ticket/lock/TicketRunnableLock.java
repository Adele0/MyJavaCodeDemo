package cn.itsource.thread.ticket.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketRunnableLock implements Runnable {
	private Lock lock = new ReentrantLock();//lock是接口只能通过具体lock实现，不能new出来
	static int num = 50;
	public void run(){
		while (num > 0) {
			lock.lock();
			try {
				if (num > 0) {
					System.out.println(Thread.currentThread().getName()+"正在出第"+ num +"张票");
					num--;
				}
			} finally {
				lock.unlock();
			}
		}
	}
}