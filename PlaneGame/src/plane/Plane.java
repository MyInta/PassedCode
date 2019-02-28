package plane;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import util.GameUtil;

public class Plane extends GameObject{

	private boolean left,down,right,up;
	private boolean live = true;
	
	public void draw(Graphics g){
		if(live){
			g.drawImage(img, (int)x, (int)y, null);
			move();
		}
	}
	
	public void move(/*KeyEvent e*/){
//		switch (e.getKeyCode()) {
//		case 37:
//			x -= 10;
//			break;
//		case 38:
//			y -= 10;
//			break;
//		case 39:
//			x += 10;
//			break;
//		case 40:
//			y += 10;
//			break;
//
//		default:
//			break;
//		}
		if(left){
			x -= speed;
		}
		if(up){
			y -= speed;
		}
		if(right){
			x += speed;
		}
		if(down){
			y += speed;
		}
	}
	public void addDirection(KeyEvent e){
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			left = true;
			break;
		case KeyEvent.VK_UP:
			up = true;
			break;
		case KeyEvent.VK_RIGHT:
			right = true;
			break;
		case KeyEvent.VK_DOWN:
			down = true;
			break;

		default:
			break;
		}
		
	}
	public void minusDirection(KeyEvent e){
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			left = false;
			break;
		case KeyEvent.VK_UP:
			up = false;
			break;
		case KeyEvent.VK_RIGHT:
			right = false;
			break;
		case KeyEvent.VK_DOWN:
			down = false;
			break;
			
		default:
			break;
		}
	}

	public Plane(String imgpath, double x, double y) {
		this.img = GameUtil.getImage(imgpath);
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
		this.x = x;
		this.y = y;
	}
	
	public Plane(){
		
	}

	public boolean isLive() {
		return live;
	}

	public void setLive(boolean live) {
		this.live = live;
	}
	
}
