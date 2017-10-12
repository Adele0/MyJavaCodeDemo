package cn.itsource.math;

import java.util.Random;

public class VerificationCode {

	public static void main(String[] args) {
		String string = "";
		for (int i = 0; i < 6; i++) {
			string += getOne();
		}
		System.out.println(string);
	}
	public static String getOne() {
		String string = "1234567890zxcvbnm,asdfghjkl;qwertyuiop[";
		int index = new Random().nextInt(string.length());
		char c = string.charAt(index);
		return c+"";
	}
}
