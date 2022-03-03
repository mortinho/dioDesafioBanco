
public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco("superbanco");
		banco.adicionarCliente("joao", 1);
		banco.adicionarCliente("jose", 2);
		banco.adicionarCliente("joao", 1);
		ContaCorrente cc1=null,cc2=null;
		
		Cliente atual = banco.pesquisarCliente(2);
		if (atual!=null)
			cc1 = new ContaCorrente(atual);
		
		atual = banco.pesquisarCliente(1);
		if (atual!=null)
			cc2 = new ContaCorrente(atual);
		
		if(cc1!=null&&cc2!=null) {
			cc1.depositar(100);
			cc2.depositar(200);
			
			cc2.transferir(50, cc1);
			cc2.sacar(100);
			cc1.sacar(100);
			cc1.imprimirExtrato();
			cc2.imprimirExtrato();
		}
		
		

	}

}
