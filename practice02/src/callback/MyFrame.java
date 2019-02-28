package callback;

/*import java.awt.Graphics;*/

public abstract class MyFrame {
	public abstract void paint(/*Graphics g*/);	/*{
		System.out.println("把自己窗口画出来");	//输了abstract后就不能有具体方法了
	}*/
}

interface IMyFrame{
	void paint();
}