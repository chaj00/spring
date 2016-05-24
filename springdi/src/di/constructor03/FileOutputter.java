package di.constructor03;

public class FileOutputter implements Outputter{
	String filePath;
	
	public FileOutputter(String filePath) {
		super();
		this.filePath = filePath;

	}


	@Override
	public void output(String message) {
		System.out.println("FileOutputter"+message);
		
	}

}
