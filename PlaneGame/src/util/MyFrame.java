package util;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MyFrame extends Frame {

	
	/**
	 * 加载窗口
	 */
	
	public void launchFrame(){
		setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
		setLocation(20,20);
		setVisible(true);
		
		new PaintThread().start();	//启动线程
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	} 	

//	private Image offScreenImage;	//利用双缓冲技术消除闪烁（试了下，反而图像会冻结不动）
//	public 	void update(Graphics g){
//		if(offScreenImage == null){
//			offScreenImage = this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
//			
//			Graphics gOffScreen = offScreenImage.getGraphics();
//			paint(gOffScreen);
//			g.drawImage(offScreenImage, 0, 0, null);
//		}
//	}

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
	
}
