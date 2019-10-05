package io.transfer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

//字节流转换为字符流
public class TransIO {
	public static void transInput(File file) throws IOException {
		InputStream fis = new FileInputStream(file);
		//outputStream --> Writer:
		//因为InputStreamReader继承了Reader，所以在InputStreamReader的构造方法中直接super()
		//就可调用Reader的构造方法，创建一个Reader出来
		//这样就完成了字节流到字符流的转换
		Reader fr = new InputStreamReader(fis);
	}
	
	public static void transOutput(File file) throws IOException {
		FileOutputStream fos = new FileOutputStream(file);
		//outputStream --> Writer
		Writer fw = new OutputStreamWriter(fos);
	}
	
	public static void main(String[] args) throws IOException {
		File file = new File("d:/test.txt");
		TransIO.transInput(file);
		TransIO.transOutput(file);
	}
}
