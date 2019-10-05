package io.buffer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferRW {

	public static void TestBufferWriter(File file) throws IOException {
		BufferedReader bd = new BufferedReader(new FileReader(file));
		//读一行
		System.out.println("我是读一行："+bd.readLine());
		char[] content = new char[102];
		bd.read(content);
		System.out.println(new String(content));
		bd.close();
	}

	public static void TestBufferReader() {
		
		
	}
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("H:" + File.separator + "workspace3" + File.separator + "io" + File.separator + "test2.txt");
		//BufferRW.TestBufferReader(file);
		BufferRW.TestBufferWriter(file);
	}
}
