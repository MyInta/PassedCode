package practice;

public class Student {
	//��̬������
	 String name;
	 int id;
	 int age;
	 String gender;
	 int weight;
	 
	 Computer computer;

	 
	 //��̬����Ϊ
	 public void study(){
		 System.out.println(name+"��ѧϰ");
		 }
	 public void sayHello(String sname){
		 System.out.println(name+"��"+sname+"˵�����");
	 }	
	 
	 public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "inta";
		s1.study();
		s1.sayHello("dd");
	}
}
