package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class OppgaveO3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String numberTxt= showInputDialog("Type an integer that is bigger than 0 to get its factorial");
int number= parseInt(numberTxt);
if (number<1) {
	System.out.println("That is not bigger than 0!");
}else {
	int fact=1;
for(int i=1; i<=number;i++) {
		fact *=i;
}
System.out.println("the factorial of "+numberTxt+" is: "+ fact);
}
}
}
