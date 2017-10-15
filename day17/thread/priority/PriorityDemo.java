package cn.itsource.thread.priority;

public class PriorityDemo {

	public static void main(String[] args) {
		/*Thread mainThread = Thread.currentThread();
		System.out.println("main中的优先级默认： " + mainThread.getPriority());
		
		mainThread.setPriority(7);//priority：1-10,默认5
		System.out.println("更改后的main的优先级： " + mainThread.getPriority());
		
//		在main中新建一个线程
		Thread thread = new Thread();
		System.out.println("在main新建线程的优先级： " + thread.getPriority());
//		跟随main线程的优先级.线程的优先级跟创建的环境有关
		
		*/
		DiyThread diyThread = new DiyThread();
		diyThread.setPriority(6);
		diyThread.start();
//	在自定义的线程里也是跟环境的优先级一致的
	}
}
//自定义线程
class DiyThread extends Thread{
	public void run(){
		Thread tThread =new Thread();
		System.out.println("自定义线程的优先级： " + tThread.getPriority());
	}
} 
