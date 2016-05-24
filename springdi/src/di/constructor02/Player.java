package di.constructor02;


public class Player implements AbstractPlayer{
	/*ApplicationContext container = 
			new ClassPathXmlApplicationContext("config/bean.xml");
	Dice d = (Dice)container.getBean("dice");*/
	
	AbstractDice d;
	
	public Player(){
		
	}
	public Player(AbstractDice d) {
		super();
		this.d = d;
	}
	int totalValue=0;
	public void play(){
		totalValue=0;
		for (int i = 0; i < 3; i++) {
			totalValue+=d.getDiceValue();
		}
	}
	public int getTotalValue(){
		return totalValue;
	}
}
