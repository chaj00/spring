package di.setter03;

public class FileOutputter implements Outputter{
	String filePath;
	
	public FileOutputter(){
		
	}
	public FileOutputter(String filePath) {
		super();
		this.filePath = filePath;

	}

	
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	@Override
	public void output(String message) {
		System.out.println("FileOutputter: "+message);
		
	}

}
