package cn.itsource.math;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class RandomDemo {

	public static void main(String[] args) {
		System.out.println(Math.random());//math.random [0.0,1.0)
		
		System.out.println(new Random().nextInt());//整个int范围
		
		System.out.println(new Random().nextInt(100));//【0，n）n必须为正数
		
		System.out.println(ThreadLocalRandom.current().nextInt(10, 30));//【m，n）划定取值范围
		
		System.out.println(UUID.randomUUID());//【m，n）划定取值范围
	}
}
