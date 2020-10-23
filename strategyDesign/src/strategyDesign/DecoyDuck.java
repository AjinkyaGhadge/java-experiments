package strategyDesign;

public class DecoyDuck {
	QuackBehavior quackBehavior;
	int loudness = 10;
	
	void DecoyDuckSound(QuackBehavior qb) {
		qb.quack();
	}
	public static void main(String[] args) {
		DecoyDuck d = new DecoyDuck();
		d.DecoyDuckSound(new Quack());
		d.DecoyDuckSound(new Squeak());
	}

}
