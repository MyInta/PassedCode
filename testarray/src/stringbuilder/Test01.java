package stringbuilder;

/**
 * ���Կɱ��ַ�����StringBuilder(�̰߳�ȫ��Ч�ʸ�),StringBuffer(�̰߳�ȫ��Ч�ʵ�)
 * @author ����
 *
 */

public class Test01 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();	//�ַ������ʼ����Ϊ16
		StringBuilder sb1 = new StringBuilder(32);	//�ַ������ʼ����Ϊ32
		StringBuilder sb2 = new StringBuilder("abcd");	//�ַ������ʼ����Ϊ32,value[]{'a','b','c','d',\u0000,\u0000...}
		sb2.append("efg");	//�ۼ� �ӵ��������
		sb2.append(true);	//booleanҲ�����ۼ�
		sb2.append(321).append("���").append(6.66);	//Դ���������и�return this. ��������
		
		System.out.println(sb2);
	}
}
