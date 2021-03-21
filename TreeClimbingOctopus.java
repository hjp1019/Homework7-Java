package hw7;

public class TreeClimbingOctopus extends Animal {
	public String aboutMe() {
		return "Octopus";
	}
	
	public String Iswim() {
		return "water";
	}
	
	public String movement() {
		return "float right and left";
	}
	
	public String expectedThreeFacts() {
		return "Octopuswaterfloat right and left";
	}
	
	public String stateThreeFacts() {
		return this.aboutMe() + this.Iswim() + this.movement();
	}

}