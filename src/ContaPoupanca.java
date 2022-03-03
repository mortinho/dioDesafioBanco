
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.printf("Imprimindo extrato de conta poupanca%n");
		super.imprimirExtrato();
	}
}
