package practice02;

public class Student {

	 String name;
	 int id;
	 
	 static int ss;
	 
	 public static void printss(){
		 System.out.println(ss);
	 }

	 public void study(){
		 System.out.println(name+"在学习");
		 }
	 public void sayHello(String sname){
		 System.out.println(name+"向"+sname+"说，你好");
	 }	
	 
	 public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "inta";
		s1.study();
		s1.sayHello("dd");
	}
}
