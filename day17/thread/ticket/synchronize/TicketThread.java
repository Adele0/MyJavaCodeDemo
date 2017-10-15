package cn.itsource.thread.ticket.synchronize;

public class TicketThread extends Thread{
		static int num = 50;//没有static的话，多个线程new出来会出现多个num
		public void run(){
			while (num > 0) {//2.循环50次
				synchronized (TicketThread.class) {//同步放在每一次买票动作的位置。新建thread三次，无法用this，只能用唯一的字节码文件来保证唯一性
					if (num > 0) {//1.只要有票就能销售，每次销售总数建见少
//					获取调用者的名称
						System.out.println(this.getName()+": "+"正在出第"+ num +"张票");
						num--;
					}
				}
			}
		}
}
