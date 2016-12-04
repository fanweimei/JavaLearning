package p18io;
/*
 * 模拟BufferedInputStream
 */
import java.io.*;

public class MyBufferedInputStream_15 {
	private byte[] buf = new byte[1024];
	private int pos = 0;
	private int count = 0;
	private InputStream in;
	MyBufferedInputStream_15(InputStream in){
		this.in = in;
	}
	public int myRead() throws IOException{
		if(count == 0){
			count = in.read(buf);
			pos = 0;
			if(count == -1){
				return -1;
			}
			byte b = buf[pos];
			pos++;
			count--;
			return b&0xff; //只截取后八位
		}else if(count>0)
		{
			byte b = buf[pos];
			pos++;
			count--;
			return b&0xff; //只截取后八位
		}
		return -1;
	}
	public void myClose() throws IOException{
		in.close();
	}

	public static void main(String[] args) throws IOException {
		// 测试
		MyBufferedInputStream_15 bis  = null;
		BufferedOutputStream bos = null;
		try {
			bis = new MyBufferedInputStream_15(new FileInputStream("resource/1.mp3"));
			bos = new BufferedOutputStream(new FileOutputStream("resource/1_copy2.mp3"));
			int by = 0;
			while((by = bis.myRead())!=-1){
				bos.write(by);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bis.myClose();
			bos.close();
		}


	}

}
