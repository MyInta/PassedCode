package collection;

import java.util.HashSet;
import java.util.Set;

/**
 * ����Set�ĳ��÷���
 * @author ����
 *
 */
public class TestSet {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("aaa");
		set.add("bbb");
		set.add(new String("aaa"));	//����set�����������򲻿��ظ����õ�hashcode��equal��
		System.out.println(set.size());
			
	}
}
