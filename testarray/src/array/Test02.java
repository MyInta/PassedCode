package array;
/**
 * 数组的基本语法
 * @author 银涛
 *
 */
public class Test02 {
	public static void main(String[] args) {
		// 声明
		int[] a;
		int b[];
		//创建数组对象
		a= new int[4];
		b= new int[5];
		//初始化（对数组元素的初始化）
		//默认初始化；相当于成员变量初始化：数字0 布尔false,char\u0000,引用类型：null
		//动态初始化
		for(int i=0;i<a.length;i++){
			a[i] = i*12;
		}
		
		//静态初始化
		int c[] = {12,25,48,66 };	//长度：4 索引范围0~3
		Car cars[] ={
				new Car("奔驰"),
				new Car("宝马"),
				new Car("比亚迪")
				};
		Car c2 = new Car("奔驰");
		System.out.println(c2==cars[0]);
		
 	}
}
