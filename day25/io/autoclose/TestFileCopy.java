package cn.itsource.io.autoclose;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileCopy {
	
		public static void main(String[] args) throws IOException {
//			FileCopy.CopyFile("BeforeCopyByJava", "AfterCopyByJava");//调用方法
//			FileCopyWithTry.CopyFileWithTry("BeforeCopyByJava", "AfterCopyByJava");//调用方法
			FileCopyWiithAutoClose.CopyFile("BeforeCopyByJava", "AfterCopyByJava");//调用方法
		}
}	


