package corejava.ch07.ex.e1;

public class OwnException extends Exception{
   public OwnException(){}

public OwnException(String message, Throwable cause, boolean enableSuppression,
		boolean writableStackTrace) {
//	super(message, cause, enableSuppression, writableStackTrace);
	// TODO Auto-generated constructor stub
}

public OwnException(String message, Throwable cause) {
	super(message, cause);
	// TODO Auto-generated constructor stub
}

public OwnException(String message) {
	super(message);
	// TODO Auto-generated constructor stub
}

public OwnException(Throwable cause) {
	super(cause);
	// TODO Auto-generated constructor stub
}
   
}
