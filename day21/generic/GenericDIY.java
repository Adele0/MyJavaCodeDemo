package cn.itsource.generic;

public class GenericDIY {

	public static void main(String[] args) {
/*		 定义泛型 class/interface类/接口 <泛型符号>{
		         泛型的符号   方法 （）
		 }
		 泛型符号： T---Type; E---Element; K---Key; V---Value
*/
		MyArray<String> sArray = new MyArray<String>(2);
		sArray.add("wo");	
//		sArray.add(1);	因为已经定义为String此处添加其他类型报错
//		sArray.add(1);删掉<String>可以添加其他类型
		}

}

class MyArray<T>{//定义泛型
	Object[] data;
	int size;
	public MyArray(int length){
		data = new Object[length];
	}
	
	public void add(T i) {//在方法里使用泛型
		if (size == data.length) {
			Object[] newArr = new Object[2*size];
			System.arraycopy(data,0,newArr,0,size);
			data = newArr;
		}
		data[size] = i;
		size++;
	}
}