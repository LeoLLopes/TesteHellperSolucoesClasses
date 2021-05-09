package entities;

public class ClientePJ extends Cliente{
	
	private String cnpj;

	public ClientePJ(String nome, String email, String telefone, String cep, String logradouro, Integer numero,
			String bairro, String cidade, String estado, String cnpj) {
		super(nome, email, telefone, cep, logradouro, numero, bairro, cidade, estado);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		sb.append("Cliente adicionado com sucesso!" + "\n");
		sb.append("\n");
		sb.append("Nome: " + getNome() + "\n");
		sb.append("Email: " + getEmail() + "\n");
		sb.append("CPF: " + formatString(cnpj, "##.###.###/####-##") + "\n");
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
