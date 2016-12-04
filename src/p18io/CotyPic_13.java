package p18io;
/*�ֽ�����FileInputStream��FileOutputStream ���ڴ���ý���ļ�
 * ����һ��ͼƬ
 * ˼·��
 * 1.���ֽڶ�ȡ�������ͼƬ����
 * 2.���ֽ�д�������󴴽�һ��ͼƬ�ļ������ڴ洢��ȡ����ͼƬ����
 * 3.ͨ��ѭ����д��������ݵĴ洢��
 * 4.�ر���Դ��
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
