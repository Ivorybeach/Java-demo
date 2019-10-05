package io.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRW {

	public static void TestFileWriter(File file) throws IOException {
		//如果文件不存在，创建之
		if (!file.exists()) {
			file.createNewFile();
		}else {
			FileWriter fw = new FileWriter(file,true);
			System.out.println(fw.getEncoding());
			fw.write("张柏芝\n"+"陈冠希\n"+"谢霆锋\n");
			fw.flush();
			fw.close();
		}
	}
	
	public static void TestFileReader(File file) throws IOException {
		if (!file.exists()) {
			file.createNewFile();
		}
		FileReader fr = new FileReader(file);
		//读取单个字符，如果读完返回-1
		//fr.read();
		char[] content = new char[100];
		fr.read(content);
		System.out.println(new String(content));
		fr.close();
	}
	
	public static void main(String[] args) {
		File file = new File("H:\\workspace3\\io\\test2.txt");
		//写入
		try {
			FileRW.TestFileWriter(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//读取
		try {
			FileRW.TestFileReader(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
