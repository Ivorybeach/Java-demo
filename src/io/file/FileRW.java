package io.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRW {

	public static void TestFileWriter(File file) throws IOException {
		//����ļ������ڣ�����֮
		if (!file.exists()) {
			file.createNewFile();
		}else {
			FileWriter fw = new FileWriter(file,true);
			System.out.println(fw.getEncoding());
			fw.write("�Ű�֥\n"+"�¹�ϣ\n"+"л����\n");
			fw.flush();
			fw.close();
		}
	}
	
	public static void TestFileReader(File file) throws IOException {
		if (!file.exists()) {
			file.createNewFile();
		}
		FileReader fr = new FileReader(file);
		//��ȡ�����ַ���������귵��-1
		//fr.read();
		char[] content = new char[100];
		fr.read(content);
		System.out.println(new String(content));
		fr.close();
	}
	
	public static void main(String[] args) {
		File file = new File("H:\\workspace3\\io\\test2.txt");
		//д��
		try {
			FileRW.TestFileWriter(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//��ȡ
		try {
			FileRW.TestFileReader(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
