package cn.itsource.regularExpression;

public class TestRegex {
	// 正则表达式regular expression必须满足规则。 JavaScript（脚本语言--页面）
//用途：文本中的“（全部）替换” \检测用户名是否存在\密码设置规则\确认密码是否一致\邮箱\身份证\电话。。。
	public static void main(String[] args) {
		
//		Boolean match（String regex）字符串是否匹配
		String s = "5627adadeht24";
		System.out.println(s.matches("[0-9]"));//0至9
		System.out.println(s.matches("[0,9]"));//0至9
		System.out.println(s.matches("[a-z]"));//a至z
		System.out.println(s.matches("[a-zA-Z]"));//任意字符

//		String replaceAll(String regex, String replacement)替换指定字符串，用给定的replacement
		System.out.println(s.replaceAll("[a-z]", "*"));//将小写字符用*号替换
		
//		String[] split(String regex)根据给定的正则表达式来拆分字符串
		String s1 = "s i l l -g i r l -a l l -o v e r -t h e -wo r l d";
		String[] strings = s1.split("-");//用-号来拆分字符串，返回string[]类型
		for (String string : strings) {
			System.out.println(string);//遍历打印每一个string[]里的元素
		}
	}

}
