package corejava.ch05.ex.e1;

public class TeacherTest 
{
	public static void main(String[] args) 
	{
		
		Teacher t = new Teacher("cho",23,3000.0);
		
		

		System.out.println("name=" + t.getName());
		System.out.println("age=" + t.getAge());
		System.out.println("salary=" + t.getSalary());

		t.increaseAge();
		System.out.println("new age=" + t.getAge());
	}
}
