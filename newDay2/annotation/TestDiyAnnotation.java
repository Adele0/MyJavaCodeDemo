package cn.itsource.annotation;

import java.awt.List;

//@DiyAnnotation(level = 1)  //未加默认值时，需要手动添加属性值

//@DiyAnnotation         //当设置有默认值时，无需手动添加

@DiyAnnotation("只有一个且名为value就不用写value=...")
public class TestDiyAnnotation {

	public static void main(String[] args) {
		
		List list = null;
	}

}
