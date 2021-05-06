package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	static int happinessLevel = 0;
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		 String pet = JOptionPane.showInputDialog("What kind of pet do you want to buy? Dog,Cat,Parrot");
		 
		
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		 int i = 0;
		while(i<10) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Happiness Options", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Take on a walk", "Cuddle", "Food","Water" }, null);

			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	if(task==0) {
		takeOnAWalk();
		if(pet.equalsIgnoreCase("dog")) {
			happinessLevel++;
		}
		if(pet.equalsIgnoreCase("cat")) {
			happinessLevel--;
		}
		if(pet.equalsIgnoreCase("parrot")) {
			happinessLevel--;
		}
			
	}
	if(task == 1) {
		cuddle();
		if(pet.equalsIgnoreCase("dog")) {
			happinessLevel++;
		}
		if(pet.equalsIgnoreCase("cat")) {
			happinessLevel++;
		}
		if(pet.equalsIgnoreCase("parrot")) {
			happinessLevel--;
		}
	}
	if(task == 2) {
		food();
		if(pet.equalsIgnoreCase("dog")) {
			happinessLevel++;
		}
		if(pet.equalsIgnoreCase("cat")) {
			happinessLevel++;
		}
		if(pet.equalsIgnoreCase("parrot")) {
			happinessLevel++;
		}
	}
	if(task == 3) {
		water();
		if(pet.equalsIgnoreCase("dog")) {
			happinessLevel++;
		}
		if(pet.equalsIgnoreCase("cat")) {
			happinessLevel++;
		}
		if(pet.equalsIgnoreCase("parrot")) {
			happinessLevel++;
		}
	}
	if(happinessLevel == 6) {
		JOptionPane.showMessageDialog(null, "You love your pet, I can tell!");
		break;
	}
		}
				
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}
	static void takeOnAWalk() {
		JOptionPane.showMessageDialog(null, "Your pet might enjoy to go for a walk");
	}
	static void cuddle() {
		JOptionPane.showMessageDialog(null, "Your pet might enjoy to cuddle and might grr at you");
		
	}
	static void food() {
		JOptionPane.showMessageDialog(null, "Your pet might be picky about the food they eat");
		
	}
	static void water() {
		JOptionPane.showMessageDialog(null, "Your pet might not be thirsty");
		
	}
}
