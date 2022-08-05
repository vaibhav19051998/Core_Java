package com.cg.lambadaexpression;

import java.io.File;
import java.io.FileFilter;

public class FileFilterProgram {

	public static void main(String[] args) {
		FileFilter F=(File pathname)-> pathname.getName().endsWith(".css");
		File dir=new File("C:\\Users\\Anuja\\Documents");
		File[] contents=dir.listFiles(F);
		for(File n:contents)
		{
			System.out.println(n);
		}
	}

}
