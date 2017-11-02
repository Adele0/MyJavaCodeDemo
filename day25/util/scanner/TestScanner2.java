package cn.itsource.util.scanner;

import java.util.Scanner;

public class TestScanner2 {

	public static void main(String[] args) {
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println(scanner1.nextLine()); //以一行 为单位,不论该行有多少空格。直接打印。
		
		Scanner scanner3 = new Scanner("Scanner里面还允许从字符串中读取，遇到空格 后面的内容不见了");
//		System.out.println(scanner3.next());
		
//		更改delimiter，从默认的空格变成，
		scanner3.useDelimiter(",");//区分中英文，字符串中使用的是中文，更改delimiter的时候用的是英文,
		System.out.println(scanner3.next());
	}

}
