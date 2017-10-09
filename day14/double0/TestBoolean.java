package cn.itsource.double0;

public class TestBoolean {

	public static void main(String[] args) {
		Boolean boolean1 = new Boolean(true);
		System.out.println(boolean1);
		
		Boolean boolean2 = new Boolean(True);//只要是true不论大小写，均true
		System.out.println(boolean2);
		
		Boolean boolean3 = new Boolean(tRu);//只要不是true就是false
		System.out.println(boolean3);
		
	}

}
