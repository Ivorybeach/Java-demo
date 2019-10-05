package io.buffer;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferIO {

	public static void testBufferInput(File file) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		byte[] content = new byte[100];
		bis.read(content);
		bis.close();
		System.out.println(new String(content));
	}
	
}
