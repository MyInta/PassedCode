package practice02.polymorphism.myServlet;

public class HttpServlet {
	public void service(){
		System.out.println("HttpServlet.service()");	//使用syst快捷键可以生成这行
		doGet();	// 隐藏了this. 即本是this.doGet;而this调用的是全局的对象 
	}
	
	public void doGet(){
		System.out.println("HttpServlet.doGet()");
	}
	
	/*public void doPost(){
		System.out.println("HttpServlet.doPost()");
	}*/
}
