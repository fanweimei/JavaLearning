package p18io;
/*字节流：FileInputStream和FileOutputStream 用于处理媒体文件
 * 复制一个图片
 * 思路：
 * 1.用字节读取流对象和图片关联
 * 2.用字节写入流对象创建一个图片文件，用于存储获取到的图片数据
 * 3.通过循环读写，完成数据的存储。
 * 4.关闭资源。
 */
import java.io.*;
public class CotyPic_13 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("resource/ff2.jpg");
			fos = new FileOutputStream("resource/ff.jpg");
			byte[] buf = new byte[1024];
			int len = 0;
			while((len = fis.read(buf))!=-1){
				fos.write(buf,0,len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			fis.close();
			fos.close();
		}

	}

}
