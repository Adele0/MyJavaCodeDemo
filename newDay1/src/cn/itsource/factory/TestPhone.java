package cn.itsource.factory;

public class TestPhone {

	public static void main(String[] args) {
		// 新建factory
		PhoneFactory phoneFactory = new PhoneFactory();
		Phone myPhone = phoneFactory.getPhone("苹果");
		myPhone.sendMsg();
	}
}
