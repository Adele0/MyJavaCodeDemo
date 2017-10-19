package cn.itsource.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTraversalByIterable {

	public static void main(String[] args) {
	
		ArrayList idols = new ArrayList();
		idols.add("Tamaki");
		idols.add("Mamoru");
		idols.add("Masato");
		idols.add("Takashi");
		
//		使用iterator迭代器，让array实现iterable
		Iterator iterator = idols.iterator();
		//System.out.println(iterator.next());从tamaki开始，超过范围就不起作用了
		
//		循环输出一次
		/*while(iterator.hasNext()){
			System.out.println(iterator.next());打印的时候，是换行依次打印
		}
		这是一个单向迭代器。两个while时，第一个while遍历完了，第二个while就不进入了*/
		
		
		while (iterator.hasNext()) {//有下一个就循环打印
//			System.out.println(iterator.next());
			if ("Masato".equals(iterator.next())) {
				iterator.remove();//将masato在迭代器里移除
			}
		}
		System.out.println(idols);//打印idols
		
//		引入双向迭代器
		ListIterator listIterator = idols.listIterator();
		while(listIterator.hasNext()){//正向遍历
			System.out.println(listIterator.next());
		}
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());//反向输出
		}
	}

}
