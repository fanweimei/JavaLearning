package p18io;

import java.io.*;

public class MyLineNumberReader_12 {
	private Reader r;
	private int line;
	MyLineNumberReader_12(Reader r){
		this.r = r;
		this.line = 0;
	}
	public String myReaderLine() throws IOException{
		line++;
		StringBuilder sb = new StringBuilder();
		int ch = 0;
		while((ch = r.read())!= -1){
			if(ch == '\r'){
				continue;
			}else if(ch == '\n'){
				return sb.toString();
			}else {
				sb.append(ch);
			}
		}
		return sb.toString();
	}
	
	public void myclose() throws IOException {
		this.r.close();
	}
	public int getLineNumber(){
		return this.line;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
