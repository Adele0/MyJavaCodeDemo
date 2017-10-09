package cn.itsource.string;

public class ApplicationStringBuffer {

	public static void main(String[] args) {
		StringBuffer stringBuffer1 = new StringBuffer("AB");
		StringBuffer stringBuffer2 = new StringBuffer("CD");
		String string1 = new String("aa");
		String string2 = new String("bb");
		
		test(stringBuffer1, stringBuffer2, string1, string2);
		
		System.out.println(stringBuffer1);//ABAB
		System.out.println(stringBuffer2);//CDCD
		System.out.println(string1);//aa
		System.out.println(string2);//bb
	}
	
	public static void test(StringBuffer sBuffer, StringBuffer sBuffer1,String string, String string1) {
		sBuffer.append("AB");
		sBuffer1 = sBuffer1.append("CD");
		string.concat("aa");
		string1 = string1.concat("bb");
	}
}
