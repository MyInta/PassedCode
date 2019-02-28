package intaMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 分拣存储： 1：N
 * 统计单词出现的次数
 * 例句：This is a cat and that is a mice and where is the food ? 
 * 
 * 思路
 * 1、分割字符串
 * 2、分拣存储
 * 3、按要求查看 单词出现的次数
 * 
 * @author 银涛
 *
 */
public class MapDemo01 {

	public static void main(String[] args) {
		//1、分割字符串
		String arr[] = "This is a cat and that is a mice and where is the food ? ".split(" ");
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String key:arr){
			//System.out.println(key);	//每个单词
			/*if(!map.containsKey(key)){	//map是否包含有该单词，不存在
				map.put(key, 1);
			}else{						//存在
				map.put(key, map.get(key)+1);
			}*/
			Integer value = map.get(key);
			if(null==value){
				map.put(key, 1);	//千万别单纯的写成value=1;键值对是要绑定的
			}else{
				map.put(key, ++value);
			}
		}
			//3、查看每个单词出现的次数
			Set<String> keySet = map.keySet();
			//获取迭代器对象
			Iterator<String> it = keySet.iterator(); 
			while(it.hasNext()){	//判断
				String key = it.next();
				Integer value = map.get(key);
				System.out.println(key+"-->"+value);
				
			}
	}

}
