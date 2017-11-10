package cn.itsource.singleton;

public class StaticBlock {//强烈推荐使用静态代码块
	
	private static StaticBlock staticBlock;//定义成员属性
	
	static{
//		初始化静态成员
		System.out.println("静态代码块被执行");
		staticBlock = new StaticBlock();//第一次调用该类的成员时会被调用
	}
	
	private StaticBlock(){
		System.out.println("静态代码块的单例被创建");
	}
	
	public static StaticBlock getInstance() {
		return staticBlock;
	}
}
