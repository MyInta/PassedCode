package practice;

public class TestWhileFor {
	public static void main(String[] args) {
		int sum=0;
		for(int a=1;a<=100;a+=2){    //for(int a=1;a<=100;a++){ if(a%2!=0){sum+=a}  }
			sum+=a;
		}
		System.out.println("һ������������Ϊ��"+sum);
		
		int sum02=0;
		int a=0;
		while(a<=100){
			sum02+=a;
			a+=2;
		}
		System.out.println("While�����һ������ż����Ϊ"+sum02);
		
		int sum03=0;
		for(int i=1;i<=1000;i++){
			if(i%5==0){
				sum03++;
				System.out.print(i+" ");   //����ʹ��System.out.println(i+"\t"); ������ȥ���Ҳ�м�ЪЧ��
				if(sum03%3==0){
					System.out.println();  //�����Ҫ�����У�����System.out.println("\n");����println���л����ϣ�ʹ��\n����
				}
			}
		}
	}
}
