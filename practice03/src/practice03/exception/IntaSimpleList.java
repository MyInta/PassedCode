package practice03.exception;
/**
 * ����������ԭ��
 * ������������ʹ��
 * 
 * @author ����
 *
 */
public class IntaSimpleList {

	//����洢ֵ
	private String[] elem={"a","b","c"};
	//���鳤��
	private int size = elem.length;
	
	//������--��ָ�� �α�
	private int coursor=-1;
	
	//�����ж��Ƿ�����һ��
	public boolean hasNext(){
		return coursor+1<size;
	}
	//��ȡ��һ��
	public String next(){
		coursor++;
		return elem[coursor];
	}
	//ɾ����һ��
	public void remove(){
		//�ƶ�����Ԫ��
		System.arraycopy(elem, coursor+1, elem,
				coursor, size-(coursor+1));
		this.size--;	//�Ƴ����ֺ��ܳ��ȼ���
		this.coursor--;		//��Ϊnext��ʱ��ָ������ˣ�������Ҫ����ָ�����
	}
	public int size(){
		return this.size;
	}
	
	public static void main(String[] args) {
		IntaSimpleList list = new IntaSimpleList();
		
		if(list.hasNext()){
			System.out.println(list.next());
			list.remove();
		}
		if(list.hasNext()){
			System.out.println(list.next());
			list.remove();
		}
		if(list.hasNext()){
			System.out.println(list.next());
			list.remove();
		}
		if(list.hasNext()){	//�����ȡֵ����Ϊ���жϺ��ȡ
			System.out.println(list.next());
			list.remove();
		}
		
		System.out.println(list.size);
	}

}
