package util;

import java.awt.Image;
import java.awt.Toolkit;
/**
 * ��Ϸ�����й����ࣨ����ͼƬ���أ�
 * @author ����
 *
 */
public class GameUtil {
	
	private GameUtil(){}	//������ͨ���Ὣ����˽����
	
	public static Image getImage(String path){
//		
		return Toolkit.getDefaultToolkit().getImage(GameUtil.class.getClassLoader().getResource(path));
	}
}
