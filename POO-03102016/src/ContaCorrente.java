public class ContaCorrente {

    private double saldo;

    public ContaCorrente(double saldoInicial) throws InvalidBalanceException{
    	if ( saldoInicial < 0 ) {
    		throw new InvalidBalanceException();
    	}
    	saldo = saldoInicial;
    }

    public void deposito(double valor){
        saldo += valor;
    }

    public void retirada(double valor) throws InvalidBalanceException{
    	if ( ( saldo - valor ) < 0 ) {
    		throw new InvalidBalanceException();
    	}
        saldo -= valor;
    }

    public double getSaldo(){
    	return(saldo);
	}

}