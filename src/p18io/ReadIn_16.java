package p18io;
/*
 * ��ȡ����¼��
 */
import java.io.*;
public class ReadIn_16 {

	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		int by = in.read();
		System.out.println((char)by);
	}

}
