package p18io;
/*
 * ����mp3
 * ͨ�������� BufferedInputStream��BuffererOutputStream
 */
import java.io.*;

public class CopyMp3_14 {

	public static void main(String[] args) throws IOException {
		BufferedInputStream bis  = null;
		BufferedOutputStream bos = null;
		try {
			bis = new BufferedInputStream(new FileInputStream("resource/1.mp3"));
			bos = new BufferedOutputStream(new FileOutputStream("resource/1_copy.mp3"));
			int by = 0;
			while((by = bis.read())!=-1){
				bos.write(by);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bis.close();
			bos.close();
		}
		

	}

}
