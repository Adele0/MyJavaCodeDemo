package cn.itsource.string;

public class TestStringMethod {
	public static void main(String[] args) {
		String s1 = "sobempanenq";
		
		System.out.println(s1.charAt(5)); //p
		
		System.out.println(s1.codePointAt(5));//打印p对应的数字
		
		System.out.println(s1.concat("aabbcc"));//新建一个字符串将concat的内容拼接到s1后面
		System.out.println(s1);//此处可以测试到原来的字符串没有变
		
		System.out.println(s1.contains("so"));//包含序列，返回Boolean值
		System.out.println(s1.contains("os"));//包含序列，返回Boolean值
		
		System.out.println(s1.contentEquals("sobempanen"));//判断完全一致，返回Boolean值
		
		String string = "MaiMaiMai.gif.avi";
		System.out.println(string.endsWith("gif"));//判断后缀，返回Boolean值
		String string1 = "MaiMaiMai.avi.gif";
		System.out.println(string1.endsWith("gif"));
		
		System.out.println(string1.isEmpty());//判断空值，返回Boolean值
		System.out.println(string1.length());
		
		System.out.println(string1.replace(".avi",""));//新建一个字符串,
		System.out.println(string1);//此处可以测试到原来的字符串没有变
//		调用方法都是新建的新对象
		
		System.out.println(s1.substring(5));//包含5位p到最后一位的截取
		System.out.println(s1.substring(5,9));//不包含9位n。左闭右开
		
		System.out.println(s1.toUpperCase());//全部转化成大写
		System.out.println(string.toLowerCase());//全部转化成小写
		
		String string2 = "   aa bbaac cc  ";
		System.out.println(string2.trim());//去掉开头结尾的空格，中间不变
		System.out.println(string2);//调用方法是新建对象，原来的值不变
	}
}
