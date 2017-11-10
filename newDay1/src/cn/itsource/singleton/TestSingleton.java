package cn.itsource.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		
		// 饿汉模式
		Hungerer hungerer = Hungerer.getInstance();
		Hungerer hungerer1 = Hungerer.getInstance();
		System.out.println(hungerer == hungerer1);//多次调用值是一样，equals则不一定
		
//		懒汉模式
		Lazyer lazyer = Lazyer.getInstance();
		Lazyer lazyer1 = Lazyer.getInstance();
		System.out.println(lazyer == lazyer1);
		
//		静态代码块
		System.out.println("强烈推荐使用静态代码块");
		StaticBlock staticBlock = StaticBlock.getInstance();
		StaticBlock staticBlock1 = StaticBlock.getInstance();
		System.out.println(staticBlock == staticBlock1);
	}

}
