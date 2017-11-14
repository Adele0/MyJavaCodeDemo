package cn.itsource.assertion;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestAssert {

	public static void main(String[] args) {
		String name = null;
		Assert.assertNotNull(name);//Exception in thread "main" junit.framework.AssertionFailedError
		//断言：message（断言失败的提示信息，断言成功不会提示）
//		  			expected：期望值
//		  			actual：真实值
	}

}
