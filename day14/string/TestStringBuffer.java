package cn.itsource.string;

public class TestStringBuffer {
//	把1-1000整数拼接成一个字符串，最后效果：12345...9991000
	/*伪代码：
	1.循环1000次，每次取一个值； 
	2.String string 定义一个字符串，每取一个值，拼接在后面；
	3.打印string*/
	public static void main(String[] args) {
		
		long begin = System.currentTimeMillis();
		String string = "";
		for (int i = 1; i < 1001; i++) {
			string += i;
		}
		System.out.println(string);
		long finish = System.currentTimeMillis();
		System.out.println(finish - begin);
		
//		经测试上面的效率很低10ms，现在引进string buffer （线程安全）string builder（线程不安全，效率高点）
		
		
		long begin1 = System.currentTimeMillis();
		StringBuffer sBuffer = new StringBuffer();
		for (int i = 1; i < 1001; i++) {
			sBuffer.append(i);
		}
		System.out.println(sBuffer);
		long finish1 = System.currentTimeMillis();
		System.out.println(finish1 - begin1);
		
		/*Why?String 创建很多个对象，一旦创建 长度和内容固定不变
			StringBuffer创建一个对象，append用来改变字符串内容*/
	}
}