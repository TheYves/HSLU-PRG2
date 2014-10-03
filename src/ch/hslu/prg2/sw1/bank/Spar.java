package ch.hslu.prg2.sw1.bank;

public class Spar extends Konto {
	private final double maxOut;

	public Spar(double saldo, double rate, double maxOut) {
		super(saldo, rate);
		this.maxOut = maxOut;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void payOut(double amount) {
		if (amount <= maxOut) {
			saldo -= amount;
		}
	}

	public void print() {
		super.print();
		System.out.println("maxOut: " + maxOut);
	}
}
