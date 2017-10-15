package cn.itsource.thread.moneytrans;

public class TestTransaction {

	public static void main(String[] args) {
//		要保证存取在同一个账户中进行，定义一个账户并传给new出来的线程，线程中调用构造方法
		Account a = new Account(0);
		DepositRunnable dRunnable =  new DepositRunnable(a);
		WithdrawRunnable wRunnable = new WithdrawRunnable(a);
		
		new Thread(dRunnable).start();
		new Thread(wRunnable).start();
	}

}
