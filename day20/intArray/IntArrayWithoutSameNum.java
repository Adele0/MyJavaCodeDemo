package cn.itsource.intArray;

import java.util.Arrays;

public class IntArrayWithoutSameNum {
	Object[] date;
	int size;
	
	public IntArrayWithoutSameNum(int length){
		date = new Object[length];
	}
	
	public IntArrayWithoutSameNum(){
		this(10);
	}
	
	
	public void add(Object i){
//		不允许添加重复的数字，首先使用判断语句
		for (int j = 0; j < size; j++) {
			if (date[j].equals(i)) {
				return;
			}
		}
		
		
//		判断是否超出长度
		if (size == date.length) {
//			如果超出长度，创建新的数组（新数组是原数组2倍，或者其他）
			Object[] newArr = new Object[2*size];
//			把超出长度的数组放入新的数组中
			System.arraycopy(date, 0, newArr, 0, size);
//			更新数组
			date = newArr;
		}
		date[size] = i;
		size++;
	}


	public int getSize() {
		return size;
	}
	
	@Override
	public String toString() {
		Object[] dest = new Object[size];//长度是传入数的目标数组
		System.arraycopy(date, 0, dest, 0, size);
		return Arrays.toString(dest);
	}
}
