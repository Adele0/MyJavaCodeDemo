package cn.itsource.net.url;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class TestURL {
/* URLEncode:把字符串转换成浏览器能识别格式
 	URLDecode:把浏览器识别格式转换成字符串*/
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		// encode(String s, String enc)
		String msg = "I am not feeling well now";//I+am+not+feeling+well+now
		System.out.println(URLEncoder.encode(msg, "utf-8"));
		String msg2 = "想吃羊肉汤";
		String afterTrans = URLEncoder.encode(msg2, "gbk"); //为了多次使用 需要用变量保存
		System.out.println(afterTrans);// %CF%EB%B3%D4%D1%F2%C8%E2%CC%C0
		
//		decode(String s, String enc)
		System.out.println(URLDecoder.decode(afterTrans, "gbk"));
	}

}
