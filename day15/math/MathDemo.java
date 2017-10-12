package cn.itsource.math;

import java.math.BigDecimal;
import java.math.BigInteger;

public class MathDemo {

	public static void main(String[] args) {
		System.out.println(Math.pow(2, 3));//2的3次方
		
		BigInteger b1 = new BigInteger("123");
		BigInteger b2 = new BigInteger("123");
//		System.out.println(b1 + b2);不能直接参与运算 需要调用方法
		System.out.println(b1.add(b2));//246
		
		BigDecimal bd1 = new BigDecimal(0.2);
		BigDecimal bd2 = new BigDecimal(0.02);
		System.out.println(bd1.add(bd2));//0.2200000000000000115185638804859991068951785564422607421875
		
		BigDecimal bd3 = new BigDecimal("0.2");
		BigDecimal bd4 = new BigDecimal("0.02");
		System.out.println(bd3.add(bd4));//0.22字符相加
	}
}
