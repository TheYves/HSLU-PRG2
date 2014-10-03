package ch.hslu.prg2.sw1.bank;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank("Superbank");

		Konto konto1 = bank.openKonto();
		konto1.payIn(1235);
		konto1.payOut(100);

		bank.openKonto();
		bank.openSpar(0, 1.02, 10000);
		bank.openSpar(1000, 1.02, 10000);

		System.out.println(bank.noOfAccounts());
		bank.printAccounts();
		bank.printFund();
	}

}
