package test;
/**
 * �����Զ�װ��Ͳ���
 * @author ����
 *
 */
public class Test02 {
	public static void main(String[] args) {
//		Integer i = new Integer(1000);
		Integer i = 1000;	//	JDK5.0�Ժ��Զ�װ�� �����������ǸĽ����� �ĳ�Integer i = new Integer(1000);
		Integer b = /*null;*/2000;	//ʹ��null ʱ�� b.intValue������ ��ΪB����Ϊ�� ���ܵ������еķ���
	
		int c = b ;/*new Integer(1500);	*/	//	�Զ�����	�������Ľ�:b.intValue();
		
		System.out.println(c);
		Integer d = 1234;
		Integer d2 = 1234;
		System.out.println(d==d2);
		System.out.println(d.equals(d2));
		
		System.out.println("###############3");
		Integer d3 = 123;	//[-128,127]��Χ�������Իᵱ��������������������
		Integer d4 = 123;
		System.out.println(d3==d4);
		System.out.println(d3.equals(d4));
		
	}
}
