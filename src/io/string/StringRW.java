package io.string;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringRW {

	public static void testStringWriter() {
		//StringWriter����sw�������
		StringWriter sw = new StringWriter();
		//д��
		sw.write("hahaha");
		sw.append("c");
		//��sw��������StringBuffer���
		System.out.println(sw.getBuffer());
		//��sw��������String���
		System.out.println(sw.toString());
	}
	
	public static void testStringReader() throws IOException {
		String str = "abcd";
		StringReader sr = new StringReader(str);
		char[] strValue = new char[100]; 
		//���ַ������ݶ�ȡ��char[]
		sr.read(strValue);
		System.out.println(strValue[0]);
		//���ַ������ݶ�ȡ��stringBuffer
		//ʡ��.....
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
