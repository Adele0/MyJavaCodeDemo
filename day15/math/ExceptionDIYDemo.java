package cn.itsource.math;

public class ExceptionDIYDemo {

	public static void main(String[] args) {
//		创建自定义异常：1.创建一个类--继承RuntimeException或者Exception（）
//					不用NullPointerException/Throwable(范围太大、太小)
//					2.提供2个构造方法，一个没有参数，一个有参数
		try {
			register("Bai");
		} catch (UsernameRepeat e) {
			e.printStackTrace();
		}
	}
//		模拟场景：提供一个注册方法，DIY用户名重复异常
	public static void register(String username) throws UsernameRepeat {
//		定义一个String类型的数组，用来模拟数据库
		String[] names = {"White","Adele","Tomato"};
//		传入的username和数据库中内容进行比较
		for (String name : names) {
			if (name.equals(username)) {
				throw new UsernameRepeat("用户名重复，请重新输入");//新建一个新异常
			}
		}
		System.out.println("注册成功！");
	}
}
