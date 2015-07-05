package corejava.ch05.ex.e2;
public class Track{
 public String title;
 public Duration duration;

   public String getTitle(){
    return title;
   }
   public void setTitle(String title){
    this.title = title;
   } 
   public Duration getDuration(){
   
   return duration;
   }
   public void setDuration(Duration duration){
   this.duration = duration;
   }
  
   public String toString(){
   return "my Track title is:"+title+"\tduration is:"+duration;
   }

}
