package MyInterface;

public class Test {
	public static void main(String[] args) {
		Flyable f = new Stone();
		f.fly(); // �����Ҫ�����ೣ�� ��Ҫǿ��ת��
		
		InterfaceA a = new InterfaceTest();
		InterfaceTest b = (InterfaceTest) a;	// ǿ��ת�� ���� a.aaa ... ... ��������
		
		/*a.aaa();
		a.bbb();
		a.ccc();
		*/
		//	����취 ��ǰ�������ֱ���� InterTest a = new InterTest();����ʵ��ǰ��a.aaa ... ... �ĵ���
		b.aaa();
		b.bbb();
		b.ccc();
	}
}
