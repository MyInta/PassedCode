package practice;

public class TestIf {
	public static void main(String[] args){
		double d=Math.random();
		/*int e=(int)(d*5);*/   //如果去掉括号容易产生错误，只显示0；
		int e=1+(int)(d*6);     //如果想要1~6（骰子），前面加1，但如果是*7范围为0~6；
		System.out.println(e);
		if(e>3){
			System.out.println("大数！");
		}
		else{
			System.out.println("小数");
		}
		double i=6*Math.random();
		double j=6*Math.random();
		double k=6*Math.random();
		int count=(int)(i+j+k);
		/*  double g=i+j+k;
		int count=(int)g; 这样子貌似得到15以上概率大一点  */
		System.out.println(count);
		if(count>15){
			System.out.println("手气好棒啊！");
		}
		if(count<=15&&count>=10){
			System.out.println("手气一般般啊！");
		}
		if(count<10){
			System.out.println("手气不怎么样！");
		}
	}

}
