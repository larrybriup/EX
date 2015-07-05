package corejava.ch02.ex.chendachao.e2;

public class TeacherTest 
{
	public static void main(String[] args) 
	{
		//ŽŽœš¶ÔÏó
		Teacher t = new Teacher();
		
		//Îª¶ÔÏóµÄÊôÐÔž³Öµ
		t.name = "George";
		t.age = 30;
		t.salary = 10000;

		//Êä³ö¶ÔÏóµÄÊôÐÔ
		System.out.println("name=" + t.name);
		System.out.println("age=" + t.age);
		System.out.println("salary=" + t.salary);

		//µ÷ÓÃÊ¹ÄêÁäÔöŒÓµÄ·œ·š²¢Êä³öÔöŒÓºóµÄÄêÁä
		t.increaseAge();
		System.out.println("new age=" + t.age);
                t.increaseSalary();
                System.out.println("new salary="+t.salary);
	}
}
