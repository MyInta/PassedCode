package practice;

public class TestIf {
	public static void main(String[] args){
		double d=Math.random();
		/*int e=(int)(d*5);*/   //���ȥ���������ײ�������ֻ��ʾ0��
		int e=1+(int)(d*6);     //�����Ҫ1~6�����ӣ���ǰ���1���������*7��ΧΪ0~6��
		System.out.println(e);
		if(e>3){
			System.out.println("������");
		}
		else{
			System.out.println("С��");
		}
		double i=6*Math.random();
		double j=6*Math.random();
		double k=6*Math.random();
		int count=(int)(i+j+k);
		/*  double g=i+j+k;
		int count=(int)g; ������ò�Ƶõ�15���ϸ��ʴ�һ��  */
		System.out.println(count);
		if(count>15){
			System.out.println("�����ð�����");
		}
		if(count<=15&&count>=10){
			System.out.println("����һ��㰡��");
		}
		if(count<10){
			System.out.println("��������ô����");
		}
	}

}
