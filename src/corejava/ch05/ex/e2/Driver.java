package corejava.ch05.ex.e2;

public class Driver {
	public static void main(String[] args) {
		Track myTrack = new Track();             
        myTrack.setTitle("Watching The Wheels");
		
		Duration myDuration = new Duration(686665);
        //Duration myDuration = new Duration(0, 3, 48);
		myTrack.setDuration(myDuration);
        System.out.println("myTrack is: " + myTrack);		
		System.out.println("Title = " + myTrack.getTitle());
		System.out.println("Duration = " + myTrack.getDuration().toString());
	}
}
