package cn.itsource.io.file;

public class Recursion {

	public static void main(String[] args) {
/*		斐波拉契数列
		f(0)---0
		f(1)---1
		f(2)---f(1)+f(0)
		f(3)---f(2)+f(1)
		。。。。。。
		f(n)---f(n-1)+f(n-2)(n>=2)   */
		
		System.out.println(f(0)); //0
		System.out.println(f(1)); //1
		System.out.println(f(2)); //1
		System.out.println(f(3)); //2
		System.out.println(f(4)); //3
		System.out.println(f(5)); //5
		System.out.println(f(8)); //21
		System.out.println(f(10)); //55
		System.out.println(f(11)); //89
	}
	

	//	定义一个f(n)方法,让方法自己调用自己
	public static int f(int n) {
		if (n == 0) {
			return 0;
		}else if (n == 1) {
			return 1;
		}else {
			return f(n-1)+f(n-2);
		}
	}
	
	
/* public static void main(String[] args) {
	main(args);如果主方法调用主方法，会出现堆栈溢出
	StackOverFlowError						}	
	*/
}
