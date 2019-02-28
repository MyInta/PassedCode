package stringbuilder;

/**
 * 测试StringBuilder的一些常用方法
 * @author 银涛
 *
 */

public class Test02 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		sb.delete(3,5).delete(3,5);	//结果abchijklmnopqrstuvwxyz
		System.out.println(sb);
		
		sb.reverse().reverse().reverse();
		System.out.println(sb);

	}
}
