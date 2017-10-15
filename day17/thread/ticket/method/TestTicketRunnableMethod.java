package cn.itsource.thread.ticket.method;

public class TestTicketRunnableMethod {
//runnable不需要new多个对象，可以不要static。但是这里有线程安全问题，有重复的票数。需要引入线程同步
	public static void main(String[] args) {
		TicketRunnableMethod ticketRunnable = new TicketRunnableMethod();
		new Thread(ticketRunnable,"学生窗口： ").start();
		new Thread(ticketRunnable,"老弱病残孕窗口： ").start();
		new Thread(ticketRunnable,"一般窗口： ").start();
//		解决：是那个窗口（线程）做出的售票信息
	}
}
