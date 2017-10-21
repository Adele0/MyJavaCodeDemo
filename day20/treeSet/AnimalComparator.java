package cn.itsource.treeSet;
//	定制排序（比较器），比较compare(Object o1, Object o2),返回0则相等
import java.util.Comparator;

public class AnimalComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// 比较传入动物
		Animal a1 = (Animal)o1;
		Animal a2 = (Animal)o2;
		if (a1.getAge() == a2.getAge()) {
//			return 0;仅仅比较年纪才用
			return a1.getType().compareTo(a2.getType());
		}else if (a1.getAge() > a2.getAge()) {
			return -1;//只比较age时，数字大的在左边
		}else {
			return 1;//只比较age时，数字小的在右边
		}
		
	}

}
