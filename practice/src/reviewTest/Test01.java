package reviewTest;

public class Test01 {
	public static void main(String[] args) {
		char c1 = 'a';
		int t = c1+2;
		char c2 = (char)t;
		for(int i=0;i<26;i++){
			char temp = (char)(c1+i);
			System.out.print(temp+"\t");
		}
	}
}
