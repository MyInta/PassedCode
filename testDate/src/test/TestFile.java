package test;

import java.io.File;
import java.io.IOException;

/**
 * 
 * @author ����
 *
 */
public class TestFile {
	public static void main(String[] args) {
		File f = new File("F:/��Ƶ��ѧ/JAVA��ѧ");
		File f2 = new File("F:/��Ƶ��ѧ");
		File f3 = new File(f,"68_11_12.txt");
		File f4 = new File(f,"71_11_12.txt");
		
		f4.delete();
//		try {
//			f4.createNewFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		if(f3.isFile()){
			System.out.println("���Ǹ��ļ�");
		}
		if(f2.isDirectory()){
			System.out.println("���Ǹ�Ŀ¼");
		}else{
			System.out.println("������Ŀ¼");
		}
	}
}
