package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class primeornot {
public static void main(String[] args) {
	
	String number = JOptionPane.showInputDialog("Enter a number, 1-100");
	int numberAsInt = Integer.parseInt(number);
	for(int i=2;i<= numberAsInt - 1; i++) {
	if(numberAsInt % i == 0) {
		JOptionPane.showMessageDialog(null, "Your number " + numberAsInt + " is a composite number, not a prime number");
	System.exit(0);
	}
	}
	
		JOptionPane.showMessageDialog(null, "Your number is prime");
		System.exit(0);
	
	}
}

