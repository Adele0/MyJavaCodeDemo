package cn.itsource.differUserByAnnotation;

public class TestUserServiceByVip {

	public static void main(String[] args) {
		// 实现功能：1.拿到注解 2.判断注解是否为空 3. 不为空的vip用户才能访问；为空默认执行
		Class<UserService> userService = UserService.class;
		 Vip vipAnno = userService.getAnnotation(Vip.class);
		 
		 User user = new User();
		 user.setVip(true);//模拟用户vip的状态
		 
		 UserService us = new UserService();
		 
		 if (vipAnno != null) {//判断用户有vip注解
			 if (user.isVip()) {//vip为true
				 us.addUser();//调用方法
			}
		}else {//判断用户无vip注解
			System.out.println("Non-vip cannot invoke this method.");
		}
		 
	}

}
