package hw7;

public class Cow extends Animal {
	public String aboutMe() {
		return "Cow";
	}
	
	public String diet() {
		return "grass, hay, and corn";
	}
	
	public String produces() {
		return "milk and cheese";
	}
	
	public String expectedThreeFacts() {
		return "Cowgrass, hay, and cornmilk and cheese";
	}
	
	public String stateThreeFacts() {
		return this.aboutMe() + this.diet() + this.produces();
	}

}
