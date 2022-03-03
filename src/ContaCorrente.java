
public class ContaCorrente extends Conta {
	
	ContaCorrente(Cliente cliente){
		super(cliente);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.printf("Imprimindo extrato de conta corrente%n");
		super.imprimirExtrato();
	}
}
