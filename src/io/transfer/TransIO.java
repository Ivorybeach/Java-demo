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

//�ֽ���ת��Ϊ�ַ���
public class TransIO {
	public static void transInput(File file) throws IOException {
		InputStream fis = new FileInputStream(file);
		//outputStream --> Writer:
		//��ΪInputStreamReader�̳���Reader��������InputStreamReader�Ĺ��췽����ֱ��super()
		//�Ϳɵ���Reader�Ĺ��췽��������һ��Reader����
		//������������ֽ������ַ�����ת��
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
