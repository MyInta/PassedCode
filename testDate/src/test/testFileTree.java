package test;

import java.io.File;

/**
 * ���Դ�ӡĿ¼��״�ṹ
 * @author ����
 *
 */
public class testFileTree {
	public static void main(String[] args) {
		File f = new File ("f:/��Ƶ��ѧ");
		printFile(f,0);
	}
	
	static void printFile(File file,int level){
		for(int i = 0;i<level;i++){
			System.out.print("-");
		}
		System.out.println(file.getName());
		
		if(file.isDirectory()){
			File[] files = file.listFiles();
			for(File temp:files){
				printFile(temp,level+1);
			}
		}
	}
}
