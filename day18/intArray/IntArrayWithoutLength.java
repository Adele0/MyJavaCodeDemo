package cn.itsource.intArray;

import java.util.Arrays;

public class IntArrayWithoutLength {
	int[] date;//不指定长度
	int size;
	
//	根据用户传的数据去创建长度
	public IntArrayWithoutLength(int length){
		date = new int[length];
	}
//	如果用户没有传入任何数据，就是用无参构造方法，给她一个默认的长度
	public IntArrayWithoutLength(){
		this(10);
	}
	
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
