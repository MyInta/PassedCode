package test;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 测试窗口物任意角度飞行
 * 实现小的台球游戏
 *
 * @author 银涛
 *
 */
public class GameFrame4 extends MyFrame{	//	GUI编程 AWT,swing等。
	
	Image img = GameUtil.getImage("images/1 (2).gif");
	private double x=100,y=100;		//用以实现动画移动效果
	private double degree = 3.14/3;				//弧度[0,2pi]

	public void paint(Graphics g) {
		g.drawImage(img, (int)x, (int)y, null);		//(int)由double强转成Int类型，因为g.drawImage里面的格式要求
		
		x = 100+ 100*Math.cos(degree);
		y = 200+ 50*Math.sin(degree);
		degree +=0.1;
	}


	public static void main(String[] args) {
		GameFrame4 gf = new GameFrame4();
		gf.launchFrame();
		}
	}
