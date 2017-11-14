package cn.itsource.annotation;

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

@Target(value = {METHOD, TYPE})
@Retention(RetentionPolicy.RUNTIME) //手动导入retention和枚举RetentionPolicy

public @interface VipAnnotation {
	
		String value() default "";
		int level() default 1;
		int [] ages() default {};
}