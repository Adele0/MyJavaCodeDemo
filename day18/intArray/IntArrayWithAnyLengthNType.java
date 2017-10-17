package cn.itsource.intArray;

import java.util.Arrays;

public class IntArrayWithAnyLengthNType {
	Object[] date;
	int size;
	
	public IntArrayWithAnyLengthNType(int length){
		date = new Object[length];
	}
	public IntArrayWithAnyLengthNType(){
		this(10);
	}
	public void add(Object i){
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
//	提供方法：查找指定索引处的值
	public Object getElementByIndex(int index) {
//		为了避免因为超出长度的index出现，应抛出异常给予提示
		if (0 > index || index > size) {
			throw new ArrayIndexOutOfBoundsException("长度有误！");
		}
		return date[index];
	}
	
//	提供方法：查找某值第一次出现的索引位置
	public int getFirstIndexByElement(Object obj) {
		for (int i = 0; i < size; i++) {
			if (date[i].equals(obj)) {//为避免遇到null.equals的出现，date[i]常量放在前面
				return i;//两值相等返回i索引对应的值
			}
		}
		return -1;//遍历数组均为找到该值，-1异常；
	}
	
//	提供方法：删除某索引位置的值
	public void deleteElementByIndex(int index) {
		System.arraycopy(date, index+1, date, index, size-index-1);
		size--;//大小要变否则多余的空格会被自动填充
	}
	
//	提供方法：删除某元素第一次出现的索引
/*	调用第一次出现的方法
	调用删除索引值的方法*/
	public void deleteFirstElement(Object obj) {
		int firstIndex = getFirstIndexByElement(obj);
		deleteElementByIndex(firstIndex);
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
