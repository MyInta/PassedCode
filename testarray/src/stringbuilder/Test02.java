package stringbuilder;

/**
 * ����StringBuilder��һЩ���÷���
 * @author ����
 *
 */

public class Test02 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		sb.delete(3,5).delete(3,5);	//���abchijklmnopqrstuvwxyz
		System.out.println(sb);
		
		sb.reverse().reverse().reverse();
		System.out.println(sb);

	}
}
