package cn.itsource.hash;

import java.util.HashSet;

public class TestOverrideHashSet {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		Student s1 = new Student("Xu", 6);
		Student s2 = new Student("Xu", 6);
		hs.add(s1);
		hs.add(s2);
		System.out.println("覆写前："+s1.equals(s2));//false
		System.out.println("覆写前："+s1.hashCode());//366712642
		System.out.println("覆写前："+s2.hashCode());//1829164700
		System.out.println("覆写前："+hs.size());//2
		System.out.println("--------------------------");
		
		
//		如果我们需要，当名字和年纪相同时，就认为是同一个的情况下，应该覆写hashCode和equals
		HashSet hs1 = new HashSet();
		OverrideStudent s3 = new OverrideStudent("Xu", 6);
		OverrideStudent s4 = new OverrideStudent("Xu", 6);
		hs1.add(s3);
		hs1.add(s4);
		System.out.println("覆写后："+s3.equals(s4));//true
		System.out.println("覆写后："+s3.hashCode());//2851
		System.out.println("覆写后："+s4.hashCode());//2851
		System.out.println("覆写后："+hs1.size());//1
		System.out.println("--------------------------");
		
		
//		未覆写toString的时候，打印为地址
		System.out.println("覆写前："+hs);//[cn.itsource.hash.Student@15db9742, cn.itsource.hash.Student@6d06d69c]
		System.out.println("覆写后："+hs1);//[Xu-6]
		
//		如果有多个不同的值，将会发现，删除重复后，打印结果无顺序。(hashSet无序)
		System.out.println("--------------------------");
		HashSet hs2 = new HashSet();
		GenerateOverrideStudent gos = new GenerateOverrideStudent("xiaoYu", 18);
		GenerateOverrideStudent gos1 = new GenerateOverrideStudent("xiaoYu", 18);
		GenerateOverrideStudent gos2 = new GenerateOverrideStudent("xiaoLi", 20);
		GenerateOverrideStudent gos3 = new GenerateOverrideStudent("xiaoLi", 20);
		GenerateOverrideStudent gos4 = new GenerateOverrideStudent("xiaoGu", 90);
		GenerateOverrideStudent gos5 = new GenerateOverrideStudent("xiaoGu", 90);
		hs2.add(gos);
		hs2.add(gos1);
		hs2.add(gos2);
		hs2.add(gos3);
		hs2.add(gos4);
		hs2.add(gos5);
		System.out.println("使用eclipse的自动的生成的覆写hashCode和override： "+hs2);
	}

}
