package cn.itsource.annotation;

import java.lang.annotation.Annotation;

public class TestGetVip {

	public static void main(String[] args) {
		// 通过反射Class实例对象，拿到类上的注解
		Class<TestVipAnnotation> vipClazz = TestVipAnnotation.class;
		
//		拿到所有注解。一般不会使用到
		Annotation[] annotations = vipClazz.getAnnotations();
		System.out.println(annotations.length);  //未添加@retention前是0，因为字节码存在运行时期，没有添加生命周期运行不到
		
//		拿到某一个指定的注解
		VipAnnotation vip = vipClazz.getAnnotation(VipAnnotation.class);
		System.out.println(vip);
//		System.out.println(vip.ages());
//		System.out.println(vip.value());
		int vipLevel = vip.level();
		
//		若TestVipAnnotation没有定义vipAnnotation注解，取到的值为null
		if (vip != null) {
			if (vipLevel == 0) {
				System.out.println("不支持无级别操作，请升级");
			}else if (10 > vipLevel  && vipLevel >= 1) {
				System.out.println("10级以下用户请升级后使用");
			}else if (vipLevel >= 10) {
				System.out.println("解锁成功");
			}
		}
	}

}
