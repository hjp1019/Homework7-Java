package hw7;

public class AnimalClassTester {
	
	public boolean testAnimalObject(Animal animal) {
		if (animal.stateThreeFacts().equals(animal.expectedThreeFacts())) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
