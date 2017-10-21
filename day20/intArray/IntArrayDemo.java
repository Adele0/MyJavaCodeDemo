package cn.itsource.intArray;

public class IntArrayDemo {

	public static void main(String[] args) {
	
		
//		不允许重复出现，需要在add方法里循环判断是否相等，一旦相当就直接return相当于结束
		IntArrayWithoutSameNum iawL = new IntArrayWithoutSameNum(20);//如果定义了长度20，未定义即为无参中的数
		iawL.add(16);
		iawL.add(18);
		iawL.add(17);
		iawL.add(18);
		iawL.add(17);
		iawL.add(19);
		System.out.println(iawL.getSize());
		System.out.println(iawL);

	}
}
