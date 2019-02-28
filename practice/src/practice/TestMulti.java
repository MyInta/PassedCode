package practice;

public class TestMulti {
	public static void main(String[] args) {
		for(int a=1,b=1;a<=b&b<=9;){
			System.out.print(a+"*"+b+"="+(a*b)+" ");
			if(a==b){
				a=1;
				b++;
				System.out.println();
			}
			else{
				a++;
			}
		}						//自己想出来的方式
		System.out.println("**************************");	//标准四行代码乘法表
		for(int j=1;j<=9;j++){
			for(int i=1;i<=j;i++){
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
		System.out.println("******************");	//1到9，乘以本身到1的顺序
		for(int g=1;g<=9;g++){
			for(int h=g;h>=1;h--){
				System.out.print(g+"*"+h+"="+(g*h)+"\t");
			}
			System.out.println();
		}
		System.out.println("******************");	//9到1，乘以本身到1的顺序
		for(int n=9;n>=1;n--){
			for(int m=n;m>=1;m--){
				System.out.print(n+"*"+m+"="+(n*m)+"\t");
			}
			System.out.println();
		}
		System.out.println("******************");	//1到9，乘以本身到9的顺序
		for(int c=1;c<=9;c++){
			for(int d=c;d<=9;d++){
				System.out.print(c+"*"+d+"="+(c*d)+"\t");
			}
			System.out.println();
		}
	}

}
