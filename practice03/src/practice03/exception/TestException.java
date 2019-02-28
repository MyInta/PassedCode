package practice03.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException {
	public static void main(String[] args) {
		FileReader reader = null;
		try{
		reader = new FileReader("f:/视频教学/JAVA教学/73_11_13.txt");
		char c = (char)reader.read();
		char c2 = (char)reader.read();
//		System.out.println(c);
		System.out.println(""+c+c2);	//加字符串相连
		
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(reader!=null){
					reader.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
