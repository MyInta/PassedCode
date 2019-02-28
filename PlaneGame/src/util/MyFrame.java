package util;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MyFrame extends Frame {

	
	/**
	 * ���ش���
	 */
	
	public void launchFrame(){
		setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
		setLocation(20,20);
		setVisible(true);
		
		new PaintThread().start();	//�����߳�
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	} 	

//	private Image offScreenImage;	//����˫���弼��������˸�������£�����ͼ��ᶳ�᲻����
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
	
}