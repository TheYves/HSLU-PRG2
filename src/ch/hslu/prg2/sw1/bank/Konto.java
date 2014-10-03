package ch.hslu.prg2.sw1.bank;

public class Konto implements IPrintable {
    private static int count = 0;
    
    protected int no;
    protected double saldo;
    protected double rate;
    
    public Konto() {
		createNo();
    }
    
    public Konto(double saldo, double rate) {
		createNo();
		this.saldo = saldo;
		this.rate = rate;
    }
    
    private void createNo() {
		count++;
		no = count;
    }
    
    public void payIn(double amount) {
		this.saldo += amount;
    }
    
    public void payOut(double amount) {
		this.saldo -= amount;
    }
    
    public void print() {
		System.out.println("no: " + no + ", saldo: " + saldo + ", rate: " + rate);
    }
    
    public double getSaldo() {
		return saldo;
    }
}
