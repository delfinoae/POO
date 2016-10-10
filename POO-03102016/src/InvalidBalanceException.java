
public class InvalidBalanceException extends Exception {
	public InvalidBalanceException() {
		super("O saldo não pode ser negativo.");
	} 
}
