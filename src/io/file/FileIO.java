package io.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileIO {
	
	//FileInputStream，读出
	public static void testFIS(File file) throws IOException {
		FileInputStream fis = new FileInputStream(file);
		// 字符数组，存放数据
		byte[] content = new byte[1024];
		// 如果文件存在，读取到字符数组中
		if (file.exists()) {
			fis.read(content);
		}
		System.out.println(new String(content));
		//read()读取下一个byte,如果到达最后返回-1
		fis.read();
		//关闭流，释放资源
		fis.close();
	}
	
	//FileOutputStream,写入
	public static void testOPS(File file) throws IOException {
		if (file.exists()) {
			//boolean true，true从末尾写入
			FileOutputStream fos = new FileOutputStream(file,true);
			String content = "haha--hehe--heihei--xixi";
			fos.write(content.getBytes());
			//清空缓存区
			fos.flush();
			//关闭流，释放资源
			fos.close();
		}
	}
	
	public static void main(String[] args) throws IOException {
		// 获取文件
		File file = new File("H:" + File.separator + "workspace3" + File.separator + "io" + File.separator + "test.txt");
		//FileOutputStream，写入文件
		FileIO.testOPS(file);
		//FileInputStream,读取文件
		FileIO.testFIS(file);
	}
}
