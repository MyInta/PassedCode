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
		}						//�Լ�������ķ�ʽ
		System.out.println("**************************");	//��׼���д���˷���
		for(int j=1;j<=9;j++){
			for(int i=1;i<=j;i++){
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
		System.out.println("******************");	//1��9�����Ա���1��˳��
		for(int g=1;g<=9;g++){
			for(int h=g;h>=1;h--){
				System.out.print(g+"*"+h+"="+(g*h)+"\t");
			}
			System.out.println();
		}
		System.out.println("******************");	//9��1�����Ա���1��˳��
		for(int n=9;n>=1;n--){
			for(int m=n;m>=1;m--){
				System.out.print(n+"*"+m+"="+(n*m)+"\t");
			}
			System.out.println();
		}
		System.out.println("******************");	//1��9�����Ա���9��˳��
		for(int c=1;c<=9;c++){
			for(int d=c;d<=9;d++){
				System.out.print(c+"*"+d+"="+(c*d)+"\t");
			}
			System.out.println();
		}
	}

}
