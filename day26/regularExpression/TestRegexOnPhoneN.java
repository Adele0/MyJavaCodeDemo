package cn.itsource.regularExpression;
//	手机号的规则，第一位只能是1；第二位只能是【3578】；总共11位，前面已经占去2位
public class TestRegexOnPhoneN {
	
	public static void main(String[] args) {
		String phoneN = "18782961358";
		String regex = "1[3578][0-9]{9}";
		System.out.println(phoneN.matches(regex));
		
//		将中间四位替换成*号,需要进行分组
		String regex1 = "([0-9]{3})([0-9]{4})([0-9]{4})";//分成3 4 4 的三组期间不能有空格
		String p = phoneN.replaceAll(regex1,"$1****$3");//保持不变的组用$修饰
		System.out.println(p);
	}
}
