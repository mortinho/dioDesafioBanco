import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas;
	private List<Cliente> clientes;

	public Banco(String nome) {
		this.setNome(nome);
		this.clientes = new ArrayList<Cliente>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public void adicionarCliente(String nome,int cpf) {
		boolean unico = true;
		
		for (Cliente c : clientes)
			if(c.getCpf() == cpf) unico = false;
		if (unico) {
			Cliente cliente = new Cliente(nome, cpf);
			clientes.add(cliente);
			System.out.println("Cliente adicionado com sucesso");
		} else {
			System.out.println("Numero de cpf já cadastrado");
		}
	}
	
	public Cliente pesquisarCliente(int cpf) {
		for (Cliente c : clientes)
			if(c.getCpf() == cpf)
				return c;
		return null;
	}
	
}
