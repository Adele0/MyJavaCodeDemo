package cn.itsource.annotation;

import java.awt.List;
import java.util.Date;

public class TestAnnotation {

	public static void main(String[] args) {
		
	}
	// 1.override用在覆写父类方法
	
	
	// 2.suppressWarning抑制警告（建议尽量解决警告）
	public void testWarning() throws Exception{
		@SuppressWarnings("unused")
		List list = null;//警告list这个值未使用，List没添加泛型
		
//		如果同一方法有多个抑制警告，需要将@SuppressWarnings("unused")移到方法外
//		如果有多个方法需要抑制警告，需要将@SuppressWarnings("unused")移到类外
//		当有多个不同类型的抑制警告@SuppressWarnings({"unused","deprecation","unchecked","path","serial","finally"})以此结构书写
//		如果有多个抑制警告的类型，@SuppressWarnings("all")能解决所有问题，但是不建议这样做
	}
	
	
	// 3.deprecated标记已过时。提示已经有更好的替代方法,为了向下兼容
	@SuppressWarnings("deprecation")
	public void testDeprecated() {
		new Date() .toGMTString();
	}
	
	//4.SafeVararags堆污染：泛型的类型不匹配（尽量加上泛型），堆污染容易导致ClassCastException
}
