package array02;
/**
 * ���Զ�ά����
 * 
 * @author ����
 *
 */
public class Test01 {
	public static void main(String[] args) {
//		int [][] a = {
//					{1,2},
//					{3,4,0,6},
//					{8,9,10}
//				};
		int [][] a = new int[3][];	//	3������Է�����Ԫ�أ�������һά�������
		a [0] = new int [2];	// 	�����λ������ ����ǰ��һά��������
		a [1] = new int [4];
		a [2] = new int [3];
		
		a[0][0] = 1;
		a[0][1] = 2;
		
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 0;
		a[1][3] = 6;
		
		a[2][0] = 8;
		a[2][1] = 9;
		a[2][2] = 10;
		
		System.out.println(a[2][2]);
	}
}
