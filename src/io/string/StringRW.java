package io.string;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringRW {

	public static void testStringWriter() {
		//StringWriter对象sw存放内容
		StringWriter sw = new StringWriter();
		//写入
		sw.write("hahaha");
		sw.append("c");
		//将sw中内容以StringBuffer输出
		System.out.println(sw.getBuffer());
		//将sw中内容以String输出
		System.out.println(sw.toString());
	}
	
	public static void testStringReader() throws IOException {
		String str = "abcd";
		StringReader sr = new StringReader(str);
		char[] strValue = new char[100]; 
		//将字符串内容读取到char[]
		sr.read(strValue);
		System.out.println(strValue[0]);
		//将字符串内容读取到stringBuffer
		//省略.....
	}
	
	public static void main(String[] args) {
		StringRW.testStringWriter();
		try {
			StringRW.testStringReader();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
