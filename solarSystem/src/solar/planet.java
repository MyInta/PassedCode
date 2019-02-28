package solar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import util.GameUtil;

public class planet extends Star{

	//除了图片，坐标。行星沿着某个椭圆运行：长轴、短轴、速度、角度。绕着某个star飞	
	double longAxis;	//椭圆的长轴
	double shortAxis;	//椭圆的短轴
	double speed;		//速度
	double degree;
	Star center;
	
	boolean satellite;
	
	public void draw(Graphics g){
//		g.drawImage(img, (int)x, (int)y, null);
		super.draw(g);
		move();
		if(!satellite){
			drawTrace(g);
		}
	}
	

	public void drawTrace(Graphics g){
		double ovalX,ovalY,ovalWidth,ovalHeight;
		ovalWidth = longAxis*2;
		ovalHeight = shortAxis*2;
		ovalX = (center.x+center.width/2)-longAxis;
		ovalY = (center.y+center.height/2)-shortAxis;

		Color c = g.getColor();
		g.setColor(Color.blue);
		g.drawOval((int)ovalX, (int)ovalY, (int)ovalWidth, (int)ovalHeight);
		g.setColor(c);
	}
	
	public void move(){
		//沿着椭圆轨迹飞行
		x = (center.x+center.width/2) + longAxis*Math.cos(degree);	//注意里面有一些细节没解决，这个轨迹是围绕中心边框转，另外距离设计的相关点是取图片左上角
		y = (center.y+center.height/2) + shortAxis*Math.sin(degree);
		
		degree += speed;
	}
	


	public planet(String imgpath,double longAxis, double shortAxis, 
			double speed, Star center) {
		super(GameUtil.getImage(imgpath));
		
		this.x = center.x +longAxis;
		this.y = center.y;
		
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.speed = speed;
		this.center = center;
		
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
	}
	public planet(String imgpath,double longAxis, double shortAxis, 
			double speed, Star center,boolean satellite) {
		this(imgpath, longAxis, shortAxis, speed, center);
		this.satellite = satellite;
	}




	public planet(Image img, double x, double y) {
		super(img, x, y);
	}
	public planet(String imgpath, double x, double y) {
		super(imgpath, x, y);
	}

	
}	
