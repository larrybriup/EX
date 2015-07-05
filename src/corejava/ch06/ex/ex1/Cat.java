package corejava.ch06.ex.ex1;

public class Cat extends Animal implements Pet{

	  String name;
	  /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "cat:"+name;
	}
	public Cat(String name){
	    this.name = name;
	  }
	  public Cat(){}
	  public void setName(String name){
	     this.name = name;
	  }
	  public String getName(){
	     return name;
	  }
	  public void play(){
		  
		  System.out.println("play");
	  }
	  public void eat(){
		  System.out.println("cat eat");
	  }

	}
