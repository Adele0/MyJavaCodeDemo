package cn.itsource.net;

import java.io.IOException;
import java.net.InetAddress;

public class TestIP {
	/*InetAddress用来表示IP地址
	 	static InetAddress getLocalHost() 主机地址
	 	static InetAddress getByName(String host)通过给定的主机名，得到主机IP地址
	 	static InetAddress getByAddress(byte[] addr)通过给定的主机IP地址，得到主机名
	 	boolean isReachable(int timeout)测试在给定时间里是否能达到该地址*/
	
	public static void main(String[] args) throws IOException {
		
		InetAddress ip = InetAddress.getLocalHost();//Adele/192.168.11.105
		System.out.println(ip);
		
		InetAddress ip2 = InetAddress.getByName("Adele");
		System.out.println(ip2);
																								
		InetAddress ip3 = InetAddress.getByAddress(new byte[] {(byte)192,(byte)168,11,105});//byte的范围：-128 127
		System.out.println(ip3);
		System.out.println((byte)192);//128-192
		
		System.out.println(ip2.isReachable(5000));//5000毫秒能连接
		
	}

}
