package plane;

import java.awt.Graphics;
import java.awt.Image;

import util.GameUtil;

/**
 * 图像消失后的爆炸图
 * @author 银涛
 *
 */
public class Explode {
	double x,y;
	static Image[] imgs = new Image[9];	//加载static 是为了别的地方也可以调用图片
	static	{
		for(int i=0;i<9;i++){
			imgs[i] = GameUtil.getImage("images/explode/0"+(i+1)+".jpg");
			imgs[i].getWidth(null);		//一般加载不出来，得加这行加载图片，固定用法
		}
	}
	
	int count;
	
	public void draw(Graphics g){
		if(count<=8){
			g.drawImage(imgs[count], (int)x, (int)y, null);
			try {				//让程序暂停1.5秒
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
