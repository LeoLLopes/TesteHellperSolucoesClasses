package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Cliente;
import entities.ClientePJ;
import entities.ClientePF;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List <Cliente> list = new ArrayList<>();
		
		System.out.println("---- FORMULÁRIO DE CADASTRO DE CLIENTE ----");
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Pessoa Física ou Jurídica? (F(Física) ou J(Jurídica): ");
		char resposta = sc.next().charAt(0);
		
		if(resposta == 'f') {
			System.out.print("CPF: ");
			sc.nextLine();
			String cpf = sc.nextLine();
			System.out.print("Telefone (Somente números): ");
			String telefone = sc.nextLine();
			System.out.print("CEP (Somente números): ");
			String cep = sc.nextLine();
			System.out.print("Logradouro: ");
			String logradouro = sc.nextLine();
			System.out.print("Número: ");
			int numero = sc.nextInt();
			System.out.print("Bairro: ");
			sc.nextLine();
			String bairro = sc.nextLine();
			System.out.print("Cidade: ");
			String cidade = sc.nextLine();
			System.out.print("Estado: ");
			String estado = sc.nextLine();
			
			Cliente cliente = new ClientePF(nome, email, telefone, cep, logradouro, numero, bairro, cidade, estado, cpf);
			list.add(cliente);
			
			System.out.println(cliente);
		
		}
		else {
			System.out.print("CNPJ: ");
			String cnpj = sc.nextLine();
			System.out.print("Telefone (Somente números): ");
			String telefone = sc.nextLine();
			System.out.print("CEP (Somente números): ");
			String cep = sc.nextLine();
			System.out.print("Logradouro: ");
			String logradouro = sc.nextLine();
			System.out.print("Número: ");
			int numero = sc.nextInt();
			System.out.print("Bairro: ");
			sc.nextLine();
			String bairro = sc.nextLine();
			System.out.print("Cidade: ");
			String cidade = sc.nextLine();
			System.out.print("Estado: ");
			String estado = sc.nextLine();
			
			Cliente cliente = new ClientePJ(nome, email, telefone, cep, logradouro, numero, bairro, cidade, estado, cnpj);
			list.add(cliente);
			
			System.out.println(cliente);
		}
		
		
	sc.close();
	}
}
