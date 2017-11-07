package cn.itsource.regularExpression;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class TestRegexOnWords {

	public static void main(String[] args) throws IOException {
//		测试
		HashMap hp = query("F:\\dazigou\\STUDY\\EclipseWorkspace\\Day12\\src\\cn\\itsource\\day12\\demo\\CustomizedCalcutor.java");
		System.out.println(hp);//上面使用ctrl f 全部替换
	}
	
	
	
//	query()是用来统计单词出现的次数的
	public static HashMap query(String filename) throws IOException {
		
		HashMap hp = new HashMap();//新建hashmap用来存放单词和出现次数的对应关系
		
		BufferedReader br = new BufferedReader(new FileReader(filename));//新建输入流读取文件，bufferedReader有readLine()
		
		String line = "";
		while ((line = br.readLine()) != null ) {
//			将读取的每一行数据用指定的delimiter来调用split（），从而得到的就是一个一个的单词
			String[] words = line.split("[^a-zA-Z]");//将不是大小写字母的内容分割
			
			for (String word : words) {//循环取出单词集合中的每个单词
				if (word.length() > 0) {//首先要有单词
					
					if (hp.containsKey(word)) {//如果不是第一次出现
						Integer oldValue = (Integer) hp.get(word);//通过该单词get（）对应的value值，作为原value值
						hp.put(word, oldValue+1);
					}else {//如果是第一次出现
						hp.put(word, 1);//将该单词放到hashMap的key位置，此时value值为1
					}
				}
			}
		}
		return hp;//返回改hp
	}
}
