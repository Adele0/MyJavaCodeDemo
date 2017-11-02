package cn.itsource.io.autoclose;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyWithTry {
	
	public static  void  CopyFileWithTry(String src, String des) throws IOException{
		
		FileInputStream fis = null;//先定义空值
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(src);//新建输入放在try里，close会读不到
			fos = new FileOutputStream(des);//新建输出放在try里，close会读不到
			byte[] b = new byte[1024];
			int len = 0;
			while ((len = fis.read(b)) != -1) {//读取输入的内容
				fos.write(b, 0, len);//写入输出内容
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {//finally才能最终无论如何都能执行得到
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
			fis.close();
		}
//			try catch 解决了问题 但是太复杂，1.7以后引入autoClose
		}	
	}
}
