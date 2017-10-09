package cn.itsource.system;

import java.io.IOException;
import java.util.Arrays;

public class TestSysytem {

	public static void main(String[] args) throws IOException {
		long begin = System.currentTimeMillis();
		
		//有src数组11,22,33,44,55；将其22,33,44放入10个空数组的第10位
		//实现效果【0,0,0,0,0,0,0,0,0,22,33,44,0,0,0,0,0,0,0,0】
		int[] src = {11,22,33,44,55};
		int[] dest = new int[20];
		System.arraycopy(src, 1, dest, 9, 3);
		System.out.println(Arrays.toString(dest));
		
		/*两种退出JVM的方式
		System.exit(0);
		Runtime.getRuntime().exit(0);*/
		
		/*
		Runtime.getRuntime().exec("calc");
		Runtime.getRuntime().exec("notepad");
		Runtime.getRuntime().exec("WeChat");*/
		//C: Windows System32文件夹里没有包含这个WeChat的程序 
		
//		static long currentTimeMillis()返回以毫秒为单位的当前时间，用来检测性能
		System.out.println(System.currentTimeMillis());
		
//		在最开始和此处设置开始结束来测试时间，因为运算很快可能结果值为0；
		long finish = System.currentTimeMillis();
		System.out.println(finish-begin);
		
//		static Properties getProperties()获取当前系统属性
		System.out.println(System.getProperties());
	}

}
