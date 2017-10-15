package cn.itsource.thread.runnable;

public class TicketRunnable implements Runnable {
	static int num = 50;//runnable不需要new多个对象，可以不要static
	public void run(){
		while (num > 0) {//2.循环50次
			if (num > 0) {//1.只要有票就能销售，每次销售总数建见少
//				获取调用者的名称
				System.out.println(Thread.currentThread().getName()+"正在出第"+ num +"张票");
				num--;
			}
		}
	}
}
