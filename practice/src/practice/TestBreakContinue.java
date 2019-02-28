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
		System.out.println("Game Over"+"\n"+"随机数有："+j+"个");
		
		System.out.println("***************");
		for(int i=100;i<=150;i++){
			if(i%3!=0){				//100~150之间不能被3整除的数输出
				System.out.println(i);
			}
		}
		System.out.println("**************");
		for(int m=100;m<=150;m++){
			if(m%3==0){
				continue;		//如果用break，则只有100和101，没下文了。
			}
			System.out.println(m);
		}
	}
}
