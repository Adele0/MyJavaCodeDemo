package cn.itsource.string;

public class TestStringBufferMethod {

	public static void main(String[] args) {
		StringBuffer sBuffer = new StringBuffer("AASDFGH");
		System.out.println(sBuffer.append("zxcvbt"));
		System.out.println(sBuffer);//String会创建新对象，在新对像上做指令
		
		System.out.println(sBuffer.delete(0, 6));//左闭右开，end是不包含的
		System.out.println(sBuffer);//StringBuffer不会创建新对象，指令在同一个对象上执行
		
		System.out.println(sBuffer.insert(0, "zxcvbt"));//插入的第一个字符是第多少位
		System.out.println(sBuffer.replace(1, 3, "000"));
	}

}
