package corejava.ch02.ex.chendachao.e3;
     // public class TestMyPoint extends MyPoint{

     public class TestMyPoint{

            public static void main(String[] args){

                MyPoint start = new MyPoint();
                MyPoint end = new MyPoint();

                MyPoint stray = end;

                //MyPoint stray = new MyPoint();
                //int[] MyPoint start = new MyPoint();
                //int[] MyPoint end = new MyPoint();
                //   start.toString(10,10);
                 //  end.toString(20,30);
        
                  start.x = 10;
                  start.y = 10;

                  end.x = 20;
                  end.y = 30;
           
                 //stray.x = end.x;
                 //stray.y = end.y;

                 start.toString();
                 end.toString();

               System.out.println("Start point is "+start);  
               System.out.println("End point is "+end);            

               System.out.println("Stary point is "+stray);            
               }       
 }
      
