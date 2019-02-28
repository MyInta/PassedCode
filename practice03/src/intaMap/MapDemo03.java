package intaMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * ˼��������һ��Student�࣬���ԣ�name no score�ֱ�Ϊ���� �༶ �ɼ�
 * �������������+�ּ�洢��1�Զࣩ
 * @author ����
 *
 */
public class MapDemo03 {
	public static void main(String[] args) {
		//1������
		List<Student> stuList = exam();
		//2�������ɼ�
		Map<String,ClassRoom> map =count(stuList);
		//3���鿴�ɼ����ܷ֡�ƽ���֣�
		view(map);
	}
	/**
	 *�鿴ÿ������ֺܷ�ƽ����-->����map 
	 */
	public static void view(Map<String,ClassRoom> map){
		Set<String> keys = map.keySet();
		//��ȡ����������
		Iterator<String> keysIt = keys.iterator();
		//���ж�
		while(keysIt.hasNext()){
			//�ٻ�ȡ
			String no = keysIt.next();
			ClassRoom room = map.get(no);
			//�鿴�ܷ֣�����ƽ����
			double total = room.getTotal();
			double avg = total/room.getStuList().size();
			System.out.println(no+"-->"+total+"-->"+avg);
		}
	}
	
	/**
	 *ͳ�Ʒ���
	 *1���������
	 *2���ּ�洢
	 * 
	 */
	public static Map<String,ClassRoom> count(List<Student> list){
		Map<String,ClassRoom> map = new HashMap<String,ClassRoom>();
		//����List
		for(Student stu:list){
			//�ּ� �鿴�Ƿ���ڸñ�Ű༶��
			String no = stu.getNo();	//�༶���
			double score =stu.getScore();//��ֵ
			//��������ڣ������༶
			ClassRoom room = map.get(no);
			if(null==room){
				room = new ClassRoom(no);
				map.put(no, room);
			}
			//���ڣ�����ѧ��
			room.getStuList().add(stu);//����ѧ��
			room.setTotal(room.getTotal()+score);//�����ܷ�
		}
		
		return map;
	}
	/**
	 * ģ�⿼�� �������ݵ�List��
	 */
	public static List<Student> exam(){
		List<Student> list = new ArrayList<Student>();
		//���ѧ���ɼ�
		list.add(new Student("����","a",80));
		list.add(new Student("����","a",80));
		list.add(new Student("����","a",80));
		list.add(new Student("��ȩ","a",80));
		list.add(new Student("�Ҵ�","a",80));
		
		list.add(new Student("��Ǯ","b",64));
		list.add(new Student("��ٳ","b",78));
		list.add(new Student("����","b",99));
		list.add(new Student("����","b",56));
		list.add(new Student("̫��","b",93));
		return list;
	}
}
