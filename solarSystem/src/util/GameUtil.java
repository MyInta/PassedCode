package util;

import java.awt.Image;
import java.awt.Toolkit;
/**
 * 游戏开发中工具类（比如图片加载）
 * @author 银涛
 *
 */
public class GameUtil {
	
	private GameUtil(){}	//工具类通常会将构造私有了
	
	public static Image getImage(String path){
//		
		return Toolkit.getDefaultToolkit().getImage(GameUtil.class.getClassLoader().getResource(path));
	}
}
