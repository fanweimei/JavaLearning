package servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException{
		ServerSocket ss = new ServerSocket(9000);
		Socket sock = ss.accept();
		
		FileInputStream in = new FileInputStream("resource/1.html");
		OutputStream out = sock.getOutputStream();
		int len = 0;
		byte[] buffer = new byte[1024];
		while((len = in.read())>0){
			out.write(buffer,0,len);
		}
		in.close();
		out.close();
		sock.close();
		ss.close();
	}

}
