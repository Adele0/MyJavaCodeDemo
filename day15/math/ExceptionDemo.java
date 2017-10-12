package cn.itsource.math;

public class ExceptionDemo {

	public static void main(String[] args) {
//		java的异常：编译通过，运行有问题。 缺少；不属于异常，而是语法错误
//		System.out.println(1/0);//ArithmeticException算术异常
		
		/*int[] a = null;
		System.out.println(a.length);//NullPointerException空指针异常
*/		
		/*int[] a = {};
		System.out.println(a[1]);//ArrayIndexOutOfBoundsException越界异常
*/	
//		ExceptionHandle: 异常处理：
		/*System.out.println("Start");
		System.out.println(1/0);
		System.out.println("End");//不能打印因为上面代码抛出异常
		*/
		
		System.out.println("Shift加Alt加Z，可以看到添加异常的选项，试试这个快捷键");
		
		System.out.println("Start");
		try {
			System.out.println(1/0);
		} catch (Exception e) {//也可以使用具体的异常，此处可以是 ArithmeticException
			System.out.println("除数不能为零");
		}
		System.out.println("End");//解决异常后，后面代码继续执行
		System.out.println("_____________");
		
		
//		throwable设计的字段用来存放异常信息 三种方式中最后一种最常用
		try {
			System.out.println(1/0);
		} catch (Exception e) {
			System.out.println("getMessage: " + e.getMessage());
			System.out.println("toString: " + e.toString());
			e.printStackTrace();//主要用这种详细版的
//			区别printStackTrace自动打印输出，getMessage和toString手动打印
		}
		
		System.out.println("_____________________");
		
//			多异常处理
		int[] arr = {};
		divide(arr);//{}越界， arr=null空指针，arr={2,0}算术异常，所以在divide方法里写多个异常处理
		
	    System.out.println("_____________________");
		
		try {
			divide1(6, 0);//异常抛到这里可以手动选择处理或者不处理
		} catch (Exception e) {
			System.out.println("除数不能为0");
		}
		System.out.println("会执行");
		System.out.println("_____________________");
		
		try {
			System.out.println(1/0);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			System.out.println("异常也会执行");
		}
		
		System.out.println("_____________________");
		
		try {
			System.out.println(1/0);
			System.exit(0);//前面有异常，直接执行catch语句，也会执行到finally
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			System.out.println("异常也会执行");
		}
		
		System.out.println("_____________________");
		
		try {
			System.out.println(1/1);
			System.exit(0);//没有异常，执行到exit，不会执行finally
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			System.out.println("异常也会执行");
		}//加了finally后面再加try catch也不会执行了（个人实践得出结论）
	}
	
//	添加方法1 用来了解多种异常
	public static void divide(int[] arr){
		try {
			System.out.println(arr[0]/arr[1]);
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0");
		}catch (NullPointerException e) {
			System.out.println("空指针异常");
		}catch (IndexOutOfBoundsException e) {
			System.out.println("数组越界异常");
		}
	}
	
//	添加方法2 用来了解抛出
	public static void divide1(int a, int b)throws ArithmeticException,NullPointerException{
			System.out.println(a/b);//如果传入的数有问题，这里选择不解决，就抛出让上一级处理
	}
}
