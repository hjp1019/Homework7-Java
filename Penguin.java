package hw7;

public class Penguin extends Animal {
	public String flightless() {
		return "penguin";
	}
	
	public String IEat() {
		return "mostly fish";
	}
	
	public String movement() {
		return "waddle and swim";
	}
	
	public String expectedThreeFacts() {
		return "penguinmostly fishwaddle and swim";
	}
	
	public String stateThreeFacts() {
		return this.flightless() + this.IEat() + this.movement();
	}

}
