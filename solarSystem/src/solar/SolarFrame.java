package solar;

import java.awt.Graphics;
import java.awt.Image;

import util.Constant;
import util.GameUtil;
import util.MyFrame;

/**
 * ̫��ϵ��������
 * @author ����
 *
 */
public class SolarFrame extends MyFrame{
	Image bg = GameUtil.getImage("images/QQͼƬ20140727000929.jpg");	//�����˱���
	Star sun = new Star("images/��ϵ01-1.jpg", Constant.GAME_WIDTH/2, Constant.GAME_HEIGHT/2);
	planet earth = new planet("images/��ϵ02-1.png", 150, 100, 0.1, sun);
	planet moon = new planet("images/��ϵ04-1.jpg", 30, 40, 0.3, earth,true);
	planet Mars = new planet("images/��ϵ03-1.jpg", 200, 130, 0.2, sun);
	
	
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
