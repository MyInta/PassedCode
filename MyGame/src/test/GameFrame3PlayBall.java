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
public class GameFrame3PlayBall extends Frame{	//	GUI编程 AWT,swing等。
	
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
	
	
	private double x=100,y=100;		//用以实现动画移动效果
	private double degree = 3.14/3;				//弧度[0,2pi]
	private double speed = 10;
//	private double degree2 = 3.14/3;				//弧度[0,2pi]
	public void paint(Graphics g) {
		g.drawImage(img, (int)x, (int)y, null);		//(int)由double强转成Int类型，因为g.drawImage里面的格式要求
		
		x += speed*Math.cos(degree);
//		y += 8*Math.sin(degree2);
		y += speed*Math.sin(degree);
//		
		if(speed>0){		//控制速度到停滞为止
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
//		}							//好好思考方向中增减和转换方向的问题
//
//		if(x<0){
//			degree = Math.PI-degree;
//		}
//		if(x>500-50){
//			degree = Math.PI-degree;
//		}
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
		GameFrame3PlayBall gf = new GameFrame3PlayBall();
		gf.launchFrame();
		}
	}
