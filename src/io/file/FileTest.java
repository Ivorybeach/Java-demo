package io.file;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		// ����file����test.txt�ļ�,""��Ϊpathname
		// File file = new File("H:\\workspace3\\io\\test.txt");
		// ���ѷָ��д����������win/unix����ֲ
		File file = new File(
				"H:" + File.separator + "workspace3" + File.separator + "io" + File.separator + "test.txt");
		System.out.println("H:" + File.separator + "workspace3" + File.separator + "io" + File.separator + "test.txt");
		try {
			// ����test.txt
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// �ļ��Ƿ����
		System.out.println(file.exists());
		// �Ƿ�ɶ�
		System.out.println(file.canRead());
		// �ļ�����Ŀ¼
		System.out.println(file.getParent());
		// �ļ�����·��,absolute name
		System.out.println(file.getAbsolutePath());
		// �ļ�����Ŀ¼��ͨ����⣬����File()���췽���е�·��
		System.out.println(file.getPath());
		// �ж�abstract pathname�Ƿ�Ϊ����·��
		System.out.println(file.isAbsolute());
		// �г�ͬ���ļ������abstract pathname����Ŀ¼������null
		file.list();
		// ��ȡfilesystem roots��C:\ D:\ E:\
		file.listRoots();
		// ����Ŀ¼
		file.mkdir();
		// ����Ŀ¼�����������ڵĸ�Ŀ¼
		file.mkdirs();
		// ɾ���ļ�
		// file.delete();

		System.out.println(File.separator);
		System.out.println(File.pathSeparator);
		System.out.println(File.separatorChar);
	}
}
