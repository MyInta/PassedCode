package inta02;

public class TypeTest {
	public static void main(String[] args){
		//�����������ͱ�������ֵ
		byte b=1;
		short s=2;
		char c='c';
		int i=3;
		long l=4;
		float f=5;
		double d=6.01;
		System.out.println("����b��ֵΪ��"+b);
		System.out.println("����s��ֵΪ��"+s);
		System.out.println("����c��ֵΪ��"+c);
		System.out.println("����i��ֵΪ��"+i);
		System.out.println("����l��ֵΪ��"+l);
		System.out.println("����f��ֵΪ��"+f);
		System.out.println("����d��ֵΪ��"+d);
		//�ֱ𽫸������ͽ���ת��
		s=b;
		i=c;
		i=s;
		l=i;
		f=l;
		d=f;
		d=b;
		d=f+d;
		System.out.println("ת����ı���b��ֵΪ��"+b);
		System.out.println("ת����ı���s��ֵΪ��"+s);
		System.out.println("ת����ı���c��ֵΪ��"+c);
		System.out.println("ת����ı���i��ֵΪ��"+i);
		System.out.println("ת����ı���l��ֵΪ��"+l);
		System.out.println("ת����ı���f��ֵΪ��"+f);
		System.out.println("ת����ı���d��ֵΪ��"+d);
	}

}
