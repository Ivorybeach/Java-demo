package io.file;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		// 对象file代表test.txt文件,""内为pathname
		// File file = new File("H:\\workspace3\\io\\test.txt");
		// 不把分割符写死，便于在win/unix上移植
		File file = new File(
				"H:" + File.separator + "workspace3" + File.separator + "io" + File.separator + "test.txt");
		System.out.println("H:" + File.separator + "workspace3" + File.separator + "io" + File.separator + "test.txt");
		try {
			// 创建test.txt
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 文件是否存在
		System.out.println(file.exists());
		// 是否可读
		System.out.println(file.canRead());
		// 文件所在目录
		System.out.println(file.getParent());
		// 文件绝对路径,absolute name
		System.out.println(file.getAbsolutePath());
		// 文件所在目录，通俗理解，返回File()构造方法中的路径
		System.out.println(file.getPath());
		// 判断abstract pathname是否为绝对路径
		System.out.println(file.isAbsolute());
		// 列出同级文件，如果abstract pathname不是目录，返回null
		file.list();
		// 获取filesystem roots：C:\ D:\ E:\
		file.listRoots();
		// 创建目录
		file.mkdir();
		// 创建目录，包括不存在的父目录
		file.mkdirs();
		// 删除文件
		// file.delete();

		System.out.println(File.separator);
		System.out.println(File.pathSeparator);
		System.out.println(File.separatorChar);
	}
}
