package inta.inta03.test02;
/**
 * 
 * @author ����
 * 
 *@version 1.0
 *
 */
public class TestSwitch {
	public static void main(String[] args){
		double d=Math.random();
		int e=1+(int)(d*6);
		System.out.println(e);
		System.out.println("���Զ�ѡ��ṹ");
		if(e==6){
			System.out.println("����̫����");
		}else if(e==5){
			System.out.println("�����ܺ�");
		}else if(e==4){
			System.out.println("������");
		}else if(e==3){
			System.out.println("����һ��");
		}else if(e==2){
			System.out.println("��������");
		}else if(e==1){
			System.out.println("����̫��");
		}
		System.out.println("###############");
		switch(e){
		
		case 6:
			System.out.println("������");
			break;
		case 5:
			System.out.println("�ܺ�");
			break;
		case 4:
			System.out.println("һ���");
			break;
		default:
			System.out.println("������");
			break;
		}
		double g=Math.random(); //Ҳ���Ժϲ���ֱ�����棨int����26*Math...())
		int ch01=(int)(g*26);
		char c='a';
		char ch02=(char)(c+ch01);
		System.out.print(ch02+":");
		switch(ch02){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Ԫ����ĸ");
			break;
		}
	}

}
