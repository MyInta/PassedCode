package test.string;

public class TestString {
	public static void main(String[] args) {
		System.out.println("Abcbd".indexOf('b'));//从左往右找序数
		System.out.println("Abcbd".lastIndexOf('b'));//从右往左找第一次出现的序数
		System.out.println("Abcbd".startsWith("Abc"));
		System.out.println("Abcbd".endsWith("bd"));
		System.out.println("Abcbd".toLowerCase());//小写
		System.out.println("Abcbd".toUpperCase());//大写

		System.out.println("#####################");
		StringBuilder gh=new StringBuilder("a");
		for(int i=0;i<10;i++){	//要避免这种代码！！！！！ 浪费空间 有11个对象（a a0 a01 ... ... a0123456789）
			/*gh += i;*/		//最好的解决办法用 gh.append(i); 即调用了累加字符串功能，这样修改的只有一个对象，没增加新对象	
			gh.append(i);	//注意使用gh.append的时候 前体是gh属于StringBuilder的类型
		}
		System.out.println(gh);
	}
}
