package test;

import java.io.File;
import java.io.IOException;

/**
 * 
 * @author 银涛
 *
 */
public class TestFile {
	public static void main(String[] args) {
		File f = new File("F:/视频教学/JAVA教学");
		File f2 = new File("F:/视频教学");
		File f3 = new File(f,"68_11_12.txt");
		File f4 = new File(f,"71_11_12.txt");
		
		f4.delete();
//		try {
//			f4.createNewFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		if(f3.isFile()){
			System.out.println("这是个文件");
		}
		if(f2.isDirectory()){
			System.out.println("这是个目录");
		}else{
			System.out.println("他不是目录");
		}
	}
}
