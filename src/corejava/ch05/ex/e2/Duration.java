package corejava.ch05.ex.e2;
 
public class Duration{
  int hours,minutes,seconds;
   public Duration(int hours,int minutes,int seconds){
      this.hours = hours;
	  this.minutes = minutes;
	  this.seconds = seconds;

    }
   public Duration(int seconds){
   this.hours = seconds/3600;
   this.minutes = seconds/60%60;
   this.seconds = seconds%60;
   }
   public int getHours(){
   return hours;
   }
   public void setHours(int hours){
   this.hours = hours;
   }

   public int getMinutes(){
   return minutes;
   }
   public void setMinutes(int minutes){
   this.minutes = minutes;
   }
   public int getSeconds(){
   return seconds;
   }
   public void setSeconds(int seconds){
   this.seconds = seconds;
   }
   public String toString(){
   return "hours:"+hours+"\tminutes:"+minutes+"\tseconds:"+seconds;
   }
}
