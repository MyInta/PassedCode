package test;

//import java.awt.Color;
//import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ���Դ����������Ÿ��ֹ켣�ƶ�
 *
 * @author ����
 *
 */
public class GameFrame2 extends Frame{	//	GUI��� AWT,swing�ȡ�
	
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
	private boolean up;
	private boolean left;
	public void paint(Graphics g) {
//		System.out.println("paint!!!");
//		g.drawLine(100, 100, 200, 200);
//		g.drawRect(100, 100, 200, 200);
//		g.drawOval(100, 100, 200, 200);
//		Font f = new Font("����",Font.BOLD,100);
//		g.setFont(f);
//		g.drawString("����INTA", 10, 300);
//		
//		g.fillRect(100, 100, 20, 20);
//		Color c = g.getColor();	//����ԭ����ɫ���Ժ�����������ܷ���
//		g.setColor(Color.red);
//		g.fillOval(300, 300, 20, 20);
//		g.setColor(c);
//		
		g.drawImage(img, (int)x, (int)y, null);		//(int)��doubleǿת��Int���ͣ���Ϊg.drawImage����ĸ�ʽҪ��
		if(left){
			x-=8;
		}else{
			x+=8;
		}
		if(x>500-50){
			left = true;
		}
		if(x<0){
			left = false;
		}		//ͨ������һ���������booleanֵ���ı��˶��켣
		 
		if(up){
			y-=8;
		}else{
			y+=8;
		}
		if(y>500-50){
			up = true;
		}
		if(y<0){
			up = false;
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
		GameFrame2 gf = new GameFrame2();
		gf.launchFrame();
		}
	}
