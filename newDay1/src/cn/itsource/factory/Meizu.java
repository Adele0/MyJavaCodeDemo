package cn.itsource.factory;

public class Meizu implements Phone{
	
	@Override
	public void sendMsg() {
		System.out.println("Message from Meizu");
	}
}
