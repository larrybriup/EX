package corejava.ch02.ex.chendachao.e1;

public class StudentTest {
		public static void main(String[] args) 
	{
		//ŽŽœš¶ÔÏó
		Student s = new Student();
	//	System.out.println("salary=" + t.salary);
              String gender; 
               s.gender=true; 
                if(s.gender=true){
                  gender = "男";
                 
                   }else{
                gender = "女";
                      }
		//Îª¶ÔÏóµÄÊôÐÔž³Öµ
		s.name = "Cho";
                //s.gender = '男';
		s.age = 23;

		//Êä³ö¶ÔÏóµÄÊôÐÔ
		System.out.println("name=" + s.name);
                System.out.println("gender="+s.gender);
		System.out.println("age=" + s.age);

		//µ÷ÓÃÊ¹ÄêÁäÔöŒÓµÄ·œ·š²¢Êä³öÔöŒÓºóµÄÄêÁä
		s.increaseAge();
		System.out.println("new age=" + s.age);
	}
}
