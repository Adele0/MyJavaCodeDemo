package cn.itsource.thread.moneytrans;
//取钱的线程
public class WithdrawRunnable implements Runnable {
//	定义一个账户
	Account a;
	public WithdrawRunnable(Account a2) {
		this.a = a2;
	}
	@Override
	public void run() {
		for (int i = 0; i < 12; i++) {
			try {
				a.withdraw();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


}
