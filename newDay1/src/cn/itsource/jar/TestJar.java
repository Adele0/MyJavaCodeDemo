package cn.itsource.jar;
/*
导入jar: 1. 项目新建 lib文！件！夹！方便统一管理
			 2.复制jar到lib文件夹
			 3.选择该jar，右键build Path，生成Referenced Libraries
			 要删除的话：在Referenced Libraries下的jar,右键 build Path --> remove
*/
public class TestJar {
	
	public static void main(String[] args) {
		
		String name = null;
		if (name != null && ! "".equals(name) ){
			System.out.println("没有导入某个具体的jar，在判断时需要手动判断");
		}
		
//		if (StringUtils.isBlank(name)) {	
//		}
//		System.out.println(StringUtils.isBlank(name));
		 
	}

}
