package array02;
/**
 * ��װ�˾���ĳ��÷���
 * @author ����
 *
 */


public class Matrix {
	/**
	 * ��ӡָ���ľ���S
	 * @param c
	 */
	public static void print(int[][] c){
		for(int i=0;i<c.length;i++){
			for(int j =0;j<c.length;j++){
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	/**
	 * ����ӷ�
	 * @param a
	 * @param b
	 * @return
	 */
	public static int[][] add(int[][]a,int[][] b){
		int c [][] = new int [a.length][a.length] ;
		for(int i=0;i<c.length;i++){
			for(int j =0;j<c.length;j++){
				c[i][j] = a[i][j]+b[i][j];
			}
		}
		return c;
	}
	
	public static void main(String[] args) {
		int a[][] = {
				{1,3},
				{2,4},
		};
		
		int b[][] = {
				{3,4},
				{5,6},
		};
		
		int c[][] = add(a,b);
		
//		for(int i=0;i<c.length;i++){
//			for(int j =0;j<c.length;j++){
//				c[i][j] = a[i][j]+b[i][j];
//			}
//		}
		
		
//		c[0][0] = a[0][0]+b[0][0];
//		c[0][1] = a[0][1]+b[0][1];
//		c[1][0] = a[1][0]+b[1][0];
//		c[1][1] = a[1][1]+b[1][1];
		
		// ��ӡ����
//		for(int i=0;i<c.length;i++){
//			for(int j =0;j<c.length;j++){
//				System.out.print(c[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		print(c);
	}
}
