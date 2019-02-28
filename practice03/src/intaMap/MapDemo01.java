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
 * 
 * @author ����
 *
 */
public class MapDemo01 {

	public static void main(String[] args) {
		//1���ָ��ַ���
		String arr[] = "This is a cat and that is a mice and where is the food ? ".split(" ");
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String key:arr){
			//System.out.println(key);	//ÿ������
			/*if(!map.containsKey(key)){	//map�Ƿ�����иõ��ʣ�������
				map.put(key, 1);
			}else{						//����
				map.put(key, map.get(key)+1);
			}*/
			Integer value = map.get(key);
			if(null==value){
				map.put(key, 1);	//ǧ��𵥴���д��value=1;��ֵ����Ҫ�󶨵�
			}else{
				map.put(key, ++value);
			}
		}
			//3���鿴ÿ�����ʳ��ֵĴ���
			Set<String> keySet = map.keySet();
			//��ȡ����������
			Iterator<String> it = keySet.iterator(); 
			while(it.hasNext()){	//�ж�
				String key = it.next();
				Integer value = map.get(key);
				System.out.println(key+"-->"+value);
				
			}
	}

}
