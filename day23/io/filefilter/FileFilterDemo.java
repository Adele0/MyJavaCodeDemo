package cn.itsource.io.filefilter;

import java.io.File;
import java.io.FilenameFilter;

public class FileFilterDemo implements FilenameFilter{
	String suffix;
	
	public FileFilterDemo(String suffix) {
		this.suffix = suffix;
	}
	
	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith(suffix);
	}
}
