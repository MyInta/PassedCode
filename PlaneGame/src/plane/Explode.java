package plane;

import java.awt.Graphics;
import java.awt.Image;

import util.GameUtil;

/**
 * ͼ����ʧ��ı�ըͼ
 * @author ����
 *
 */
public class Explode {
	double x,y;
	static Image[] imgs = new Image[9];	//����static ��Ϊ�˱�ĵط�Ҳ���Ե���ͼƬ
	static	{
		for(int i=0;i<9;i++){
			imgs[i] = GameUtil.getImage("images/explode/0"+(i+1)+".jpg");
			imgs[i].getWidth(null);		//һ����ز��������ü����м���ͼƬ���̶��÷�
		}
	}
	
	int count;
	
	public void draw(Graphics g){
		if(count<=8){
			g.drawImage(imgs[count], (int)x, (int)y, null);
			try {				//�ó�����ͣ1.5��
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			count++;
			
		}
	}
	
	public Explode(double x,double y){
		this.x = x;
		this.y =y;
	}

}
