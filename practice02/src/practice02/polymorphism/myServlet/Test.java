package practice02.polymorphism.myServlet;

public class Test {
	public static void main(String[] args){
		HttpServlet s = new MyServlet();
		s.service();	// ֮���Ե��õ��������doGet ԭ���Ǹ��������doGet����ǰ��ʽ����this.doGet��this���ǵ��õ������������
	}
}
