package corejava.ch05.ex.e3;
public class Rectangle extends Shape{
  public double height,width;
  public Rectangle(){
  this(1.0,1.0);
  
  }
  public Rectangle(double height,double width){
  this.height = height;
  this.width = width;
  }

  public Rectangle(int x,int y,double height,double width){
      this.x = x;
	  this.y = y;
	  this.height = height;
      this.width = width;
  }
  public void draw(){
  System.out.println
  ("draw in rectangle:"+" x="+x+" y="+y+" height="+height+" width="+width);
  }

}
