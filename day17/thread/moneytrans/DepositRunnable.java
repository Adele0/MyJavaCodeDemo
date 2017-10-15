package cn.itsource.thread.moneytrans;
//存钱的线程
public class DepositRunnable implements Runnable {
//	定义一个账户
	Account a;
	public DepositRunnable(Account a2) {
		this.a = a2;
	}
	@Override
	public void run() {
		for (int i = 0; i < 12; i++) {
			try {
				a.deposit();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


}
