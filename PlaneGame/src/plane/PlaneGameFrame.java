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
 * �ɻ���Ϸ����
 * @author ����
 *
 */
public class PlaneGameFrame extends MyFrame{
	Image bg = GameUtil.getImage("images/bg.jpg");
	Plane p = new Plane("images/�ɻ�01.jpg",50,50);
	
	ArrayList bulletList = new ArrayList();	//������ʱδѧ���Ժ�ѧ��ǿ�ҽ������
	Date startTime;
	Date endTime;
	Date runningTime;
	Explode bao;
	
	public void paint(Graphics g){
		g.drawImage(bg, 0, 0, null);
		p.draw(g);
		if(endTime==null){			//�Ӹ��жϿ���ֹͣ��ʱ���������Ͳ������ʱ����
			runningTime = new Date();
		}
		int sumTime = (int)(runningTime.getTime()-startTime.getTime())/1000;
		printInfo(g, "����ʱ��:"+sumTime+"��", 20,Constant.GAME_WIDTH-200, 50, Color.GREEN);
		for(int i=0;i<bulletList.size();i++){
			Bullet b = (Bullet)bulletList.get(i);
			b.draw(g);
			//�����ɻ�����ײ
			boolean peng = b.getRect().intersects(p.getRect());
			if(peng){
				p.setLive(false);	//�ɻ�����!
				endTime = new Date();
				if(bao==null){		//	ֻ��һ��ֵ���Ӹ��жϾ���
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
			printInfo(g, "���ʱ�䣺"+period+"��", 20,Constant.GAME_WIDTH/2,Constant.GAME_HEIGHT/2+30,
					Color.red);
			p.x += Constant.GAME_WIDTH;	//��һ�е�Ŀ���ǽ������Ƶ����⣬��ֹ�ٴ���ײˢ��ʱ��
			
			switch (period/10) {
			case 0:
				printInfo(g, "�Ǻ� ����~", 50,Constant.GAME_WIDTH/2-80,Constant.GAME_HEIGHT/2-80,
						Color.orange);
				break;
			case 1:
				printInfo(g, "С��~~", 50,Constant.GAME_WIDTH/2-80,Constant.GAME_HEIGHT/2-80,
						Color.orange);
				break;
			case 2:
				printInfo(g, "���뷨����~~", 50,Constant.GAME_WIDTH/2-80,Constant.GAME_HEIGHT/2-80,
						Color.green);
				break;
			case 3:
				printInfo(g, "���Գ�Ϊ��ӥ��~~", 50,Constant.GAME_WIDTH/2-80,Constant.GAME_HEIGHT/2-80,
						Color.black);
				break;
			case 4:
				printInfo(g, "�����ǿ������~~", 50,Constant.GAME_WIDTH/2-80,Constant.GAME_HEIGHT/2-80,
						Color.red);
				break;
				
			default:
				printInfo(g, "����~~", 50,Constant.GAME_WIDTH/2-80,Constant.GAME_HEIGHT/2-80,
						Color.red);
				break;
			}
		}
		//		printInfo(g, "�����ǣ�", 10, 20, 50, Color.green);
	}
	/**
	 * �ڴ����ϴ�ӡ��Ϣ
	 * @param g
	 * @param str
	 * @param size
	 */
	public void printInfo(Graphics g,String str,int size,int x,int y,Color color){
		Color c = g.getColor();
		g.setColor(color);
		Font f = new Font("����",Font.BOLD,size);
		g.setFont(f);
		g.drawString(str,x,y);
		g.setColor(c);		
	}

	public static void main(String[] args) {
		new PlaneGameFrame().launchFrame();
	}
	public void launchFrame(){
		super.launchFrame();
		//���Ӽ��̵ļ���
		addKeyListener(new KeyMoniter());
		
		//����һ���ӵ�
		for(int i=0;i<50;i++){
			Bullet b = new Bullet();
			bulletList.add(b);
		}
		
		startTime = new Date();
	}
	
	
	//����Ϊ�ڲ��࣬���Է����ʹ���ⲿ����ͨ����
	class KeyMoniter extends KeyAdapter{	//�һ��������أ�ѡ�������ͷŹ���

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("���£�"+e.getKeyCode());
			p.addDirection(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("�ͷţ�"+e.getKeyCode());
			p.minusDirection(e);
		}
		
	}
	
	
	
	
}
