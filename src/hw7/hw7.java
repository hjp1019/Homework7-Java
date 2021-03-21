package hw7;

public class hw7 {

	public static void main(String[] args) {
		AnimalClassTester qa = new AnimalClassTester();
		
		Animal clarence = new Tyrannosaur();
		if (qa.testAnimalObject(clarence)) {
			System.out.println("Tyrranosaur class passes");
		} else {
			System.out.println(">>>>Tyrranosaur class Failed!<<<<");
		}
		Animal opus = new Penguin();
		if (qa.testAnimalObject(opus)) {
			System.out.println("Penguin class passes");
		} else {
			System.out.println(">>>>Penguin class Failed!<<<<");
		}
		Animal mrsolearys = new Cow();
		if (qa.testAnimalObject(mrsolearys)) {
			System.out.println("Cow class passes");
		} else {
			System.out.println(">>>>Cow class Failed!<<<<");
		}
		Animal quill = new TreeClimbingOctopus();
		if (qa.testAnimalObject(quill)) {
			System.out.println("TreeClimbingOctopus class passes");
		} else {
			System.out.println(">>>>TreeClimbingOctopus class Failed!<<<<");
		}
		
	}

}
