package cn.itsource.singleton;

public class Hungerer {
	
	private static Hungerer hungerer = new Hungerer();//定义成员属性
	
	private Hungerer(){
		System.out.println("饿汉模式的单例被创建");
	}
	
	public static Hungerer getInstance() {
		return hungerer;
	}
}
