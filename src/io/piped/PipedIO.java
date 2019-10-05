package io.piped;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedIO {
	public static void main(String[] args) throws IOException {
		PipedInputStream pis = new PipedInputStream();
		PipedOutputStream pos = new PipedOutputStream();
		//input/output管道建立连接
		pis.connect(pos);
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pos.write("hello".getBytes());
				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					try {
						pos.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				int data;
				try {
					data = pis.read();
					while (data != -1) {
						System.out.print((char) data);
						data = pis.read();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					try {
						pis.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t1.start();
		t2.start();
	}
}
