package inta.inta03.test02;
/**
 * 
 * @author 银涛
 * 
 *@version 1.0
 *
 */
public class TestSwitch {
	public static void main(String[] args){
		double d=Math.random();
		int e=1+(int)(d*6);
		System.out.println(e);
		System.out.println("测试多选择结构");
		if(e==6){
			System.out.println("运气太好了");
		}else if(e==5){
			System.out.println("运气很好");
		}else if(e==4){
			System.out.println("运气好");
		}else if(e==3){
			System.out.println("运气一般");
		}else if(e==2){
			System.out.println("运气不好");
		}else if(e==1){
			System.out.println("运气太差");
		}
		System.out.println("###############");
		switch(e){
		
		case 6:
			System.out.println("棒棒哒");
			break;
		case 5:
			System.out.println("很好");
			break;
		case 4:
			System.out.println("一般般");
			break;
		default:
			System.out.println("运气差");
			break;
		}
		double g=Math.random(); //也可以合并，直接下面（int）（26*Math...())
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
			System.out.println("元音字母");
			break;
		}
	}

}
