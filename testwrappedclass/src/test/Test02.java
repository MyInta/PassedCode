package test;
/**
 * 测试自动装箱和拆箱
 * @author 银涛
 *
 */
public class Test02 {
	public static void main(String[] args) {
//		Integer i = new Integer(1000);
		Integer i = 1000;	//	JDK5.0以后。自动装箱 编译器帮我们改进代码 改成Integer i = new Integer(1000);
		Integer b = /*null;*/2000;	//使用null 时候 b.intValue不存在 因为B对象为空 不能调用其中的方法
	
		int c = b ;/*new Integer(1500);	*/	//	自动拆箱	编译器改进:b.intValue();
		
		System.out.println(c);
		Integer d = 1234;
		Integer d2 = 1234;
		System.out.println(d==d2);
		System.out.println(d.equals(d2));
		
		System.out.println("###############3");
		Integer d3 = 123;	//[-128,127]范围内数据仍会当作基本数据类型来处理
		Integer d4 = 123;
		System.out.println(d3==d4);
		System.out.println(d3.equals(d4));
		
	}
}
