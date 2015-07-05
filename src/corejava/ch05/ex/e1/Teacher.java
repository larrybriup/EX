package corejava.ch05.ex.e1;

public class Teacher
{
	public String name;		
	public int age;			
	public double salary;
  public Teacher(String name,int age,double salary){
       this.name = name;
	   this.age = age;
	   this.salary = salary;

   }
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
  return name;
  }
  public void setAge(int age){
    this.age = age;
  }
  public int getAge(){
  return age;
  }
  public void setSalary(double salary){
    this.salary = salary;
  }
  public double getSalary(){
  return salary;
  }
	/**public String toString(){
	return "name:" + name + "\tage:" + age+"\tsalary:"+salary;
					}*/
	public void increaseAge(){
		age++;
	}	
}
