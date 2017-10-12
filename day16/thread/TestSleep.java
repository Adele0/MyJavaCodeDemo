package cn.itsource.thread;

public class TestSleep {

	public static void main(String[] args) throws InterruptedException {
		/*System.out.println("1");
		Thread.sleep(1000);//让当前的线程，休眠指定毫秒
		System.out.println("2");
		Thread.sleep(1000);
		System.out.println("3");
		Thread.sleep(1000);
		System.out.println("4");
		Thread.sleep(1000);
		System.out.println("5");
		Thread.sleep(1000);
		System.out.println("6");
		Thread.sleep(1000);
		System.out.println("7");
		Thread.sleep(1000);
		System.out.println("8");
		Thread.sleep(1000);*/
		
//		倒计时
		for (int i = 10; i >= 0; i--) {
			System.out.println(i + "秒");
			Thread.sleep(1000);
			if (i == 0) {
				System.out.println("计时结束");
			}
		}
	}

}
