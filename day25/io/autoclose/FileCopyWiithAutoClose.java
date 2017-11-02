package cn.itsource.io.autoclose;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyWiithAutoClose {
	
	public static void CopyFile(String src, String des) throws IOException{
		try(	FileInputStream fis = new FileInputStream(src);
				FileOutputStream fos = new FileOutputStream(des);
		){
			byte[] b = new byte[1024];
			int len = 0;
			while ((len = fis.read(b)) != -1) {//读取输入的内容
				fos.write(b, 0, len);//写入输出内容
			}
		}catch (Exception e) {
			e.printStackTrace();//抛出异常就可，不用close（）了
		}
	}
}
