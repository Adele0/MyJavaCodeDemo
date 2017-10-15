package cn.itsource.thread.ticket.synchronize;

public class SynchronizedTicketThread {
//多个线程new出来，num需要static修饰。但是这里有线程安全问题，有重复的票数。需要引入线程同步
	public static void main(String[] args) {
		TicketThread ticketThread = new TicketThread();
		TicketThread ticketThread1 = new TicketThread();
		TicketThread ticketThread2 = new TicketThread();
//		解决：是哪个窗口（线程）。即解决命名问题。
		ticketThread.setName("优先窗口");
		ticketThread1.setName("1号窗口");
		ticketThread2.setName("2号窗口");
		ticketThread.start();
		ticketThread1.start();
		ticketThread2.start();
	}

}
