package solar;

import java.awt.Graphics;
import java.awt.Image;

import util.Constant;
import util.GameUtil;
import util.MyFrame;

/**
 * 太阳系的主窗口
 * @author 银涛
 *
 */
public class SolarFrame extends MyFrame{
	Image bg = GameUtil.getImage("images/QQ图片20140727000929.jpg");	//加载了背景
	Star sun = new Star("images/星系01-1.jpg", Constant.GAME_WIDTH/2, Constant.GAME_HEIGHT/2);
	planet earth = new planet("images/星系02-1.png", 150, 100, 0.1, sun);
	planet moon = new planet("images/星系04-1.jpg", 30, 40, 0.3, earth,true);
	planet Mars = new planet("images/星系03-1.jpg", 200, 130, 0.2, sun);
	
	
	public void paint(Graphics g){
		g.drawImage(bg, 0, 0, null);
		sun.draw(g);
		earth.draw(g);
		Mars.draw(g);
		moon.draw(g);
	}
	
	public static void main(String[] args){
		new SolarFrame().launchFrame();
	}
}
