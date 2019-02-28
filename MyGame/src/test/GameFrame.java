package test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ��Ϸ����
 *
 * @author ����
 *
 */
public class GameFrame extends Frame{	//	GUI��� AWT,swing�ȡ�
	
	Image img = GameUtil.getImage("images/1 (2).gif");
	
	/**
	 * ���ش���
	 */
	
	public void launchFrame(){
		setSize(500,500);
		setLocation(100,100);
		setVisible(true);
		
		new PaintThread().start();	//�����߳�
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
	
	
	double x=100,y=100;		//����ʵ�ֶ����ƶ�Ч��
	
	@Override
	public void paint(Graphics g) {
//		System.out.println("paint!!!");
		g.drawLine(100, 100, 200, 200);
		g.drawRect(100, 100, 200, 200);
		g.drawOval(100, 100, 200, 200);
		Font f = new Font("����",Font.BOLD,100);
		g.setFont(f);
		g.drawString("����INTA", 10, 300);
		
		g.fillRect(100, 100, 20, 20);
		Color c = g.getColor();	//����ԭ����ɫ���Ժ�����������ܷ���
		g.setColor(Color.red);
		g.fillOval(300, 300, 20, 20);
		g.setColor(c);
		
		g.drawImage(img, (int)x, (int)y, null);		//(int)��doubleǿת��Int���ͣ���Ϊg.drawImage����ĸ�ʽҪ��
		
		x +=3;
		if(x>120){		// �����ƶ���ʽ
			y +=3;
		}
	}
/**
 * ����һ���ػ����ڵ��̣߳�����һ���ڲ���
 * @author ����
 *
 */
	class PaintThread extends Thread{
		
		public void run(){
			while(true){
				repaint();
				try {
					Thread.sleep(40);		//1s=1000ms
				}	catch (InterruptedException e) {
					e.printStackTrace();
			}
		}
	}
}


	public static void main(String[] args) {
		GameFrame gf = new GameFrame();
		gf.launchFrame();
		}
	}
