package io.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileIO {
	
	//FileInputStream������
	public static void testFIS(File file) throws IOException {
		FileInputStream fis = new FileInputStream(file);
		// �ַ����飬�������
		byte[] content = new byte[1024];
		// ����ļ����ڣ���ȡ���ַ�������
		if (file.exists()) {
			fis.read(content);
		}
		System.out.println(new String(content));
		//read()��ȡ��һ��byte,���������󷵻�-1
		fis.read();
		//�ر������ͷ���Դ
		fis.close();
	}
	
	//FileOutputStream,д��
	public static void testOPS(File file) throws IOException {
		if (file.exists()) {
			//boolean true��true��ĩβд��
			FileOutputStream fos = new FileOutputStream(file,true);
			String content = "haha--hehe--heihei--xixi";
			fos.write(content.getBytes());
			//��ջ�����
			fos.flush();
			//�ر������ͷ���Դ
			fos.close();
		}
	}
	
	public static void main(String[] args) throws IOException {
		// ��ȡ�ļ�
		File file = new File("H:" + File.separator + "workspace3" + File.separator + "io" + File.separator + "test.txt");
		//FileOutputStream��д���ļ�
		FileIO.testOPS(file);
		//FileInputStream,��ȡ�ļ�
		FileIO.testFIS(file);
	}
}
