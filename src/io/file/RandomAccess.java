package io.file;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess {

	//�����д��ʱ������ԭ������
	//���Ի�ȡ�ļ����ȣ���pointer��Ϊ�ļ�����
	//��д��ʱ���ļ�ĩβ��ʼ
	
	public static void randomAccessFile() throws IOException {
		File file = new File("H:" + File.separator + "workspace3" + File.separator + "io" + File.separator + "test4.txt");
		//�����ļ���rw��д��rֻ����rws,rwd
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		String str = "haha hehe heihei xixi �Ű�֥ �¹�ϣ л���� 1 2 3";
		//д��,д��byte���鲻���������룬д��string��������
		raf.write(str.getBytes());
		//�ļ�����
		System.out.println("file-length::"+raf.length());
		//����pointer
		raf.seek(10);
		//��ȡpointer
		System.out.println("point ::"+raf.getFilePointer());
		byte[] content = new byte[1024];
		//��pointerλ�ÿ�ʼ��ȡ
		raf.read(content);
		System.out.println("content:::"+new String(content));
		//��ȡ�ļ����pointerλ��
		System.out.println(raf.getFilePointer());
		
	}
	public static void main(String[] args) throws IOException {
		RandomAccess.randomAccessFile();
	}
}
