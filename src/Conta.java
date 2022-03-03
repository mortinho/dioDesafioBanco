
public abstract class Conta implements IConta {
	private static int PROXIMA_CONTA = 1;
	private static final int AGENCIA_PADRAO = 1;
	
	protected Cliente cliente;
	protected int agencia;
	protected int numero;
	protected double valor;
	
	public Conta(Cliente cliente) {
		this.cliente = cliente;
		this.agencia = AGENCIA_PADRAO;
		this.numero = PROXIMA_CONTA++;
		this.valor = 0;
	}
	@Override
	public void sacar(double valor) {
		this.valor-= valor;
	}
	
	@Override
	public void depositar(double valor) {
		this.valor+= valor;
	}
	
	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.printf("Cliente: %s%n", this.cliente.getNome());
		System.out.printf("Conta: %s%n", this.numero);
		System.out.printf("Agencia: %s%n", this.agencia);
		System.out.printf("Saldo: %.2f%n", this.valor);
	}
}
