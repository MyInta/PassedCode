package callback;

/*import java.awt.Graphics;*/

public abstract class MyFrame {
	public abstract void paint(/*Graphics g*/);	/*{
		System.out.println("���Լ����ڻ�����");	//����abstract��Ͳ����о��巽����
	}*/
}

interface IMyFrame{
	void paint();
}