package cn.itsource.io.autoclose;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void CopyFile(String src, String des) throws IOException{
		FileInputStream fis = new FileInputStream(src);//新建输入
		FileOutputStream fos = new FileOutputStream(des);//新建输出
		
		byte[] b = new byte[1024];
		int len = 0;
		while ((len = fis.read(b)) != -1) {//读取输入的内容
			fos.write(b, 0, len);//写入输出内容
		}
		
		fos.close();//写入先结束
		fis.close();//读出后结束
//		这里的问题是close()有漏洞不一定能正常关闭，引入try catch
	}
}


		

