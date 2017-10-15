package cn.itsource.thread.ticket.method;

public class TicketThreadMethod extends Thread{
		static int num = 50;
		public void run(){
			while (num > 0) {
				sale();	//
			}
		}
//		将售票方法单独列出,同步方法，但是需要static方法。
synchronized public static void sale() {
	if (num > 0) {//使用了static就不能使用this，要获得调用对象的名称，需要current来调用
			System.out.println(Thread.currentThread().getName()+": "+"正在出第"+ num +"张票");
			num--;
		}
}
}
