package practice02.polymorphism.myServlet;

public class Test {
	public static void main(String[] args){
		HttpServlet s = new MyServlet();
		s.service();	// 之所以调用的是子类的doGet 原因是父类里面的doGet调用前隐式参数this.doGet的this都是调用的最终整体对象
	}
}
