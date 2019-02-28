package callback;



public class PaintFrame {
	public static void drawFrame(/*MyFrame f*/IMyFrame f){
		System.out.println("启动线程");
		System.out.println("增加循环");
		System.out.println("查看消息栈");
		
		//画窗口
		f.paint();
		
		System.out.println("启动缓存，增加效率");
	}

	
	public static void drawFrame02(MyFrame f){
		System.out.println("属于自己的尝试");
		f.paint();
		System.out.println("测试结束");
	}
	
	
	public static void main(String[] args) {
		drawFrame(new GameFrame02());
		/*drawFrame(new GameFrame01());*/
		
		drawFrame02(new GameFrame01());
	}
	
}

class GameFrame01 extends MyFrame {
	public void paint(){
	System.out.println("GameFrame01.paint()");
	System.out.println("画窗口");
	}
}

class GameFrame02 implements IMyFrame {
	public void paint(){
	System.out.println("GameFrame02.paint()");
	System.out.println("画窗口");
	}
}