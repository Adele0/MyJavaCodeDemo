package cn.itsource.thread.ticket.method;

public class TicketRunnableMethod implements Runnable {
	static int num = 50;//runnable不需要new多个对象，可以不要static
	public void run(){
		while (num > 0) {//2.循环50次
				sale();
			}
	}

synchronized public void sale(){
	if (num > 0) {//   此处可以使用this来调用当前线程名称
			System.out.println(Thread.currentThread().getName()+"正在出第"+ num +"张票");
			num--;
		}
	}
}

