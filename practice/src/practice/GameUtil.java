package practice;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

//import java.awt.Toolkit;
//import java.io.IOException;
/**
 * ��Ϸ�����й����ࣨ����ͼƬ���أ�
 * @author ����
 *
 */
public class GameUtil {
	
	private GameUtil(){}	//������ͨ���Ὣ����˽����
	
	public static Image getImage(String path){
		BufferedImage bi = null;
		try{
			URL u = GameUtil.class.getClassLoader().getResource(path);
			bi = javax.imageio.ImageIO.read(u);
		}catch(IOException e){
			e.printStackTrace();
		}
		return bi;
//				return Toolkit.getDefaultToolkit().getImage(GameUtil.class.getClassLoader().getResource(path));
	}
}
