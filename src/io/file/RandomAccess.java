package io.file;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess {

	//如果在写入时不覆盖原来数据
	//可以获取文件长度，将pointer设为文件长度
	//在写入时从文件末尾开始
	
	public static void randomAccessFile() throws IOException {
		File file = new File("H:" + File.separator + "workspace3" + File.separator + "io" + File.separator + "test4.txt");
		//创建文件，rw读写，r只读，rws,rwd
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		String str = "haha hehe heihei xixi 张柏芝 陈冠希 谢霆锋 1 2 3";
		//写入,写入byte数组不会中文乱码，写入string出现乱码
		raf.write(str.getBytes());
		//文件长度
		System.out.println("file-length::"+raf.length());
		//设置pointer
		raf.seek(10);
		//获取pointer
		System.out.println("point ::"+raf.getFilePointer());
		byte[] content = new byte[1024];
		//从pointer位置开始读取
		raf.read(content);
		System.out.println("content:::"+new String(content));
		//读取文件后的pointer位置
		System.out.println(raf.getFilePointer());
		
	}
	public static void main(String[] args) throws IOException {
		RandomAccess.randomAccessFile();
	}
}
