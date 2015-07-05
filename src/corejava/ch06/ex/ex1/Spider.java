package corejava.ch06.ex.ex1;

public class Spider extends Animal{
	private int legs;
 public Spider(){}

 public Spider(int legs){
  this.legs = legs;
}
   public void walk(){
	   System.out.println("spider walk");
   }
  public void eat(){
	  System.out.println("spider eat");
  }

}