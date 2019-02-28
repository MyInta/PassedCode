package practice;

public class Point {
	double x,y,z;
	//通过构造法初始化构造属性
	public Point(double _x,double _y,double _z){
		x = _x;
		y = _y;
		z = _z;
	}
	
	public void setx(double _x){
		x = _x;
	}
	
	public void sety(double _y){
		y = _y;
	}
	
	public void setz(double _z){
		z = _z;
	}
	
	public double distance(Point p){
		return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y)+(z-p.z)*(z-p.z));
	}
	
	public static void main(String[] args) {
		Point p = new Point(2,3,4);
		Point p2 = new Point(5,4,8);
		p.setx(10);
		p.sety(20);
		p.setz(30);
		p.distance(p2);
		System.out.println(p.x+"\n"+p.y+"\n"+p.z);
		System.out.println(p.distance(p2));
	}
	
}
