package entities;

public class ClientePF extends Cliente {
	
	private String cpf;

	public ClientePF(String nome, String email, String telefone, String cep, String logradouro, Integer numero,
			String bairro, String cidade, String estado, String cpf) {
		super(nome, email, telefone, cep, logradouro, numero, bairro, cidade, estado);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		sb.append("Cliente adicionado com sucesso!" + "\n");
		sb.append("\n");
		sb.append("Nome: " + getNome() + "\n");
		sb.append("Email: " + getEmail() + "\n");
		sb.append("CPF: " + formatString(cpf, "###.###.###-##") + "\n");
		sb.append("Telefone: " + formatString(getTelefone(), "(##)#####-####") + "\n");
		sb.append("CEP: " + formatString(getCep(),"#####-###") + "\n");
		sb.append("Logradouro: " + getLogradouro() + "\n");
		sb.append("Número: " + getNumero() + "\n");
		sb.append("Bairro: " + getBairro() + "\n");
		sb.append("Cidade: " + getCidade() + "\n");
		sb.append("Estado: " + getEstado() + "\n");
	return sb.toString();
	}
	
}
