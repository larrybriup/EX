package corejava.ch08.ex.e3;

public class StringTest {
public static void main(String[] args) {
	String s = "1.7+2-3*4+9/3=";
	String[] s1=s.split("[+*/=-]");
	String[] s2=s.split("[0-9.=]");
	for(String ss:s1){
		System.out.print(ss+"  ");
	}
	System.out.println();
	for(String sss:s2){
		System.out.print(sss+"n  ");
	}
	
}
}
