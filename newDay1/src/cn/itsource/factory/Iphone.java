package cn.itsource.factory;

public class Iphone implements Phone{
	
	@Override
	public void sendMsg() {
		System.out.println("Message from iphone");
	}
}
