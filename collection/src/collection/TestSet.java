package collection;

import java.util.HashSet;
import java.util.Set;

/**
 * 测试Set的常用方法
 * @author 银涛
 *
 */
public class TestSet {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("aaa");
		set.add("bbb");
		set.add(new String("aaa"));	//由于set里面数据无序不可重复，用的hashcode的equal。
		System.out.println(set.size());
			
	}
}
