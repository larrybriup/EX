package corejava.ch06.ex.ex1;

public class Fish extends Animal implements Pet{
String name;
public Fish(){}
public void setName(String name){
 this.name = name;
}
public String getName(){
  return name;

}
public void play(){
	 System.out.println("fish play");
}
public void walk(){
	 System.out.println("fish swim");
}
public void eat(){
	 System.out.println("fish eat");
}

}
