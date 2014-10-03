package ch.hslu.prg2.sw1.bank;

public class Bank {
    private final String name;
    
    private LinkedList<Konto> accountList = new LinkedList<>();
    
    public Bank(String name) {
		this.name = name;
    }
    
    public Konto openKonto() {
		Konto konto = new Konto();
		accountList.insert(konto);
		return konto;
    }
    
    public Spar openSpar(double saldo, double rate, double maxOut) {
		Spar spar = new Spar(saldo, rate, maxOut);
		accountList.insert(spar);
		return spar;
    }
    
    public int noOfAccounts() {
		return accountList.length();
    }
    
    public void printAccounts() {
		accountList.print();
    }
    
    public boolean isFound(Konto konto) {
		return accountList.isFound(konto);
    }
    
    public void printFund() {
		System.out.println(accountList.getFund());
    }
}
