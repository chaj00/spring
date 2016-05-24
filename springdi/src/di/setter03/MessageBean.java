package di.setter03;

public class MessageBean implements InterMessage{
	String name;
	String greeting;
	Outputter outputter;
	
	public MessageBean(){
		
	}
	public MessageBean(String name, String greeting, Outputter outputter) {
		super();
		this.name = name;
		this.greeting = greeting;
		this.outputter = outputter;
		
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public void setOutputter(Outputter outputter) {
		this.outputter = outputter;
	}
	
	
	
	@Override
	public void sayHello() {
		outputter.output(name+" "+greeting);
		
	}
	
}
