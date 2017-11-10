package cn.itsource.singleton;

public class Lazyer {
	
	private static Lazyer lazyer;//定义成员属性时不立刻new
	
	private Lazyer(){
		System.out.println("懒汉模式的单例被创建时先判断是否是第一次");
	}
	
//懒汉模式的弊端是：多线程的情况下可能多次new出实例
	public static Lazyer getInstance() {//可以使在static后面加上synchronized,但是会导致所有线程排队等待
		if (lazyer == null) {
			lazyer = new Lazyer();//当第一次调用方法时才创建
		}
		return lazyer;
	}
//	引入静态代码块：既能避免懒汉模式多次new出实例 也能克服synchronized的低效
}
