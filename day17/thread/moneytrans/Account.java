package cn.itsource.thread.moneytrans;

public class Account {
		boolean hasMoney = false;//默认账户没钱
		int money;
		public Account(int money) {
			super();
			this.money = money;
		}
	
		
		public int getMoney() {
			return money;
		}
		public void setMoney(int money) {
			this.money = money;
		}
		
		
		synchronized public void deposit() throws InterruptedException {
//			账户余额时等待
			if (true == hasMoney) {
					wait();
			}
			
			System.out.println("账户原始金额:" + getMoney()+"，每次存1000元");
			
			setMoney(getMoney()+1000);//存钱操作
			
			System.out.println("账户新余额:" + getMoney());	
//			存完钱后账户有余额
			hasMoney = true;
//			唤醒withdraw取钱
			notify();
		}
		
		synchronized public void withdraw() throws InterruptedException {
			if (false == hasMoney) {
				wait();
			}
			System.out.println("账户原始金额:" + getMoney()+"，每次取1000元");
//			先判断账户是否有足够余额
			if (1000 <= getMoney()) {
				setMoney(getMoney()-1000);
			}else {
				System.out.println("余额不足");
			}
		
			System.out.println("账户新余额:"+ getMoney());	
//			存完钱后账户无余额
			hasMoney = false;
//			唤醒deposit存钱
			notify();
		}
}
