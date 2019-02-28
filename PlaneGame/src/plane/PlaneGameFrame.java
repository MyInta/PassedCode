package plane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;

import util.Constant;
import util.GameUtil;
import util.MyFrame;

/**
 * 飞机游戏窗口
 * @author 银涛
 *
 */
public class PlaneGameFrame extends MyFrame{
	Image bg = GameUtil.getImage("images/bg.jpg");
	Plane p = new Plane("images/飞机01.jpg",50,50);
	
	ArrayList bulletList = new ArrayList();	//泛型暂时未学，以后学了强烈建议加上
	Date startTime;
	Date endTime;
	Date runningTime;
	Explode bao;
	
	public void paint(Graphics g){
		g.drawImage(bg, 0, 0, null);
		p.draw(g);
		if(endTime==null){			//加个判断可以停止计时，已死亡就不算进行时间了
			runningTime = new Date();
		}
		int sumTime = (int)(runningTime.getTime()-startTime.getTime())/1000;
		printInfo(g, "进行时间:"+sumTime+"秒", 20,Constant.GAME_WIDTH-200, 50, Color.GREEN);
		for(int i=0;i<bulletList.size();i++){
			Bullet b = (Bullet)bulletList.get(i);
			b.draw(g);
			//检测跟飞机的碰撞
			boolean peng = b.getRect().intersects(p.getRect());
			if(peng){
				p.setLive(false);	//飞机死掉!
				endTime = new Date();
				if(bao==null){		//	只赋一次值，加个判断就行
					bao = new Explode(50,50);
				}
				bao.draw(g);
				break;
			}
			
		}
		
		if(!p.isLive()){
			printInfo(g, "GAME OVER", 20,Constant.GAME_WIDTH/2,Constant.GAME_HEIGHT/2,
					Color.black);
			int period = (int)(endTime.getTime()-startTime.getTime())/1000;
			printInfo(g, "存活时间："+period+"秒", 20,Constant.GAME_WIDTH/2,Constant.GAME_HEIGHT/2+30,
					Color.red);
			p.x += Constant.GAME_WIDTH;	//这一行的目的是将坐标移到框外，防止再次碰撞刷新时间
			
			switch (period/10) {
			case 0:
				printInfo(g, "呵呵 菜鸟~", 50,Constant.GAME_WIDTH/2-80,Constant.GAME_HEIGHT/2-80,
						Color.orange);
				break;
			case 1:
				printInfo(g, "小鸟~~", 50,Constant.GAME_WIDTH/2-80,Constant.GAME_HEIGHT/2-80,
						Color.orange);
				break;
			case 2:
				printInfo(g, "有想法的鸟~~", 50,Constant.GAME_WIDTH/2-80,Constant.GAME_HEIGHT/2-80,
						Color.green);
				break;
			case 3:
				printInfo(g, "可以称为老鹰了~~", 50,Constant.GAME_WIDTH/2-80,Constant.GAME_HEIGHT/2-80,
						Color.black);
				break;
			case 4:
				printInfo(g, "你怕是开外挂了~~", 50,Constant.GAME_WIDTH/2-80,Constant.GAME_HEIGHT/2-80,
						Color.red);
				break;
				
			default:
				printInfo(g, "鸟人~~", 50,Constant.GAME_WIDTH/2-80,Constant.GAME_HEIGHT/2-80,
						Color.red);
				break;
			}
		}
		//		printInfo(g, "分数是：", 10, 20, 50, Color.green);
	}
	/**
	 * 在窗口上打印信息
	 * @param g
	 * @param str
	 * @param size
	 */
	public void printInfo(Graphics g,String str,int size,int x,int y,Color color){
		Color c = g.getColor();
		g.setColor(color);
		Font f = new Font("宋体",Font.BOLD,size);
		g.setFont(f);
		g.drawString(str,x,y);
		g.setColor(c);		
	}

	public static void main(String[] args) {
		new PlaneGameFrame().launchFrame();
	}
	public void launchFrame(){
		super.launchFrame();
		//增加键盘的监听
		addKeyListener(new KeyMoniter());
		
		//生成一堆子弹
		for(int i=0;i<50;i++){
			Bullet b = new Bullet();
			bulletList.add(b);
		}
		
		startTime = new Date();
	}
	
	
	//定义为内部类，可以方便的使用外部类普通属性
	class KeyMoniter extends KeyAdapter{	//右击增加重载，选择点击和释放功能

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("按下："+e.getKeyCode());
			p.addDirection(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("释放："+e.getKeyCode());
			p.minusDirection(e);
		}
		
	}
	
	
	
	
}
