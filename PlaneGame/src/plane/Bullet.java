package plane;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import util.Constant;

/**
 * 子弹设计
 * @author 银涛
 *
 */
public class Bullet extends GameObject{

	double degree;
	int speed = 3;
	public Bullet(){
		degree = Math.random()*Math.PI*2;
		x = Constant.GAME_WIDTH/2;
		y = Constant.GAME_HEIGHT/2;
		width = 10;
		height = 10;
	}
	
//	public Rectangle getRect(){
//		return  new Rectangle((int)x,(int)y,width,height);
//	}
	
	public void draw(Graphics g){
		Color c = g.getColor();
		g.setColor(Color.YELLOW);
		g.fillOval((int)x, (int)y, 10, 10);
		
		x += speed*Math.cos(degree);
		y += speed*Math.sin(degree);
		
		if(y>Constant.GAME_HEIGHT-height||y<30){
			degree = -degree;
		}
		if(x>Constant.GAME_WIDTH-width||x<10){
			degree = Math.PI-degree;
		}
		
		g.setColor(c);
	}
}
