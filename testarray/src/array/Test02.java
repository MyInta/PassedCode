package array;
/**
 * ����Ļ����﷨
 * @author ����
 *
 */
public class Test02 {
	public static void main(String[] args) {
		// ����
		int[] a;
		int b[];
		//�����������
		a= new int[4];
		b= new int[5];
		//��ʼ����������Ԫ�صĳ�ʼ����
		//Ĭ�ϳ�ʼ�����൱�ڳ�Ա������ʼ��������0 ����false,char\u0000,�������ͣ�null
		//��̬��ʼ��
		for(int i=0;i<a.length;i++){
			a[i] = i*12;
		}
		
		//��̬��ʼ��
		int c[] = {12,25,48,66 };	//���ȣ�4 ������Χ0~3
		Car cars[] ={
				new Car("����"),
				new Car("����"),
				new Car("���ǵ�")
				};
		Car c2 = new Car("����");
		System.out.println(c2==cars[0]);
		
 	}
}
