package practice;

public class TestBreakContinue {
	public static void main(String[] args) {
		System.out.println("Begin");
		int j=0;
		while(true){
			int i=(int)Math.round(100*Math.random());
			System.out.println(i);
			j++;
			if(i==88){
				break;
			}
		}
		System.out.println("Game Over"+"\n"+"������У�"+j+"��");
		
		System.out.println("***************");
		for(int i=100;i<=150;i++){
			if(i%3!=0){				//100~150֮�䲻�ܱ�3�����������
				System.out.println(i);
			}
		}
		System.out.println("**************");
		for(int m=100;m<=150;m++){
			if(m%3==0){
				continue;		//�����break����ֻ��100��101��û�����ˡ�
			}
			System.out.println(m);
		}
	}
}
