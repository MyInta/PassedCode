package test.string;

public class TestString {
	public static void main(String[] args) {
		System.out.println("Abcbd".indexOf('b'));//��������������
		System.out.println("Abcbd".lastIndexOf('b'));//���������ҵ�һ�γ��ֵ�����
		System.out.println("Abcbd".startsWith("Abc"));
		System.out.println("Abcbd".endsWith("bd"));
		System.out.println("Abcbd".toLowerCase());//Сд
		System.out.println("Abcbd".toUpperCase());//��д

		System.out.println("#####################");
		StringBuilder gh=new StringBuilder("a");
		for(int i=0;i<10;i++){	//Ҫ�������ִ��룡�������� �˷ѿռ� ��11������a a0 a01 ... ... a0123456789��
			/*gh += i;*/		//��õĽ���취�� gh.append(i); ���������ۼ��ַ������ܣ������޸ĵ�ֻ��һ������û�����¶���	
			gh.append(i);	//ע��ʹ��gh.append��ʱ�� ǰ����gh����StringBuilder������
		}
		System.out.println(gh);
	}
}
