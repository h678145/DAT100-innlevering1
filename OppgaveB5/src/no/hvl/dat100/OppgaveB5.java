package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class OppgaveB5 {

	public static void main(String[] args) {
		   for (int i=0;i<10;i++) {
		String numberTxt= showInputDialog("Please enter you exam score here:");
		int number = parseInt(numberTxt);
		if (number < 0 || number > 100) {
			i--;
			System.out.println("Error: Invalid input. Please enter a number between 0 and 100.");
        } else {
            switch (number / 10) {
                case 10:
                case 9:
                    System.out.println("A");
                    break;
                case 8:
                    System.out.println("B");
                    break;
                case 7:
                case 6:
                    System.out.println("C");
                    break;
                case 5:
                case 4:
                    System.out.println("D");
                    break;
                default:
                    System.out.println("F");
            }
        }
     }
  }	
}