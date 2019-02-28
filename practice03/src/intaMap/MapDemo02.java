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
 * 4、加入面向对象
 * 
 * @author 银涛
 *
 */
public class MapDemo02 {

	public static void main(String[] args) {
		//1、分割字符串
		String arr[] = "This is a cat and that is a mice and where is the food ? ".split(" ");
		Map<String,Letter> map = new HashMap<String,Letter>();
		for(String key:arr){
			//第一次查看，是否存在袋子
			if(!map.containsKey(key)){	//不存在
				map.put(key, new Letter(key));	//需要往Letter里面加入新的构造器只含（String str）
			}
			//获取袋子
			Letter value = map.get(key);
			value.setCount(value.getCount()+1);
		}
			//3、查看每个单词出现的次数
		for(String key:map.keySet()){
			Letter value = map.get(key);
			System.out.println(key+"-->"+value.getCount());
		}
			
	}

}
