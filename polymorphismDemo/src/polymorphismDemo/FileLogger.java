package polymorphismDemo;

public class FileLogger extends BaseLogger{
	public class BaseLogger {
	    public void Log(String message) {
	    	System.out.println("Log to File :" +message);
	    }
}
}