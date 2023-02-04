package cursoJavaBasico;
import java.util.Scanner;

public class mainProgram {
	public static void main(String[] args) {
		System.out.println("Insira seu nome: ");
		Scanner lerNome = new Scanner(System.in);
		String nome = lerNome.next();
		
		System.out.println("Insira sua idade: ");
		Scanner lerIdade = new Scanner(System.in);
		int idade = lerIdade.nextInt();
		
		System.out.println(nome + " tem " + idade + " anos");
		
	}
}
