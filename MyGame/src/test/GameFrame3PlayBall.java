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
public class GameFrame3PlayBall extends Frame{	//	GUI��� AWT,swing�ȡ�
	
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
	
	
	private double x=100,y=100;		//����ʵ�ֶ����ƶ�Ч��
	private double degree = 3.14/3;				//����[0,2pi]
	private double speed = 10;
//	private double degree2 = 3.14/3;				//����[0,2pi]
	public void paint(Graphics g) {
		g.drawImage(img, (int)x, (int)y, null);		//(int)��doubleǿת��Int���ͣ���Ϊg.drawImage����ĸ�ʽҪ��
		
		x += speed*Math.cos(degree);
//		y += 8*Math.sin(degree2);
		y += speed*Math.sin(degree);
//		
		if(speed>0){		//�����ٶȵ�ͣ��Ϊֹ
			speed -=0.1;
		}else{
			speed = 0;
		}
		
		if(y>470||y<10){
			degree = -degree;
		}
		if(x>450||x<10){
			degree = Math.PI-degree;
		}
		
//		if(y>500-50){
//			degree2 = Math.PI/2+degree2;
//		}
//		if(y<50){
//			degree2 = -degree2;
//		}							//�ú�˼��������������ת�����������
//
//		if(x<0){
//			degree = Math.PI-degree;
//		}
//		if(x>500-50){
//			degree = Math.PI-degree;
//		}
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
		GameFrame3PlayBall gf = new GameFrame3PlayBall();
		gf.launchFrame();
		}
	}
