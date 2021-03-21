package hw7;

public class Tyrannosaur extends Animal {
	
	public String getName() {
		return "Tyranosaurus Rex";
	}
	
	public String roar() {
		return "Roarrrr!";
	}
	
	public String myFood() {
		return "other dinosaurs";
	}
	
	public String expectedThreeFacts() {
		return "Tyranosaurus RexRoarrrr!other dinosaurs";
	}
	
	public String stateThreeFacts() {
		return this.getName() + this.roar() + this.myFood();
	}

}
