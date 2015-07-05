package corejava.ch05.ex.e5;
public class Stack{
  private int[] array;
  private int index;
  private int maxLength;

  public Stack(){
   maxLength = 1000;
   array = new int[maxLength];
   index = 0;
  }
  public Stack(int length){
    if (length<0){
	 System.out.println("array length not correct!");
	 System.exit(1);
	}
	maxLength = length;
	array = new int[maxLength];
	index = 0;
  }
  //动态扩展功能
  public void reset(){
  int[] temp = new int[maxLength*2];
  System.arraycopy(array,0,temp,0,index);
  array = temp;
  temp = null;
  }
  //入栈
  public void push(int value){
  if(index>=maxLength){
  reset();
  }
  array[index++] = value;
  }
  //出栈
  public int  pop(){
  int res = array[index-1];
  array[--index] = 0;
  return res;
  }
  //队列长度
  public int length(){
  return index;
  }

}
