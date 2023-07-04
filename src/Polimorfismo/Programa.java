package Polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Funcionario;
import Entidades.FuncionarioTerceirizado;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();

		System.out.print("Número de funcionários: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do funcionário " + i + ":");
			System.out.print("Terceirizado(s/n)? ");
			char ch = sc.next().charAt(0); // para ler o caracter s ou n
			System.out.print("Nome: ");
			sc.nextLine();
			String nomeString = sc.nextLine();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por horas: ");
			double valorHoras = sc.nextDouble();

			if (ch == 's') { // verificar se o funcionário e terceirizado 's', se for irá pedir mais esses dados
				System.out.print("Despesa adicional: ");
				double despesaAdicional = sc.nextDouble();
             //Depois de todos os dados instanciar o funcionarioTerceirizado dentro da list
			 list.add(new FuncionarioTerceirizado(nomeString, horas, valorHoras, despesaAdicional));
			}
			//else para se o if não for satisfeito 'n', encerra com os dados que já tem e adiciona a list
			 else {
             list.add(new Funcionario(nomeString, horas, valorHoras));
            }
		}
			System.out.println();
			System.out.println("Pagamentos: ");
		    //percorrer a list
			//para cada funcionário fun na lista list, imprimir na tela os seguintes dados->
			for (Funcionario fun : list) {
				System.out.println(fun.getNome() + " - $ " + String.format("%.2f", fun.Pagamento()));
			}
			
			
			
			
		sc.close();
	}

	}

