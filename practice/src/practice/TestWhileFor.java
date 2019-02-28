package practice;

public class TestWhileFor {
	public static void main(String[] args) {
		int sum=0;
		for(int a=1;a<=100;a+=2){    //for(int a=1;a<=100;a++){ if(a%2!=0){sum+=a}  }
			sum+=a;
		}
		System.out.println("一百以内奇数和为："+sum);
		
		int sum02=0;
		int a=0;
		while(a<=100){
			sum02+=a;
			a+=2;
		}
		System.out.println("While语句中一百以内偶数和为"+sum02);
		
		int sum03=0;
		for(int i=1;i<=1000;i++){
			if(i%5==0){
				sum03++;
				System.out.print(i+" ");   //或者使用System.out.println(i+"\t"); 即加入去表符也有间歇效果
				if(sum03%3==0){
					System.out.println();  //如果想要换两行，可以System.out.println("\n");即在println换行基础上，使用\n换行
				}
			}
		}
	}
}
