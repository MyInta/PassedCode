package callback;



public class PaintFrame {
	public static void drawFrame(/*MyFrame f*/IMyFrame f){
		System.out.println("�����߳�");
		System.out.println("����ѭ��");
		System.out.println("�鿴��Ϣջ");
		
		//������
		f.paint();
		
		System.out.println("�������棬����Ч��");
	}

	
	public static void drawFrame02(MyFrame f){
		System.out.println("�����Լ��ĳ���");
		f.paint();
		System.out.println("���Խ���");
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
	System.out.println("������");
	}
}

class GameFrame02 implements IMyFrame {
	public void paint(){
	System.out.println("GameFrame02.paint()");
	System.out.println("������");
	}
}