package corejava.ch07.ex.e1;

public class OwnExceptionSource {
	public int a(int a,int b) throws OwnException {
		
		int res = a / b;
		return res;
		// throw new OwnException("OwnException 私密打");
	
	}
}
