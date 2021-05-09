package entities;

import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class Cliente {
	
	private String nome;
	private String email;
	private String telefone;
	private String cep;
	private String logradouro;
	private Integer numero;
	private String bairro;
	private String cidade;
	private String estado;
	
	public Cliente() {
	}

	public Cliente(String nome, String email, String telefone, String cep, String logradouro,
			Integer numero, String bairro, String cidade, String estado) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	 public static String formatString(String value, String pattern) {
	        MaskFormatter mf;
	        try {
	            mf = new MaskFormatter(pattern);
	            mf.setValueContainsLiteralCharacters(false);
	            return mf.valueToString(value);
	        } catch (ParseException ex) {
	            return value;
	        }
	    }
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		sb.append("Cliente adicionado com sucesso!" + "\n");
		sb.append("\n");
		sb.append("Nome: " + nome + "\n");
		sb.append("Email: " + email + "\n");
		sb.append("Telefone: " + formatString(telefone, "(##)#####-####") + "\n");
		sb.append("CEP: " + formatString(cep,"#####-###") + "\n");
		sb.append("Logradouro: " + logradouro + "\n");
		sb.append("Número: " + numero + "\n");
		sb.append("Bairro: " + bairro + "\n");
		sb.append("Cidade: " + cidade + "\n");
		sb.append("Estado: " + estado + "\n");
	return sb.toString();
	}
}
