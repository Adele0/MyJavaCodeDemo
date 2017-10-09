package cn.itsource.string;

public class TestString {

	public static void main(String[] args) {
		String s1 = new String();
		System.out.println(s1);//打印空
		
		String s2 = null;
		System.out.println(s2);//打null
		
		String s3 = "";
		System.out.println(s3);//打印空
		
		System.out.println(s1 == s2); //false
		System.out.println(s1.equals(s2));//false
		System.out.println(s3 == s2);//false
		System.out.println(s3.equals(s2));//false
		System.out.println(s1 == s2);//false
		System.out.println(s1.equals(s3));//true

		String str = new String("我要买买买");
		System.out.println(str);
		
		String str1 = "A";//创建1个对象A；
		String str2 = str1 + "B";//创建3个对象A、B、A+B
		String str3 = "A" + "B";//创建1个对象；
//		字符串是常量的时候，在编译的时候就已经确定好值了；如果有变量，在运行时期才确定下来
	}

}
