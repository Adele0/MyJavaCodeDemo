package cn.itsource.intArray;

import java.util.Arrays;

public class IntArray {
	int[] date = new int[5];//定义一个数组
	int size;//定义表示数组的长度的位置
	
	public void add(int i){
		date[size] = i;//给数组赋值
		size++;
	}
//	提供一个方法，返回数组大小
	public int getSize() {
		return size;
	}
	
	@Override
	public String toString() {
		int[] dest = new int[size];//长度是传入数的目标数组
		System.arraycopy(date, 0, dest, 0, size);
		return Arrays.toString(dest);
	}
}
