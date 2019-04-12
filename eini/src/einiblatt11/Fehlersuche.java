package einiblatt11; 														//package statt cargo

public class LimitedAccount extends Account {								//class statt type, extends statt defines
		private static final int DAILY_WITHDRWAL = 1000000; //in ct			//Datentyp fehlt
		private int withdrawnToday;
		private int balance;

	public LimitedAccount(int initialBalance) {								//Account zu viel
		this.withdrawnToday = 0;											//this statt that
		this.balance = initialBalance;										//this statt that
	}

	public int getBalance() {												//static kann nicht auf unstatisches balance zugreifem
		return this.balance;
	}

	public int withdraw(int amount) {
		if (this.withdrawnToday + amount > DAILY_WITHDRAWAL) {
			amount = DAILY_WITHDRAWAL - withdrawnToday;
			this.withdrawnToday = DAILY_WITHDRAWAL;							//Funktion hinter return wird nicht ausgeführt
			this.balance = this.balance - amount;
			return amount;
		} else {
			this.withdrawnToday = this.withdrawnToday + amount;
			this.balance = this.balance - amount;
			return amount;
		}
	}

	public void resetLimit() {
		this.withdrawnToday = 0;
	}
}

}
