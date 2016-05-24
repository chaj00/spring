package di.constructor03;

public class ConsoleOutputter implements Outputter{
	String filePath;
	
		
	public ConsoleOutputter(String filePath) {
		super();
		this.filePath = filePath;

	}


	@Override
	public void output(String message) {
		System.out.println("ConsoleOutputter"+message);
		
	}	

}
