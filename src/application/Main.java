package application;

import java.util.Locale;
import java.util.Scanner;
import assigns.Receipt;

public class Main {

	public static void main(String[] args) {
		//Defines
		Locale.setDefault(Locale.US);
		//Variables
		int loop = 0;
		int first, second;
		Receipt receipt = new Receipt();
		//Start of The Program
		PrintProducts();
		
		Scanner sc = new Scanner(System.in);
		for (loop = 0; loop < 100; loop++) {
			
			first = sc.nextInt();
			second = sc.nextInt();
			
			switch(first) {
			case 0:
				loop = 100;
			break;
			case 1:
				receipt.colorfulPens = receipt.colorfulPens + second;
				System.out.printf("Adicionada(s) %d caneta(s)\n", second);
			break;
			case 2:
				receipt.whitePaper = receipt.whitePaper + second;
				System.out.printf("Adicionado(s) %d bloco(s) de papel\n", second);
			break;
			case 3:
				receipt.agenda = receipt.agenda + second;
				System.out.printf("Adicionada(s) %d agenda(s)\n", second);
			break;
			case 4:
				receipt.automaticPencil = receipt.automaticPencil + second;
				System.out.printf("Adicionada(s) %d lapiseira(s)\n", second);
			break;
			case 5:
				receipt.notebook = receipt.notebook + second;
				System.out.printf("Adicionado(s) %d cadeno(s)\n", second);
			break;
			default:
				System.out.println("Opção Inválida");
			break;
			}
			
		}
		sc.close();
		
		System.out.println(receipt.toString());
		
	}

	public static void PrintProducts() {
		System.out.println("Products:");
		System.out.println("1: Canetas Coloridas (R$:2.00)");
		System.out.println("2: Papel Branco x100 (RS:10.00)");
		System.out.println("3: Agenda 2019 (RS:40.00)");
		System.out.println("4: Lapiseira (RS:30.00)");
		System.out.println("5: Caderno 20M (RS:60.00)");
		System.out.println("\nWrite Item number, Quantity\n--> 0 0 To Print");
		System.out.println("------------------------------------\n");
	}
}

