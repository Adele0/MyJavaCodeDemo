package cn.itsource.generic;

import java.util.ArrayList;

public class GenericDemo {

	public static void main(String[] args) {
		// 泛型应用：<指定数组类型>，在实际使用的时候才决定泛型的具体类型
//		也可以理解为：“参数化类型”
//		泛型主要使用在集合里
		ArrayList<Student> aList = new ArrayList<>();
		aList.add(new Student());//代码提示会提示类型，未指定是Object
		aList.add(new Student());//指定具体类型，默认类型被擦除
		
//		泛型嵌套：例如<Entry<String,Integer>>
		
/*		<?> 表示通配符，不确定类型 <? extends Object>
 		<? extends Number> 表示必须是Number及Number的子类。 上限
 		<? super Number> 表示必须是Number及Number的父类。下限
*/	
		}
}
class Student{}