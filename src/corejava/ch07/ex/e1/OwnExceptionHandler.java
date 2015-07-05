package corejava.ch07.ex.e1;

public class OwnExceptionHandler {
public static void main(String[] args) throws OwnException {
	OwnExceptionSource oh = new OwnExceptionSource();
	try {
		oh.a(99,0);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		throw new OwnException("OwnException in OwnException class");
	}finally{
		System.out.println("finally");
	}
}
}
