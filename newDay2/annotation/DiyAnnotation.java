package cn.itsource.annotation;

import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

@Target(value = {METHOD, TYPE})//2.使用元注解需要手动导入static java.lang.annotation.ElementType.

public @interface DiyAnnotation {//1.若未作规定，自定义的注解可以放在任意位置
	
//		定义注解参数：    参数类型 属性名（） default 默认值；      其中：参数类型是java有的类型
//		int level() default 1;//3.为自定义注解设置名为level的属性，在使用到该注解时，不加上该属性会报错
	
//		String name();其他类型均可
//		double[] numbers();
	
//		4.当只有一个参数时 最好将属性名命名为value
		String value() default "";
}