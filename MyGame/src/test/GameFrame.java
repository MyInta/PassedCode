package test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 游戏窗口
 *
 * @author 银涛
 *
 */
public class GameFrame extends Frame{	//	GUI编程 AWT,swing等。
	
	Image img = GameUtil.getImage("images/1 (2).gif");
	
	/**
	 * 加载窗口
	 */
	
	public void launchFrame(){
		setSize(500,500);
		setLocation(100,100);
		setVisible(true);
		
		new PaintThread().start();	//启动线程
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
	
	
	double x=100,y=100;		//用以实现动画移动效果
	
	@Override
	public void paint(Graphics g) {
//		System.out.println("paint!!!");
		g.drawLine(100, 100, 200, 200);
		g.drawRect(100, 100, 200, 200);
		g.drawOval(100, 100, 200, 200);
		Font f = new Font("楷体",Font.BOLD,100);
		g.setFont(f);
		g.drawString("我是INTA", 10, 300);
		
		g.fillRect(100, 100, 20, 20);
		Color c = g.getColor();	//保存原有颜色，以后续更改完后能返回
		g.setColor(Color.red);
		g.fillOval(300, 300, 20, 20);
		g.setColor(c);
		
		g.drawImage(img, (int)x, (int)y, null);		//(int)由double强转成Int类型，因为g.drawImage里面的格式要求
		
		x +=3;
		if(x>120){		// 设置移动方式
			y +=3;
		}
	}
/**
 * 定义一个重画窗口的线程，属于一个内部类
 * @author 银涛
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
