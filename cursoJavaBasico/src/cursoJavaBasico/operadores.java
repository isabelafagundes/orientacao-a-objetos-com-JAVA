package cursoJavaBasico;
import java.util.Scanner;

public class operadores {

	public static void main(String[] args) {
		
		/*
		for(int i = 10; i >= 0; i--) {

			if(i == 0) {
				System.out.println(i);
				System.out.println("Decolar!");
			}else {
				System.out.println(i);
		}
			
		int i = 0;
			
		while(i <= 10) {
				System.out.println(i);
				i++;
		}
			
		do {
				i++;
				System.out.println(i);
		}while(i < 10);
			
		
		String[] lista = {"Isabela", "Sueli", "Camila", "Marcos"};
		
		for(String x:lista) {
			System.out.println(x);
		}
		
		int idade = 18;
		String nome = "Isabela";
		
		if(nome.equals("Iabela")){
			System.out.println("Esta string é igual a Isabela");
			
		}else {
			System.out.println("Esta string não é igual a Isabela");
			
		}
		
		int a = 10, b = 5;
		
		if((a > b) || (b >= a)) {
			System.out.println("É maior");
		}else {
			System.out.println("É menor");
		}
		
		
		int numero = 10;
		
		if(numero == 9) {
			System.out.println("n9");
		}else if(numero == 8) {
			System.out.println("n8");
		}else if(numero == 7) {
			System.out.println("n7");
		}else if(numero == 6) {
			System.out.println("n6");
		}else if(numero == 5) {
			System.out.println("n5");
		}else {
			System.out.println("Não encontrado");
		}

		int ano = 12;
		String mes = "Janeiro";
		
		switch(ano) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			break;
		default:
			System.out.println("Mês incorreto");
			
			break;
		
		
		try {			
			int num = 10/0;
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		int[] numeros = new int[4];
		String[] palavras = new String[2];
		
		numeros[0] = 2;
		numeros[1] = 4;
		numeros[2] = 3;
		
		palavras[0] = "Isa";
		palavras[1] = "Bela";
		System.out.println(numeros[1] + numeros[2]);
		System.out.println(palavras[0] + palavras[1]);
		
		int[] array = new int[10];
		
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0; i < array.length; i++) {
			array[i] = ler.nextInt();
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		 */
		
		int[][] numeros = new int[4][4];
		
		Scanner lerMatriz = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				numeros[i][j] = lerMatriz.nextInt();
			}
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(numeros[i][j] + " ");
			}
		}
		
			
	}
}
