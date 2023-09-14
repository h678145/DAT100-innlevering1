package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveB4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double incomeTier0=198349;
		double incomeTier1=279149;
		double incomeTier2=642949;
		double incomeTier3=926799;
		double incomeTier4=1499999;
		double taxTier1=0.017;
		double taxTier2=0.04;
		double taxTier3=0.135;
		double taxTier4=0.165;
		double taxTier5=0.175;
		double tax=0;
		double tax1=(incomeTier1-incomeTier0)*taxTier1;
		double tax2=tax1+(incomeTier2-incomeTier1)*taxTier2;
		double tax3=tax2+(incomeTier3 -incomeTier2)*taxTier3;
		double tax4=tax3+(incomeTier4-incomeTier3)*taxTier4;

		String cashMoniesTxt= showInputDialog("Please enter you yearly cash monies in kr:");
		int cashMonies = parseInt(cashMoniesTxt);
		if (cashMonies < 0) {
			System.out.println("Error, you can't pay taxes from nothing");
		} else if(cashMonies<=incomeTier0) {
			tax = (cashMonies* tax);
		}else if(cashMonies<=incomeTier1) {
			tax = (cashMonies-incomeTier0)*taxTier1;
		}else if(cashMonies<=incomeTier2) {
			tax = tax1 + (cashMonies-incomeTier1)*taxTier2;
		}else if(cashMonies<=incomeTier3) {
			tax = tax2 + (cashMonies-incomeTier2)*taxTier3;
		}else if(cashMonies<=incomeTier4) {
			tax = tax3 + (cashMonies-incomeTier3)*taxTier4;
		}else {
			tax = tax4 + (cashMonies-incomeTier4)*taxTier5;
		}double realcashMonies=cashMonies-tax;

		System.out.println("here's your cash monies after bracket taxes: "+(int)realcashMonies+"kr and here's how much you paid in bracket taxes:"+(int)tax+"kr");

	}
}

