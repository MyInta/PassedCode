package intaMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * �ּ�洢�� 1��N
 * ͳ�Ƶ��ʳ��ֵĴ���
 * ���䣺This is a cat and that is a mice and where is the food ? 
 * 
 * ˼·
 * 1���ָ��ַ���
 * 2���ּ�洢
 * 3����Ҫ��鿴 ���ʳ��ֵĴ���
 * 4�������������
 * 
 * @author ����
 *
 */
public class MapDemo02 {

	public static void main(String[] args) {
		//1���ָ��ַ���
		String arr[] = "This is a cat and that is a mice and where is the food ? ".split(" ");
		Map<String,Letter> map = new HashMap<String,Letter>();
		for(String key:arr){
			//��һ�β鿴���Ƿ���ڴ���
			if(!map.containsKey(key)){	//������
				map.put(key, new Letter(key));	//��Ҫ��Letter��������µĹ�����ֻ����String str��
			}
			//��ȡ����
			Letter value = map.get(key);
			value.setCount(value.getCount()+1);
		}
			//3���鿴ÿ�����ʳ��ֵĴ���
		for(String key:map.keySet()){
			Letter value = map.get(key);
			System.out.println(key+"-->"+value.getCount());
		}
			
	}

}
