package cn.itsource.charset;

import java.io.UnsupportedEncodingException;

public class TestCharseet {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// byte[] getBytes(String charsetName)用指定的字符编码来编码字符串
		String msg = "买买买！";
		byte[] b = msg.getBytes("utf-8");//指定一种编码
		
//		指定解码：构造一个字符串String(byte[] bytes, String charsetName)
		String result = new String(b, "gbk");//编码规则和解码规则必须一致
		System.out.println(result);
	}

}
