package test;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ���Դ���������Ƕȷ���
 * ʵ��С��̨����Ϸ
 *
 * @author ����
 *
 */
public class GameFrame4 extends MyFrame{	//	GUI��� AWT,swing�ȡ�
	
	Image img = GameUtil.getImage("images/1 (2).gif");
	private double x=100,y=100;		//����ʵ�ֶ����ƶ�Ч��
	private double degree = 3.14/3;				//����[0,2pi]

	public void paint(Graphics g) {
		g.drawImage(img, (int)x, (int)y, null);		//(int)��doubleǿת��Int���ͣ���Ϊg.drawImage����ĸ�ʽҪ��
		
		x = 100+ 100*Math.cos(degree);
		y = 200+ 50*Math.sin(degree);
		degree +=0.1;
	}


	public static void main(String[] args) {
		GameFrame4 gf = new GameFrame4();
		gf.launchFrame();
		}
	}
