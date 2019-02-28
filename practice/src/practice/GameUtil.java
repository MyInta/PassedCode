package practice;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

//import java.awt.Toolkit;
//import java.io.IOException;
/**
 * 游戏开发中工具类（比如图片加载）
 * @author 银涛
 *
 */
public class GameUtil {
	
	private GameUtil(){}	//工具类通常会将构造私有了
	
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
