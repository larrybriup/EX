package corejava.ch05.ex.e3;
public class Circle extends Shape{
    public double r;//圆的半径
    public Circle(){
	 this(1.0);
	}
	public Circle(double r){
	this.r = r;
	}
	public Circle(int x,int y,double r){
	this.x = x;
	this.y = y;
	this.r = r;
	
	}
  public void draw(){
  System.out.println("draw in circle:"+" x="+x+" y="+y+" r="+r);
  }

}
