package cn.itsource.thread.ticket.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketThreadLock extends Thread{
//lock是接口只能通过具体lock实现，不能new出来,thread new了3次，为了保证是同一把锁，应该加上static
		private static Lock lock = new ReentrantLock();
		static int num = 50;//没有static的话，多个线程new出来会出现多个num
		public void run(){
			while (num > 0) {
				lock.lock();
				try {
					if (num > 0) {
						System.out.println(this.getName()+": "+"正在出第"+ num +"张票");
						num--;
					}
				} finally {
					lock.unlock();
				}
				
			}
		}
}
