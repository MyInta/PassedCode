package practice02.polymorphism.myServlet;

public class HttpServlet {
	public void service(){
		System.out.println("HttpServlet.service()");	//ʹ��syst��ݼ�������������
		doGet();	// ������this. ������this.doGet;��this���õ���ȫ�ֵĶ��� 
	}
	
	public void doGet(){
		System.out.println("HttpServlet.doGet()");
	}
	
	/*public void doPost(){
		System.out.println("HttpServlet.doPost()");
	}*/
}
