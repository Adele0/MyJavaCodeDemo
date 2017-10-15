package cn.itsource.thread.ticket.synchronize;

public class TicketRunnable implements Runnable {
	static int num = 50;//runnable不需要new多个对象，可以不要static
	public void run(){
		while (num > 0) {//2.循环50次
			synchronized (this) {//同步放在每一次买票动作的位置。新建runnable一次，this能保证唯一性
				if (num > 0) {//1.只要有票就能销售，每次销售总数建见少
//				获取调用者的名称
					System.out.println(Thread.currentThread().getName()+"正在出第"+ num +"张票");
					num--;
				}
			}
		}
	}
}
